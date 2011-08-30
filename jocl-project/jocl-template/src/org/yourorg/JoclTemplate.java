package org.yourorg;

import com.jogamp.opencl.CLBuffer;
import com.jogamp.opencl.CLCommandQueue;
import com.jogamp.opencl.CLContext;
import com.jogamp.opencl.CLKernel;
import com.jogamp.opencl.CLProgram;
import com.jogamp.opencl.CLWork.CLWork1D;
import java.nio.IntBuffer;

/**
 *
 * @author yourname
 */
public class JoclTemplate {

    public static void main(String[] args) throws Exception {

        // prints OpenCL properties to console
//        com.jogamp.opencl.util.CLInfo.main(args);

        CLContext context = CLContext.create();
        try{
            System.out.println(context);

            CLProgram program = context.createProgram(JoclTemplate.class.getResourceAsStream("KernelTemplate.cl"));
            program.build();

            CLCommandQueue queue = context.getMaxFlopsDevice().createCommandQueue();

            int size = 16;
            CLBuffer<IntBuffer> buffer = context.createIntBuffer(size);
            CLKernel kernel = program.createCLKernel("fill", buffer, size, 42);
            CLWork1D work = CLWork1D.create1D(kernel).setWorkSize(size);

            queue.putWork(work);
            queue.putReadBuffer(buffer, true);

            IntBuffer ib = buffer.getBuffer();
            while(ib.hasRemaining()) {
                int value = ib.get();
                if(value != 42)
                    throw new RuntimeException("unexpected value: "+value);
            }

        }finally{
            context.release();
        }

    }
    
}
