/*
 * Created on Saturday, August 27 2011 00:41
 */
package com.mbien.opencl.editor.compiler;

import com.jogamp.opencl.CLContext;
import com.jogamp.opencl.CLDevice;
import com.jogamp.opencl.CLException.CLBuildProgramFailureException;
import com.jogamp.opencl.CLPlatform;
import com.jogamp.opencl.CLProgram;
import com.mbien.opencl.editor.CLUtil;
import com.mbien.opencl.editor.DataObjectEditorListener;
import com.mbien.opencl.editor.annotation.CompilerAnnotation.AnnotationType;
import com.mbien.opencl.editor.annotation.CompilerAnnotations;
import com.mbien.opencl.editor.compiler.CompilerMessage.KIND;
import com.mbien.opencl.editor.file.CLDataObject;
import com.mbien.opencl.service.CLService;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.swing.event.DocumentEvent;
import org.openide.util.Lookup;
import org.openide.util.RequestProcessor;

/**
 *
 * @author mbien
 */
public class CLCompilerMessageAnnotationTask implements DataObjectEditorListener<CLDataObject> {

    private final static RequestProcessor pool = new RequestProcessor("cl-compiler");
    
    private int compileDelay = 500;
    private CLDataObject dao;

    public CLCompilerMessageAnnotationTask() {
        getCLService().addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent event) {
                if(CLService.PLATFORM.equals(event.getPropertyName())) {
                    update();
                }
            }
        });
    }

    private static class TaskImpl implements Runnable {

        private final CLDataObject dao;

        private TaskImpl(CLDataObject dao) {
            this.dao = dao;
        }

        @Override
        public void run() {
            
            CLPlatform platform = getCLService().getDefaultPlatform();
            if(platform == null) {
                return;
            }
            
            CLContext context = CLContext.create(platform);
            
            try{
                String source = dao.getText();
                CLProgram program = context.createProgram(source);
                
                try{
                    program.build();
                }catch(CLBuildProgramFailureException ignore) { }
                
                CompilerAnnotations.removeAnnotations(dao);
                
                CLDevice[] devices = context.getDevices();
                for (CLDevice device : devices) {
                    String log = program.getBuildLog(device);
                    annotate(device, CompilerMessage.parse(device, log));
                }
                
            }finally{
                context.release();
            }
            
        }

        private void annotate(CLDevice device, List<CompilerMessage> list) {
            
            Map<String, List<CompilerMessage>> mergeMap = new HashMap<>();
            for (CompilerMessage msg : list) {
                AnnotationType type = getType(msg);
                String key = type.toString()+msg.getLine();
                List<CompilerMessage> mapped = mergeMap.get(key);
                if(mapped == null) {
                    mapped = new ArrayList<>();
                    mergeMap.put(key, mapped);
                }
                mapped.add(msg);
            }
            
            // merge messages which are on the same line to one annotaiton.
            for (Map.Entry<String, List<CompilerMessage>> entry : mergeMap.entrySet()) {
                String text = createAnnotationText(device, entry.getValue());
                CompilerMessage msg = entry.getValue().get(0);
                CompilerAnnotations.addAnnotation(dao, getType(msg), text, msg.getLine());
            }
            
        }

        private String createAnnotationText(CLDevice device, List<CompilerMessage> messages) {
            StringBuilder sb = new StringBuilder();
            sb.append(device.getPlatform().getName()).append(" (");
            sb.append(CLUtil.cleanName(device)).append(")");
            for (CompilerMessage msg : messages) {
                sb.append("\n").append(msg.getMsg());
            }
            return sb.toString();
        }

        private AnnotationType getType(CompilerMessage msg) {
            if(msg.getKind().equals(KIND.ERROR)) {
                return AnnotationType.ERROR;
            }else{
                return AnnotationType.WARNING;
            }
        }
    }

    private static CLService getCLService() {
        return Lookup.getDefault().lookup(CLService.class);
    }

    private void update() {
        CLDataObject obj = dao;
        if (obj != null) {
            RequestProcessor.Task task = pool.create(new TaskImpl(obj));
            pool.schedule(task, compileDelay, TimeUnit.MILLISECONDS);
        }
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        update();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        update();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        update();
    }

    @Override
    public void opened(CLDataObject dao) {
        this.dao = dao;
        update();
    }

    @Override
    public void closed(CLDataObject dao) {
        this.dao = null;
    }
}
