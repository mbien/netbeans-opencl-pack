/*
 * Created on Friday, September 02 2011 18:52
 */
package com.mbien.opencl.util;

import com.jogamp.opencl.CLDevice;
import com.jogamp.opencl.CLPlatform;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.openide.awt.Mnemonics;
import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;

/**
 * Top component which displays OpenCL properties.
 */
@TopComponent.Description(preferredID = "CLUtilTopComponent", iconBase = "com/mbien/opencl/util/cl.png", persistenceType = TopComponent.PERSISTENCE_NEVER)
@TopComponent.Registration(mode = "editor", openAtStartup = false)
@ActionID(category = "Window", id = "com.mbien.opencl.util.CLUtilTopComponent")
@ActionReferences({
//    @ActionReference(path = "Menu/Window", position = 10),
    @ActionReference(path = "Menu/Tools", position = 10)
})
@TopComponent.OpenActionRegistration(displayName = "#CTL_CLAction", preferredID = "CLUtilTopComponent")
public final class CLUtilTopComponent extends TopComponent {

    private JEditorPane area;

    public CLUtilTopComponent() {
        initComponents();
        filterField.getDocument().addDocumentListener(new DocumentListener() {
            @Override public void insertUpdate(DocumentEvent e) { update(); }
            @Override public void removeUpdate(DocumentEvent e) { update(); }
            @Override public void changedUpdate(DocumentEvent e) { }
        });
        setName(NbBundle.getMessage(CLUtilTopComponent.class, "CTL_CLUtilTopComponent"));
        setToolTipText(NbBundle.getMessage(CLUtilTopComponent.class, "HINT_CLUtilTopComponent"));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        JLabel filterLabel = new JLabel();
        filterField = new JTextField();
        pane = createPane();
        Mnemonics.setLocalizedText(filterLabel, NbBundle.getMessage(CLUtilTopComponent.class, "CLUtilTopComponent.filterLabel.text"));

        filterField.setText(NbBundle.getMessage(CLUtilTopComponent.class, "CLUtilTopComponent.filterField.text")); // NOI18N

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filterLabel)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(filterField, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(243, Short.MAX_VALUE))
            .addComponent(pane, GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(filterLabel)
                    .addComponent(filterField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(pane, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTextField filterField;
    private JScrollPane pane;
    // End of variables declaration//GEN-END:variables


    private JScrollPane createPane() {
        area = new JEditorPane();
        area.setContentType("text/html");
        area.setEditable(false);
        area.setText("loading...");

        SwingUtilities.invokeLater(new Runnable() {
            @Override public void run() {
                update();
            }
        });
        return new JScrollPane(area);
    }

    public void update() {
        area.setText(createOpenCLInfoHTML(filterField.getText().toLowerCase()));
        SwingUtilities.invokeLater(new Runnable() {
            @Override public void run() {
                pane.getViewport().setViewPosition(new Point());
            }
        });
    }

    private String createOpenCLInfoHTML(String token) {

        CLPlatform[] platforms = CLPlatform.listCLPlatforms();

        // platforms
        List<Map<String, String>> platformProperties = new ArrayList<>(64);
        List<Integer> spans = new ArrayList<>();
        for (CLPlatform p : platforms) {
            Map<String, String> properties = p.getProperties();
            platformProperties.add(properties);
            spans.add(p.listCLDevices().length);
        }

        // devices
        ArrayList<Map<String, String>> deviceProperties = new ArrayList<>(128);
        for (CLPlatform platform : platforms) {
            CLDevice[] devices = platform.listCLDevices();
            for (CLDevice device : devices) {
                Map<String, String> properties = device.getProperties();
                deviceProperties.add(properties);
            }
        }

        if(!token.isEmpty()) {
            filterByRow(platformProperties, token);
            filterByRow(deviceProperties, token);
        }

        StringBuilder html = new StringBuilder(10000);
        html.append("<table border=\"1\" width=\"100%\">");
        fillTable(html, platformProperties, spans);
        fillTable(html, deviceProperties);
        html.append("</table>");

        return html.toString();
    }

    private void filterByRow(List<Map<String, String>> columns, String token) {
        for (Iterator<String> iterator = columns.get(0).keySet().iterator(); iterator.hasNext();) {
            String key = iterator.next();
            if("CL_PLATFORM_NAME".equals(key) || "CL_DEVICE_NAME".equals(key)) {
                continue;
            }
            int removed = 0;
            for (Map<String, String> column : columns) {
                if(   !key.toLowerCase().contains(token)
                   && !column.get(key).toLowerCase().contains(token)) {
                    removed++;
                    column.put(key, "<font color='gray'>"+column.get(key)+"</font>");
                }
            }
            if(removed == columns.size()) {
                iterator.remove();
                for (Map<String, String> column : columns) {
                    column.remove(key);
                }
            }
        }

    }

    private void fillTable(StringBuilder table, List<Map<String, String>> properties) {
        ArrayList<Integer> spans = new ArrayList<>(properties.size());
        for (int i = 0; i < properties.size(); i++) {
            spans.add(1);
        }
        fillTable(table, properties, spans);
    }

    private void fillTable(StringBuilder table, List<Map<String, String>> properties, List<Integer> spans) {
        boolean header = true;
        for (String key : properties.get(0).keySet()) {
            table.append("<tr>");
            cell(table, key);

            int i = 0;
            for (Map<String, String> map : properties) {
                cell(table, spans.get(i), map.get(key), header);
                i++;
            }
            table.append("</tr>");
            header = false;
        }
    }

    private void cell(StringBuilder table, String value) {
        table.append("<td>").append(value).append("</td>");
    }

    private void cell(StringBuilder table, int span, String value, boolean header) {
        if (header) {
            table.append("<th colspan=\"").append(span).append("\">").append(value).append("</th>");
        } else {
            table.append("<td colspan=\"").append(span).append("\">").append(value).append("</td>");
        }
    }
}
