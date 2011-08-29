/*
 *  Created on Thursday, August 25 2011 22:46
 */
package com.mbien.opencl.service;

import com.jogamp.opencl.CLPlatform;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import org.openide.util.Exceptions;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author mbien
 */
@ServiceProvider(service=CLService.class)
public class CLServiceImpl implements CLService {

    private static CLPlatform platform;

    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public CLServiceImpl() {

        try{
            CLPlatform.initialize();
            platform = CLPlatform.getDefault();
        }catch(UnsatisfiedLinkError | RuntimeException ex) {
            Exceptions.printStackTrace(ex);
        }
        
    }

    @Override
    public synchronized CLPlatform getDefaultPlatform() {
        return platform;
    }

    @Override
    public synchronized void setDefaultPlatform(CLPlatform platform) {
        CLPlatform old = CLServiceImpl.platform;
        CLServiceImpl.platform = platform;
        propertyChangeSupport.firePropertyChange(PLATFORM, old, platform);
    }

    @Override
    public synchronized CLPlatform[] listCLPlatforms() {
        if(available()) {
            return CLPlatform.listCLPlatforms();
        }else{
            return new CLPlatform[0];
        }
    }

    @Override
    public synchronized boolean available() {
        return platform != null;
    }

    @Override
    public synchronized void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    @Override
    public synchronized void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

}
