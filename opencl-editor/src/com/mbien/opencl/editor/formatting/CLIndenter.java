/*
 * Created on Wednesday, August 31 2011 19:27
 */
package com.mbien.opencl.editor.formatting;

import javax.swing.text.BadLocationException;
import org.netbeans.editor.BaseDocument;
import org.netbeans.editor.Utilities;
import org.netbeans.modules.editor.indent.spi.Context;
import org.netbeans.modules.editor.indent.spi.ExtraLock;
import org.netbeans.modules.editor.indent.spi.IndentTask;

/**
 *
 * @author mbien
 */
public class CLIndenter implements IndentTask {
    
    public static final int INDENT = 4;

    private final Context context;

    public CLIndenter(Context context) {
        this.context = context;
    }

    @Override
    public void reindent() throws BadLocationException {

        int caretOffset = context.caretOffset();
        int lineOffset = context.lineStartOffset(caretOffset);

        if (context.isIndent()) {
            BaseDocument doc = (BaseDocument)context.document();

            int start = Utilities.getRowStart(doc, caretOffset-1);
            String lastLine = doc.getText(start, lineOffset - start);
            int lastLineStart = lineStart(lastLine);

            boolean block = endsWith(lastLine, '{');

            int indent = lastLineStart-lastLineStart%INDENT + (block?INDENT:0);

            context.modifyIndent(lineOffset, indent);
        }
    }

    private int lineStart(String line) {
        for (int i = 0; i < line.length(); i++) {
            if(line.charAt(i) != ' ') {
                return i;
            }
        }
        return 0;
    }

    private boolean endsWith(String line, char c) {
        for (int i = line.length()-1; i >= 0; i--) {
            char charAt = line.charAt(i);
            if(Character.isWhitespace(charAt)) {
                continue;
            }else if(charAt == c) {
                return true;
            }else {
                return false;
            }
        }
        return false;
    }

    @Override
    public ExtraLock indentLock() {
        return null;
    }

}
