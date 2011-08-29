/*
 * Created on Thursday, August 25 2011 22:46
 */
package com.mbien.opencl.service;

import com.jogamp.opencl.CLPlatform;
import java.beans.PropertyChangeListener;

/**
 *
 * @author mbien
 */
public interface CLService {

    public static final String PLATFORM = "platform";

    CLPlatform getDefaultPlatform();
    void setDefaultPlatform(CLPlatform platform);

    CLPlatform[] listCLPlatforms();

    boolean available();

    void addPropertyChangeListener(PropertyChangeListener listener);
    void removePropertyChangeListener(PropertyChangeListener listener);

}
