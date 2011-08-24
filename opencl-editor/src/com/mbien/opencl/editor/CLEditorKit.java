/*
 * Created on Wednesday, August 24 2011 23:00
 */
package com.mbien.opencl.editor;

import com.mbien.opencl.editor.file.CLDataObject;
import javax.swing.Action;
import javax.swing.text.TextAction;
import org.netbeans.editor.BaseAction;
import org.netbeans.modules.editor.NbEditorKit;

/**
 *
 * @author mbien
 */
public class CLEditorKit extends NbEditorKit {

    @Override
    protected Action[] createActions() {
        Action[] superActions = super.createActions();

        Action[] actions = new BaseAction[]{
            new ToggleCommentAction("//")
        };

        return TextAction.augmentList(superActions, actions);

    }

    public String getContentType() {
        return CLDataObject.MIME_TYPE;
    }

}
