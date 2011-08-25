/*
 *  Created on Thursday, August 25 2011 22:46
 */
package com.mbien.opencl.service;

import com.jogamp.opencl.CLPlatform;
import org.openide.util.Exceptions;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author mbien
 */
@ServiceProvider(service=CLService.class)
public class CLServiceImpl implements CLService {

    private CLPlatform platform;

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
        this.platform = platform;
    }

    @Override
    public synchronized CLPlatform[] listCLPlatforms() {
        if(available()) {
            return CLPlatform.listCLPlatforms();
        }else{
            return new CLPlatform[0];
        }
    }

    public synchronized boolean available() {
        return platform != null;
    }

}
