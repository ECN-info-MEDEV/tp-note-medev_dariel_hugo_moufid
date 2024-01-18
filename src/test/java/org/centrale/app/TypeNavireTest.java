/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.centrale.app;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author darielbezerra
 */
public class TypeNavireTest {
    
    public TypeNavireTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of values method, of class TypeNavire.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        TypeNavire[] expResult = null;
        TypeNavire[] result = TypeNavire.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class TypeNavire.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        TypeNavire expResult = null;
        TypeNavire result = TypeNavire.valueOf(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
