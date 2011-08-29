/*
 *  Created on Monday, August 29 2011 05:33
 */
package com.mbien.opencl.editor.completion;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import org.netbeans.api.editor.completion.Completion;
import org.netbeans.spi.editor.completion.CompletionItem;
import org.netbeans.spi.editor.completion.CompletionResultSet;
import org.netbeans.spi.editor.completion.CompletionTask;
import org.netbeans.spi.editor.completion.support.AsyncCompletionQuery;
import org.netbeans.spi.editor.completion.support.AsyncCompletionTask;
import org.netbeans.spi.editor.completion.support.CompletionUtilities;
import org.openide.util.Exceptions;

/**
 *
 * @author mbien
 */
class CLCompletionItem implements CompletionItem {

    private final CLCompletionProvider.CLElementDescriptor content;
    private int carretPosition = 0;
    private String prefix;
    private String leftText;
    private String rightText;
    private String ARGUMENTS_COLOR = "<font color=#b28b00>";
    private String BUILD_IN_VAR_COLOR = "<font color=#ce7b00>";
    private String KEYWORD_COLOR = "<font color=#000099>";
    private int priority;

    public CLCompletionItem(CLCompletionProvider.CLElementDescriptor content, String prefix, int carretPosition) {
        this.content = content;
        this.prefix = prefix;
        this.carretPosition = carretPosition;
        leftText = createLeftText();
        rightText = content.type;
        // low prority is first in completion list
        priority = 10;
    }

    private String createLeftText() {
        StringBuilder text = new StringBuilder();
//        switch (content.category) {
//            case TYPE:
//            case KEYWORD:
//            case QUALIFIER:
//                text.append(KEYWORD_COLOR);
//                break;
//            case BUILD_IN_VAR:
        text.append(BUILD_IN_VAR_COLOR);
//                break;
//        }
        text.append("<b>");
        text.append(content.token);
        text.append("</b></font>");
//        if (content.arguments != null) {
//            text.append(ARGUMENTS_COLOR);
//            text.append(content.arguments);
//            text.append("</font>");
//        }
        return text.toString();
    }

    public void defaultAction(JTextComponent component) {
        Completion.get().hideAll();
        // replace prefix with content.token
        try {
            component.getDocument().remove(carretPosition - prefix.length(), prefix.length());
            component.getDocument().insertString(carretPosition - prefix.length(), content.token, null);
        } catch (BadLocationException e) {
            Exceptions.printStackTrace(e);
        }
    }

    public void processKeyEvent(KeyEvent evt) {
        
        // hide
        switch(evt.getKeyCode()) {
            case KeyEvent.VK_SPACE:
                if(evt.isControlDown()) {break;}
            case KeyEvent.VK_TAB:
            case KeyEvent.VK_BACK_SPACE:
                if(prefix.isEmpty()) {
                    Completion.get().hideAll();
                }
        }

        // TODO: if "." then Completion.get().showCompletion()... but this does not make much sense without AST
    }

    public int getPreferredWidth(Graphics g, Font defaultFont) {
        return CompletionUtilities.getPreferredWidth(leftText, rightText, g, defaultFont);
    }

    public void render(Graphics g, Font defaultFont, Color defaultColor, Color backgroundColor, int width, int height, boolean selected) {
        CompletionUtilities.renderHtml(null, leftText, rightText, g, defaultFont, defaultColor, width, height, selected);
    }

    public CompletionTask createDocumentationTask() {
        if (content.doc == null) {
            return null;
        }
        return new AsyncCompletionTask(new AsyncCompletionQuery() {
            protected void query(CompletionResultSet resultSet, Document document, int i) {
                resultSet.setDocumentation(new CLDocItem(content.token, content));
                resultSet.finish();
            }
        });
    }

    public CompletionTask createToolTipTask() {
        return null;
    }

    public boolean instantSubstitution(JTextComponent component) {
        defaultAction(component);
        return true;
    }

    public int getSortPriority() {
        return priority;
    }

    public CharSequence getSortText() {
        return content.token;
    }

    public CharSequence getInsertPrefix() {
        return prefix;
    }

}
