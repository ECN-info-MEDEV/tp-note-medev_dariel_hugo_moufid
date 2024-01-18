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
 * @author hugoc
 */
public class GrilleTest {
    
    public GrilleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setTaille method, of class Grille.
     */
    @Test
    public void testSetTaille() {
        System.out.println("setTaille");
        int t = 0;
        Grille instance = new Grille();
        instance.setTaille(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaille method, of class Grille.
     */
    @Test
    public void testGetTaille() {
        System.out.println("getTaille");
        Grille instance = new Grille();
        Integer expResult = null;
        Integer result = instance.getTaille();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of placement method, of class Grille.
     */
    @Test
    public void testPlacement() {
        System.out.println("placement");
        Grille instance = new Grille();
        instance.placement();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
