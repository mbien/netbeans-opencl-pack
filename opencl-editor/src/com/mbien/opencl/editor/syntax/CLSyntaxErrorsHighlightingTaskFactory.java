/*
 * Created on Tuesday, August 23 2011 02:33
 */
package com.mbien.opencl.editor.syntax;
import com.mbien.opencl.service.CLService;
import java.util.Collection;
import java.util.Collections;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.spi.SchedulerTask;
import org.netbeans.modules.parsing.spi.TaskFactory;
import org.openide.util.Lookup;

/**
 *
 * @author mbien
 */
public class CLSyntaxErrorsHighlightingTaskFactory extends TaskFactory {

    public Collection<? extends SchedulerTask> create(Snapshot snapshot) {
        if(Lookup.getDefault().lookup(CLService.class).available()) {
            // disable syntax checks if we have full compiler support
            return Collections.emptyList();
        }else{
            return Collections.singleton(new CLSyntaxErrorsHighlightingTask());
        }
    }

}