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
     * Test of setElements method, of class Grille.
     */
    @Test
    public void testSetElements() {
        System.out.println("setElements");
        int val = 0;
        int x = 0;
        int y = 0;
        Grille instance = new Grille();
        instance.setElements(val, x, y);
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
        int expResult = 0;
        int result = instance.getTaille();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getElements method, of class Grille.
     */
    @Test
    public void testGetElements() {
        System.out.println("getElements");
        Grille instance = new Grille();
        int[][] expResult = null;
        int[][] result = instance.getElements();
        assertArrayEquals(expResult, result);
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

    /**
     * Test of affichage method, of class Grille.
     */
    @Test
    public void testAffichage() {
        System.out.println("affichage");
        Grille instance = new Grille();
        instance.affichage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of affichageCache method, of class Grille.
     */
    @Test
    public void testAffichageCache() {
        System.out.println("affichageCache");
        Grille instance = new Grille();
        instance.affichageCache();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
