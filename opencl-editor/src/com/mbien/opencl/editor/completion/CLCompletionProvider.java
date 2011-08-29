/*
 * Created on Sunday, August 28 2011 21:52
 */
package com.mbien.opencl.editor.completion;

import com.mbien.opencl.editor.file.CLDataObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;
import org.netbeans.api.editor.mimelookup.MimeRegistration;
import org.netbeans.editor.BaseDocument;
import org.netbeans.spi.editor.completion.CompletionProvider;
import org.netbeans.spi.editor.completion.CompletionResultSet;
import org.netbeans.spi.editor.completion.CompletionTask;
import org.netbeans.spi.editor.completion.support.AsyncCompletionQuery;
import org.netbeans.spi.editor.completion.support.AsyncCompletionTask;
import org.openide.util.Exceptions;

/**
 *
 * @author mbien
 */
@MimeRegistration(mimeType = CLDataObject.MIME_TYPE, service = CompletionProvider.class)
public class CLCompletionProvider implements CompletionProvider {


    @Override
    public CompletionTask createTask(int queryType, JTextComponent component) {
        return new AsyncCompletionTask(new CLCompletionQuery(), component);
    }

    @Override
    public int getAutoQueryTypes(JTextComponent component, String typedText) {
        return 0;
    }

    private static class CLCompletionQuery extends AsyncCompletionQuery {

        private static final List<CLElementDescriptor> items = new ArrayList<>(1024);

        @Override
        protected void query(CompletionResultSet resultSet, Document doc, int caretOffset) {
            fillResultset(resultSet, doc, caretOffset);
            resultSet.finish();
        }

        private void fillResultset(CompletionResultSet resultSet, Document doc, int caretOffset) {

            Element paragraph = ((BaseDocument) doc).getParagraphElement(caretOffset);
            String prefix;
            try {
                prefix = doc.getText(paragraph.getStartOffset(), caretOffset - paragraph.getStartOffset());
                prefix = prefix.replaceAll(".*?([\\w-\"]*)$", "$1");
            } catch (BadLocationException ex) {
                Exceptions.printStackTrace(ex);
                prefix = "";
            }

            synchronized(items) {
                if(items.isEmpty()) {
                    try {
                        loadItems();
                    } catch (IOException ex) {
                        Exceptions.printStackTrace(ex);
                    }
                }

                for (CLElementDescriptor item : items) {
                    if (item.token.regionMatches(true, 0, prefix, 0, prefix.length())) {
                        resultSet.addItem(new CLCompletionItem(item, prefix, caretOffset));
                    }
                }
            }

        }

        private void loadItems() throws IOException {
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(getClass().getResourceAsStream("builtin-functions")))) {
                for (;;) {
                    String line = reader.readLine();
                    if (line == null)
                        return;
                    String[] split = line.split("=");
                    items.add(new CLElementDescriptor(split[0], "built-in function", split[1]));
                }
            }
        }

    }

    static class CLElementDescriptor {

        public final String token;
        public final String type;
        public final String doc;

        public final int category;

        public CLElementDescriptor(String token, String type, String doc) {
            this.token = token;
            this.doc = doc;
            this.type = type;
            this.category = 0;
        }


    }
}
