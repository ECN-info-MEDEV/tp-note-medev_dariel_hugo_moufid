package org.centrale.app;

import java.util.Scanner;

/**
 * Représente une grille de jeu pour la bataille navale.
 */
public class Grille {
    private int taille;
    private int[][] elements;
    /**attribut cree pour corriger une anomalie Sonar*/
    private static final String INVALIDE ="Position invalide. Réessayez.";

    /**
     * Constructeur prenant la taille de la grille en paramètre.
     *
     * @param t Taille de la grille
     */
    public Grille(int t) {
        this.taille = t;
        this.elements = new int[t][t];
    }

    /**
     * Constructeur de copie prenant un objet Grille en paramètre.
     *
     * @param g Objet de type Grille à copier
     */
    public Grille(Grille g) {
        this.taille = g.taille;
        // Copier les éléments de la grille
        this.elements = new int[g.taille][g.taille];
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
        this.elements = new int[5][5];
    }

    // Autres méthodes et fonctions

    /**
     * Met à jour la taille de la grille.
     *
     * @param t Nouvelle taille de la grille
     */
    public void setTaille(int t) {
        this.taille = t;
        this.elements = new int[t][t];
    }
    
    /**
     * Met à jour la taille de la grille.
     *
     * @param val Nouveau valeur
     * @param x Position x du nouveau valeur
     * @param y Position y du nouveau valeur
     */
    public void setElements(int val,int x, int y) {
        this.elements[x][y] = val;
    }

    /**
     * Obtient la taille de la grille.
     *
     * @return La taille de la grille
     */
    public int getTaille() {
        return this.taille;
    }
    
    /**
     * Obtient les elements de la grille.
     *
     * @return le matrice avec les elements de la grille.
     */
    public int[][] getElements() {
        return this.elements;
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

    /** Les methodes method1/2/3/4/5 ont ete cree afin de gerer les anomalies Sonar et essayer de passer
     * en PASSED sur SONARCLOUD
     * @param ligne
     * @param tailleNavire
     * @param scanner
     * @param colonne
     */
    public void method1(int ligne,int tailleNavire,Scanner scanner, int colonne){
        if (ligne - tailleNavire + 1 < 0) {
            System.out.println(INVALIDE);
            placerNavire(scanner, tailleNavire);
            return;}
        else{
            for (int i = 0; i < tailleNavire; i++) {
                if (ligne - i >= 0) {
                    elements[ligne - i][colonne] = tailleNavire; // Vous pouvez utiliser d'autres valeurs si nécessaire
                } else {
                    System.out.println(INVALIDE);
                    placerNavire(scanner, tailleNavire);
                    return;
                }
            }
        }
    }
    public void method2(int ligne,int tailleNavire,Scanner scanner, int colonne){
        if (ligne + tailleNavire - 1 >= taille) {
            System.out.println(INVALIDE);
            placerNavire(scanner, tailleNavire);
            return;}
        else{
            for (int i = 0; i < tailleNavire; i++) {
                if (ligne + i < taille) {
                    elements[ligne + i][colonne] = tailleNavire; // Vous pouvez utiliser d'autres valeurs si nécessaire
                } else {
                    System.out.println(INVALIDE);
                    placerNavire(scanner, tailleNavire);
                    return;
                }
            }
        }
    }
    public void method3(int ligne,int tailleNavire,Scanner scanner, int colonne){
        if (colonne - tailleNavire + 1 < 0) {
            System.out.println(INVALIDE);
            placerNavire(scanner, tailleNavire);
            return;}
        else{
            for (int i = 0; i < tailleNavire; i++) {
                if (colonne - i >= 0) {
                    elements[ligne][colonne - i] = tailleNavire; // Vous pouvez utiliser d'autres valeurs si nécessaire
                } else {
                    System.out.println(INVALIDE);
                    placerNavire(scanner, tailleNavire);
                    return;
                }
            }
        }
    }
    public void method4(int ligne,int tailleNavire,Scanner scanner, int colonne){
        if (colonne + tailleNavire - 1 >= taille) {
            System.out.println(INVALIDE);
            placerNavire(scanner, tailleNavire);
            return;}
        else{
            for (int i = 0; i < tailleNavire; i++) {
                if (colonne + i < taille) {
                    elements[ligne][colonne + i] = tailleNavire; // Vous pouvez utiliser d'autres valeurs si nécessaire
                } else {
                    System.out.println(INVALIDE);
                    placerNavire(scanner, tailleNavire);
                    return;
                }
            }
        }
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
        System.out.println(INVALIDE);
        placerNavire(scanner, tailleNavire);
    } 
    else {
        // Placer le navire sur la grille en fonction de la direction
        switch (direction) {
            case 1: // Vers le haut
                method1(ligne,tailleNavire,scanner,colonne);
                break;

            case 2: // Vers le bas
                method2(ligne,tailleNavire,scanner,colonne);
                break;

            case 3: // Vers la gauche
                method3(ligne,tailleNavire,scanner,colonne);
                break;

            case 4: // Vers la droite
                method4(ligne,tailleNavire,scanner,colonne);
                break;

            default:
                System.out.println("Direction invalide. Réessayez.");
                placerNavire(scanner, tailleNavire);
                return;
        }
    }
}
    
