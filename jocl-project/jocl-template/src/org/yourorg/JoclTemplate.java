/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorg;

import com.jogamp.opencl.CLCommandQueue;
import com.jogamp.opencl.CLContext;
import com.jogamp.opencl.CLProgram;
import com.jogamp.opencl.util.CLInfo;

/**
 *
 * @author 
 */
public class JoclTemplate {

    public static void main(String[] args) throws Exception {

        // prints OpenCL properties to console
//        new CLInfo().main(args);

        CLContext context = CLContext.create();
        try{
            System.out.println(context);

            CLProgram program = context.createProgram(JoclTemplate.class.getResourceAsStream("KernelTemplate.cl"));
            program.build();

            CLCommandQueue queue = context.getMaxFlopsDevice().createCommandQueue();
            // start here
            
        }finally{
            context.release();
        }

    }
    
}
