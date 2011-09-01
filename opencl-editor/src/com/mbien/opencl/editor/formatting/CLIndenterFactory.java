/*
 * Created on Wednesday, August 31 2011 19:29
 */
package com.mbien.opencl.editor.formatting;

import org.netbeans.modules.editor.indent.spi.Context;
import org.netbeans.modules.editor.indent.spi.IndentTask;

/**
 *
 * @author mbien
 */
public class CLIndenterFactory implements IndentTask.Factory {

    @Override
    public IndentTask createTask(Context context) {
        return new CLIndenter(context);
    }

}