    /**
     * Methode pour afficher la grille du jueur.
     */
    public void affichage() {
        
    int numRows = this.elements[0].length;
    int numCols = this.elements.length;

        int maxNomeLength = 1; 

            for (int row = 0; row < numRows; row++) {
                for (int col = 0; col < numCols; col++) {
                    if (this.elements[row][col] != 0) {
                        int nomeLength = 1;
                        maxNomeLength = Math.max(maxNomeLength, nomeLength);
                    }
                }
            }
            int cellSize = maxNomeLength + 2; 
            for (int row = numRows - 1; row >= 0; row--) {
                System.out.printf("%-" + maxNomeLength + "d  ", row); 
                for (int col = 0; col < numCols; col++) {
                    if (this.elements[row][col] == 9) {
                        System.out.printf("%-" + cellSize + "s", "X"); 
                    } else {
                        System.out.printf("%-" + cellSize + "s", this.elements[row][col]); 
                    }
                }
                System.out.println();
            }
            System.out.println();
            System.out.printf("%-" + cellSize + "s", "");
            for (int col = 0; col < numCols; col++) {
                System.out.printf("%-" + cellSize + "s", col);
            }

        }
    
    public void method5(int numCols,int row, int maxNomeLength){
        for (int col = 0; col < numCols; col++) {
            if (this.elements[row][col] != 0) {
                int nomeLength = 1;
                maxNomeLength = Math.max(maxNomeLength, nomeLength);
            }
        }
    }
    /**
     * Methode pour afficher la grille de l'autre joueur.
     */
    public void affichageCache() {
        
    int numRows = this.elements[0].length;
    int numCols = this.elements.length;

        int maxNomeLength = 1; 

            for (int row = 0; row < numRows; row++) {
                method5(numCols,row,maxNomeLength);
            }
            int cellSize = maxNomeLength + 2; 
            for (int row = numRows - 1; row >= 0; row--) {
                System.out.printf("%-" + maxNomeLength + "d  ", row); 
                for (int col = 0; col < numCols; col++) {
                    if (this.elements[row][col] == 9) {
                        System.out.printf("%-" + cellSize + "s", "0");
                    if (this.elements[row][col] == 8) {
                        System.out.printf("%-" + cellSize + "s", "X");
                    } else {
                        System.out.printf("%-" + cellSize + "s", "?"); 
                    }
                }
                System.out.println();
            }
            System.out.println();
            System.out.printf("%-" + cellSize + "s", "");
            for (int col = 0; col < numCols; col++) {
                System.out.printf("%-" + cellSize + "s", col);
            }

        }
}
}

