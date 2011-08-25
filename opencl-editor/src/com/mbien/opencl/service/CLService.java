/*
 * Created on Thursday, August 25 2011 22:46
 */
package com.mbien.opencl.service;

import com.jogamp.opencl.CLPlatform;

/**
 *
 * @author mbien
 */
public interface CLService {

    CLPlatform getDefaultPlatform();
    void setDefaultPlatform(CLPlatform platform);

    CLPlatform[] listCLPlatforms();

    boolean available();

}
