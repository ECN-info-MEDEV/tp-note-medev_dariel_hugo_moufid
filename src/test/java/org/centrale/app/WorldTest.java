/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.centrale.app;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author darielbezerra
 */
/**
 * Classe de test pour la classe World.
 */
public class WorldTest {
   /**
     * Teste la méthode tourDeJeu en simulant l'entrée utilisateur.
     */
    @Ignore
    @Test
    public void testTourDeJeu() {
        // Créer une instance de World
        World world = new World();

        // Configurer les objets joueur pour le test
        Joueur joueur1 = new Joueur("Joueur 1", "joueur1@gmail.com");
        Joueur joueur2 = new Joueur("Joueur 2", "joueur2@gmail.com");
        joueur1.setGrille(new Grille());
        joueur2.setGrille(new Grille());

        // Simuler l'entrée de l'utilisateur
        String input = "0\n0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Appeler la méthode à tester
        world.tourDeJeu(joueur1, joueur2);


        // Vérifier si le message du tour est correct
        assertEquals("Le message du tour doit être correct", "C'est le tour du " + joueur1.getNom());


        // Réinitialiser l'entrée standard
        System.setIn(System.in);
    }
}
