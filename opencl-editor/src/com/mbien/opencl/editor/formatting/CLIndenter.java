/*
 * Created on Wednesday, August 31 2011 19:27
 */
package com.mbien.opencl.editor.formatting;

import javax.swing.text.BadLocationException;
import org.netbeans.modules.editor.indent.api.IndentUtils;
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

        if (context.isIndent()) {

            int caretOffset = context.caretOffset();
            int lineOffset = context.lineStartOffset(caretOffset);
            
            if (lineOffset > 0) {
                int lastLineOffset = context.lineStartOffset(lineOffset-1);
                int lastLineIndent = context.lineIndent(lastLineOffset);
                String lastLine = context.document().getText(lastLineOffset, lineOffset-lastLineOffset);
                boolean block = isBlockOpener(lastLine);
                
                int indent=lastLineIndent;
                if (block) indent += IndentUtils.indentLevelSize(context.document());
                
                context.modifyIndent(lineOffset, indent);
            }
        }
    }

    private boolean isBlockOpener(String line) {
        for (int i = line.length()-1; i >= 0; i--) {
            char charAt = line.charAt(i);
            if(Character.isWhitespace(charAt)) {
                continue;
            }else if(charAt == '{' || charAt == '(' || charAt == '[') {
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
