/*
 * Created on Monday, August 29 2011 05:33
 */
package com.mbien.opencl.editor.completion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.Action;
import org.netbeans.spi.editor.completion.CompletionDocumentation;
import org.openide.util.Exceptions;

/**
 *
 * @author mbien
 */
class CLDocItem implements CompletionDocumentation {

    private String doc;
    private String text;

    public CLDocItem(String item, CLCompletionProvider.CLElementDescriptor content) {
        doc = content.doc;
        StringBuilder sb = new StringBuilder();
        sb.append("<code>");
        if (content.type != null) {
            sb.append(content.type);
            sb.append(" ");
        }
        sb.append("<b>");
        sb.append(item);
        sb.append("</b>");
//            if(content.arguments != null) {
//                sb.append(content.arguments);
//            }
        sb.append("</code><p>");
        try{
            downloadDoc(sb);
        }catch(IOException ex) {
//            sb.append("<a href='"+getURL()+"'>"+getURL()+"</a>");
            Exceptions.printStackTrace(ex);
        }
        sb.append("</p>");
        text = sb.toString();
    }

    //FIXME this is a hack, but we can't parse the doc since it contains invalid xhtml
    private void downloadDoc(StringBuilder sb) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(getURL().openStream()))) {
            boolean skip = false;
            for (;;) {
                String line = reader.readLine();
                if (line == null)
                    break;
                if(line.contains("<style") || line.contains("<head")) {
                    skip = true;
                    continue;
                }else if(line.contains("</style>") || line.contains("</head>")) {
                    skip = false;
                    continue;
                }

                if(!skip && !line.startsWith("<?xml")
                         && !line.startsWith("<!DOCTYPE")
                         && !line.contains("<h1>")
                         && !line.contains("<meta")
                         && !line.contains("<title")) {
                    sb.append(line);
                }
            }
        }
    }

    public String getText() {
        return text;
    }

    public URL getURL() {
        try {
            return new URL("http://www.khronos.org/registry/cl/sdk/1.1/docs/man/xhtml/"+doc+".html");
        } catch (MalformedURLException ex) {
            return null;
        }
    }

    public CompletionDocumentation resolveLink(String link) {
        return null;
    }

    public Action getGotoSourceAction() {
        return null;
    }

}
