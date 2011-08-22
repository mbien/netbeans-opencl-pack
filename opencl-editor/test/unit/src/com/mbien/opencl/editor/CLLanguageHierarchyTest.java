/*
 * Created on Monday, August 22 2011 04:22
 */
package com.mbien.opencl.editor;

import java.util.Collection;
import org.junit.Test;

import static org.junit.Assert.*;
import static java.lang.System.*;

/**
 *
 * @author mbien
 */
public class CLLanguageHierarchyTest {


    @Test
    public void tokenIDReadTest() {

        CLLanguageHierarchy hierarchy = new CLLanguageHierarchy();
        Collection<CLTokenID> tokens = hierarchy.createTokenIds();

        assertNotNull(tokens);
        assertFalse(tokens.isEmpty());
        for (CLTokenID token : tokens) {
            out.println(token);
        }
    }
}
