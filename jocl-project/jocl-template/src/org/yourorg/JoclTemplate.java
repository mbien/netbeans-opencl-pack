package org.yourorg;

import com.jogamp.opencl.CLCommandQueue;
import com.jogamp.opencl.CLContext;
import com.jogamp.opencl.CLProgram;

/**
 *
 * @author yourname
 */
public class JoclTemplate {

    public static void main(String[] args) throws Exception {

        // prints OpenCL properties to console
        com.jogamp.opencl.util.CLInfo.main(args);

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
