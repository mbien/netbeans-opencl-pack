/*
 * Created on Thursday, August 25 2011 00:29
 */
package com.mbien.opencl.editor.compiler;

import com.jogamp.opencl.CLContext;
import com.jogamp.opencl.CLDevice;
import com.jogamp.opencl.CLException.CLBuildProgramFailureException;
import com.jogamp.opencl.CLPlatform;
import com.jogamp.opencl.CLProgram;
import com.mbien.opencl.editor.file.CLDataObject;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.cookies.EditorCookie;
import org.openide.util.Exceptions;
import org.openide.util.actions.Presenter;
import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;
import org.openide.windows.IOColorLines;
import java.io.IOException;
import java.awt.Color;

import static java.awt.Color.*;

/**
 *
 * @author mbien
 */
public class CompilerActions {

    private final static Color DARK_GREEN = new Color(0, 153, 0);

    private CompilerActions() { }

    @ActionID(category = "CLPlatform", id = "com.mbien.opencl.CLCompileAction")
    @ActionRegistration(displayName = "Compile Kernel", iconBase = "com/mbien/opencl/editor/compiler/clbuild.png")
    @ActionReferences({
        @ActionReference(path = "Editors/text/x-opencl/Toolbars/Default", position = 20400),
        @ActionReference(path = "Loaders/text/x-opencl/Actions", position = 810)
    })
    public static class CompileAction implements ActionListener {

        private final List<CLDataObject> daos;
        private final InputOutput io;

        public CompileAction(List<CLDataObject> context) {
            this.daos = context;
            this.io = IOProvider.getDefault().getIO("OpenCL Compiler Output", false);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            compile(daos);
        }

        private String getText(CLDataObject dao) {
            EditorCookie cookie = dao.getCookie(EditorCookie.class);
            StyledDocument document = cookie.getDocument();
            try {
                return document.getText(0, document.getLength());
            } catch (BadLocationException ex) {
                Exceptions.printStackTrace(ex);
                return "";
            }
        }

        private void compile(List<CLDataObject> daos) {

            // TODO
            CLPlatform platform = CLPlatform.getDefault();

            println("\nCompiling with "+platform.getName() +" Platform", GRAY);

            CLContext context = CLContext.create(platform);

            try{
                String[] sources = new String[daos.size()];
                for (int i = 0; i < daos.size(); i++) {
                    sources[i] = getText(daos.get(i));
                }

                CLProgram program = context.createProgram(sources);

                long delta = System.currentTimeMillis();
                boolean success = true;
                try{
                    program.build();
                }catch(CLBuildProgramFailureException ignore) {
                    success = false;
                }
                delta = System.currentTimeMillis()-delta;

                CLDevice[] devices = context.getDevices();
                for (CLDevice device : devices) {
                    println("for "+cleanName(device), GRAY);

                    String log = program.getBuildLog(device);
                    if(log.length() > 0) {
                        println(log, BLACK);
                    }
                }
                println(delta+"ms", GRAY);

                if(success) {
                    println("success", DARK_GREEN);
                }else{
                    println("compilation failed", RED);
                }
                
            }finally{
                context.release();
            }

            io.getOut().close();

        }

        private void println(String line, Color color) {
            try {
                IOColorLines.println(io, line, color);
            } catch (IOException ignore) {
                io.getOut().print(line);
            }
        }

        /**
         * Returns a clean device name.
         * Some implementations return CPU device names with lots of spaces in it (BIOS formating).
         */
        private String cleanName(CLDevice device) {
            return device.getName().replaceAll("  ", "");
        }
    }

    @ActionID(category = "CLPlatform", id = "com.mbien.opencl.CLPlatformAction")
    @ActionRegistration(displayName = "")
    @ActionReference(path = "Editors/text/x-opencl/Toolbars/Default", position = 20300)
    public static class CLPlatformAction extends AbstractAction implements Presenter.Toolbar {
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO
        }

        @Override
        public Component getToolbarPresenter() {
            CLPlatform[] platforms = CLPlatform.listCLPlatforms();
            JComboBox<CLPlatform> box = new JComboBox<>(platforms);
            box.setRenderer(new DefaultListCellRenderer() {

                @Override
                public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                    Component component = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                    CLPlatform platform = (CLPlatform)value;
                    setText(platform.getName());
                    return component;
                }
                
            });
            box.addActionListener(this);
            box.setPreferredSize(new Dimension(150, box.getPreferredSize().height));
            box.setSelectedItem(CLPlatform.getDefault());
            return box;
        }
    }


}