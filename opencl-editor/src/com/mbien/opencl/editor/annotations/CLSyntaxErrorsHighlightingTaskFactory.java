/*
 * Created on Tuesday, August 23 2011 02:33
 */
package com.mbien.opencl.editor.annotations;
import java.util.Collection;
import java.util.Collections;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.spi.SchedulerTask;
import org.netbeans.modules.parsing.spi.TaskFactory;

/**
 *
 * @author mbien
 */
public class CLSyntaxErrorsHighlightingTaskFactory extends TaskFactory {

    public Collection<? extends SchedulerTask> create(Snapshot snapshot) {
        return Collections.singleton(new CLSyntaxErrorsHighlightingTask());
    }

}