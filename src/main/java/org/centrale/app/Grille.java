package org.centrale.app;

import java.util.Scanner;

/**
 * Représente une grille de jeu pour la bataille navale.
 */
public class Grille {
    private int taille;
    private Integer[][] elements;

    /**
     * Constructeur prenant la taille de la grille en paramètre.
     *
     * @param t Taille de la grille
     */
    public Grille(int t) {
        this.taille = t;
        this.elements = new Integer[t][t];
    }

    /**
     * Constructeur de copie prenant un objet Grille en paramètre.
     *
     * @param g Objet de type Grille à copier
     */
    public Grille(Grille g) {
        this.taille = g.taille;
        // Copier les éléments de la grille
        this.elements = new Integer[g.taille][g.taille];
        for (int i = 0; i < g.taille; i++) {
            for (int j = 0; j < g.taille; j++) {
                this.elements[i][j] = g.elements[i][j];
            }
        }
    }

    /**
     * Constructeur sans paramètres, initialise une grille par défaut de taille 5x5.
     */
    public Grille() {
        this.taille = 5;
        this.elements = new Integer[5][5];
    }

    // Autres méthodes et fonctions

    /**
     * Met à jour la taille de la grille.
     *
     * @param t Nouvelle taille de la grille
     */
    public void setTaille(int t) {
        this.taille = t;
        this.elements = new Integer[t][t];
    }

    /**
     * Obtient la taille de la grille.
     *
     * @return La taille de la grille
     */
    public Integer getTaille() {
        return this.taille;
    }

    /**
     * Place les navires sur la grille en demandant au joueur les positions.
     */
    public void placement() {
        Scanner scanner = new Scanner(System.in);

        // Placement du premier navire
        System.out.println("Placement du Porte-avions (Taille 5x1) :");
        placerNavire(scanner, 5);

        // Placement du deuxième navire
        System.out.println("Placement du Cuirassé (Taille 4x1) :");
        placerNavire(scanner, 4);

        // Placement du troisième navire
        System.out.println("Placement du Destroyer (Taille 3x1) :");
        placerNavire(scanner, 3);
    }

    private void placerNavire(Scanner scanner, int tailleNavire) {
    // Demander la position au joueur
    System.out.print("Pour débuter:\n");
    System.out.print("Entrez la ligne (0-" + (taille - 1) + ") : ");
    int ligne = scanner.nextInt();

    System.out.print("Entrez la colonne (0-" + (taille - 1) + ") : ");
    int colonne = scanner.nextInt();

    System.out.print("Entrez la direction 1:(^) 2:(v) 3:(<) 4:(>) : ");
    int direction = scanner.nextInt();

    // Vérifier si la position est valide
    if (ligne < 0 || ligne >= taille || colonne < 0 || colonne >= taille) {
        System.out.println("Position invalide. Réessayez.");
        placerNavire(scanner, tailleNavire);
    } 
    else {
        // Placer le navire sur la grille en fonction de la direction
        switch (direction) {
            case 1: // Vers le haut
                if (ligne - tailleNavire + 1 < 0) {
                System.out.println("Position invalide. Réessayez.");
                placerNavire(scanner, tailleNavire);
                return;}
                else{
                for (int i = 0; i < tailleNavire; i++) {
                    if (ligne - i >= 0) {
                        elements[ligne - i][colonne] = 1; // Vous pouvez utiliser d'autres valeurs si nécessaire
                    } else {
                        System.out.println("Position invalide. Réessayez.");
                        placerNavire(scanner, tailleNavire);
                        return;
                    }
                }
                }
                break;

            case 2: // Vers le bas
                if (ligne + tailleNavire - 1 >= taille) {
                System.out.println("Position invalide. Réessayez.");
                placerNavire(scanner, tailleNavire);
                return;}
                else{
                for (int i = 0; i < tailleNavire; i++) {
                    if (ligne + i < taille) {
                        elements[ligne + i][colonne] = 1; // Vous pouvez utiliser d'autres valeurs si nécessaire
                    } else {
                        System.out.println("Position invalide. Réessayez.");
                        placerNavire(scanner, tailleNavire);
                        return;
                    }
                }
                }
                break;

            case 3: // Vers la gauche
                if (colonne - tailleNavire + 1 < 0) {
                System.out.println("Position invalide. Réessayez.");
                placerNavire(scanner, tailleNavire);
                return;}
                else{
                for (int i = 0; i < tailleNavire; i++) {
                    if (colonne - i >= 0) {
                        elements[ligne][colonne - i] = 1; // Vous pouvez utiliser d'autres valeurs si nécessaire
                    } else {
                        System.out.println("Position invalide. Réessayez.");
                        placerNavire(scanner, tailleNavire);
                        return;
                    }
                }
                }
                break;

            case 4: // Vers la droite
                if (colonne + tailleNavire - 1 >= taille) {
                System.out.println("Position invalide. Réessayez.");
                placerNavire(scanner, tailleNavire);
                return;}
                else{
                for (int i = 0; i < tailleNavire; i++) {
                    if (colonne + i < taille) {
                        elements[ligne][colonne + i] = 1; // Vous pouvez utiliser d'autres valeurs si nécessaire
                    } else {
                        System.out.println("Position invalide. Réessayez.");
                        placerNavire(scanner, tailleNavire);
                        return;
                    }
                }
                }
                break;

            default:
                System.out.println("Direction invalide. Réessayez.");
                placerNavire(scanner, tailleNavire);
                return;
        }
    }
}
}

