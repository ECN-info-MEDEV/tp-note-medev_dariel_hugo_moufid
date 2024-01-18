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
public class JoueurTest {
    
    public JoueurTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getNom method, of class Joueur.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Joueur instance = new Joueur();
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMail method, of class Joueur.
     */
    @Test
    public void testGetMail() {
        System.out.println("getMail");
        Joueur instance = new Joueur();
        String expResult = "";
        String result = instance.getMail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNavires method, of class Joueur.
     */
    @Test
    public void testGetNavires() {
        System.out.println("getNavires");
        Joueur instance = new Joueur();
        Navire[] expResult = null;
        Navire[] result = instance.getNavires();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrille method, of class Joueur.
     */
    @Test
    public void testGetGrille() {
        System.out.println("getGrille");
        Joueur instance = new Joueur();
        Grille expResult = null;
        Grille result = instance.getGrille();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Joueur.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Joueur instance = new Joueur();
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMail method, of class Joueur.
     */
    @Test
    public void testSetMail() {
        System.out.println("setMail");
        String mail = "";
        Joueur instance = new Joueur();
        instance.setMail(mail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNavires method, of class Joueur.
     */
    @Test
    public void testSetNavires() {
        System.out.println("setNavires");
        Navire[] navires = null;
        Joueur instance = new Joueur();
        instance.setNavires(navires);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGrille method, of class Joueur.
     */
    @Test
    public void testSetGrille() {
        System.out.println("setGrille");
        Grille grille = null;
        Joueur instance = new Joueur();
        instance.setGrille(grille);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of attaque method, of class Joueur.
     */
    @Test
    public void testAttaque() {
        System.out.println("attaque");
        Joueur adversaire = null;
        int x = 0;
        int y = 0;
        Joueur instance = new Joueur();
        instance.attaque(adversaire, x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
