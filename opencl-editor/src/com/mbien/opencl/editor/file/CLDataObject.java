/*
 * Created on Monday, August 22 2011 04:11
 */
package com.mbien.opencl.editor.file;

import com.mbien.opencl.editor.DataObjectEditorListener;
import com.mbien.opencl.editor.compiler.CLCompilerMessageAnnotationTask;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.StyledDocument;
import org.openide.cookies.EditorCookie;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataNode;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.loaders.MultiFileLoader;
import org.openide.nodes.CookieSet;
import org.openide.nodes.Node;
import org.openide.nodes.Children;
import org.openide.text.CloneableEditorSupport;
import org.openide.util.Lookup;
import org.openide.text.DataEditorSupport;
import org.openide.util.Exceptions;

/**
 * @author mbien
 */
public class CLDataObject extends MultiDataObject {

    public static final String MIME_TYPE = "text/x-opencl";

    public CLDataObject(FileObject pf, MultiFileLoader loader) throws DataObjectExistsException, IOException {
        super(pf, loader);
        CookieSet cookies = getCookieSet();
        CloneableEditorSupport support = DataEditorSupport.create(this, getPrimaryEntry(), cookies);
        cookies.add((Node.Cookie) support);
        
        final DataObjectEditorListener<CLDataObject> listener = new CLCompilerMessageAnnotationTask();

        support.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent event) {
                if ("document".equals(event.getPropertyName())) {
                    if (event.getNewValue() != null) {
                        ((Document) event.getNewValue()).addDocumentListener(listener);
                        listener.opened(CLDataObject.this);
                    } else if (event.getOldValue() != null) {
                        ((Document) event.getOldValue()).removeDocumentListener(listener);
                        listener.closed(CLDataObject.this);
                    }
                }
            }
        });
    }

    @Override
    protected Node createNodeDelegate() {
        return new DataNode(this, Children.LEAF, getLookup());
    }

    @Override
    public Lookup getLookup() {
        return getCookieSet().getLookup();
    }

    public String getText() {

        EditorCookie cookie = getCookie(EditorCookie.class);
        StyledDocument document = cookie.getDocument();
        try {
            return document.getText(0, document.getLength());
        } catch (BadLocationException ex) {
            Exceptions.printStackTrace(ex);
            return "";
        }
        
    }
}
