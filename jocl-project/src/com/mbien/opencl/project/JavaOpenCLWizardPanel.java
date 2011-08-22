/*
 * Created on Monday, August 22 2011 17:01
 */
package com.mbien.opencl.project;

import java.awt.Component;
import java.util.HashSet;
import java.util.Set;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.openide.WizardDescriptor;
import org.openide.WizardValidationException;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;

/**
 * Panel just asking for basic info.
 * @author mbien
 */
public class JavaOpenCLWizardPanel implements WizardDescriptor.Panel, WizardDescriptor.ValidatingPanel, WizardDescriptor.FinishablePanel {

    private WizardDescriptor wizardDescriptor;
    private JavaOpenCLPanelVisual component;
    private final Set<ChangeListener> listeners = new HashSet<ChangeListener>(1); // or can use ChangeSupport in NB 6.0

    public JavaOpenCLWizardPanel() {
    }

    @Override
    public Component getComponent() {
        if (component == null) {
            component = new JavaOpenCLPanelVisual(this);
            component.setName(NbBundle.getMessage(JavaOpenCLWizardPanel.class, "LBL_CreateProjectStep"));
        }
        return component;
    }

    @Override
    public HelpCtx getHelp() {
        return new HelpCtx(JavaOpenCLWizardPanel.class);
    }

    @Override
    public boolean isValid() {
        getComponent();
        return component.valid(wizardDescriptor);
    }

    @Override
    public final void addChangeListener(ChangeListener l) {
        synchronized (listeners) {
            listeners.add(l);
        }
    }

    @Override
    public final void removeChangeListener(ChangeListener l) {
        synchronized (listeners) {
            listeners.remove(l);
        }
    }

    protected final void fireChangeEvent() {
        Set<ChangeListener> ls;
        synchronized (listeners) {
            ls = new HashSet<ChangeListener>(listeners);
        }
        ChangeEvent ev = new ChangeEvent(this);
        for (ChangeListener l : ls) {
            l.stateChanged(ev);
        }
    }

    @Override
    public void readSettings(Object settings) {
        wizardDescriptor = (WizardDescriptor) settings;
        component.read(wizardDescriptor);
    }

    @Override
    public void storeSettings(Object settings) {
        WizardDescriptor d = (WizardDescriptor) settings;
        component.store(d);
    }

    @Override
    public boolean isFinishPanel() {
        return true;
    }

    @Override
    public void validate() throws WizardValidationException {
        getComponent();
        component.validate(wizardDescriptor);
    }
}
