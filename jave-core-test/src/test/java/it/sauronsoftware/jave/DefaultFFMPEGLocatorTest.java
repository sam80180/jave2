/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sauronsoftware.jave;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author a.schild
 */
public class DefaultFFMPEGLocatorTest {
    
    public DefaultFFMPEGLocatorTest() {
    }

    @Test
    public void testGetFFMPEGExecutablePath() {
        // TODO review the generated test code and remove the default call to fail.
        DefaultFFMPEGLocator locator= new  DefaultFFMPEGLocator();
        String exePath= locator.getFFMPEGExecutablePath();
        fail("The test case is a prototype.");
    }
    
}