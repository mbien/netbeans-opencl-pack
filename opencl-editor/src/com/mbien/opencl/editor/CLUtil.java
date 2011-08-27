/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbien.opencl.editor;

import com.jogamp.opencl.CLDevice;

/**
 *
 * @author mbien
 */
public class CLUtil {

    private CLUtil() {
    }

    /**
     * Returns a clean device name.
     * Some implementations return CPU device names with lots of spaces in it (BIOS formating).
     */
    public static String cleanName(CLDevice device) {
        return device.getName().replaceAll("  ", "");
    }
}
