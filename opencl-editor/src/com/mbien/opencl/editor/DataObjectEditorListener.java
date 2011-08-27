/*
 * Created on Saturday, August 27 2011 02:36
 */
package com.mbien.opencl.editor;

import javax.swing.event.DocumentListener;
import org.openide.loaders.DataObject;

/**
 *
 * @author mbien
 */
public interface DataObjectEditorListener<D extends DataObject> extends DocumentListener {
       
    abstract void opened(D dao);
    abstract void closed(D dao);
    
}
