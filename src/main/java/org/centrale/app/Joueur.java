/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.app;

/**
 *
 * @author darielbezerra
 */
public class Joueur {

    /**
     * Attribut nom de joueur
     */
    private String nom;
    
    /**
     * Attribut mail de joueur
     */
    private String mail;
    
    /**
     * Attribut navire de joueur
     */
    private Navire[] navires;
    
    /**
     * Attribut grille de joueur
     */
    private Grille grille;

    /**getters des attributs*/

    public String getNom() {
        return nom;
    }

    public String getMail() {
        return mail;
    }

    public Navire[] getNavires() {
        return navires;
    }

    public Grille getGrille() {
        return grille;
    }

    /**setters des attributs*/
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setNavires(Navire[] navires) {
        this.navires = navires;
    }

    public void setGrille(Grille grille) {
        this.grille = grille;
    }
    
    /**
     * Constructeur avec paramètres
     * @param nom
     * @param mail 
     */
    public Joueur(String nom, String mail) {
        this.nom = nom;
        this.mail = mail;
        this.navires = new Navire[3];
        this.grille = new Grille();
        
        for (int i = 0; i < navires.length; i++) {
            navires[i] = new Navire(i);
        }
    }
    
    /**
     * Constructeur sans paramètres
     */
    public Joueur(){
        this.nom = "Joueur";
        this.mail = "";
        this.navires = new Navire[3];
        this.grille = new Grille();
        
        for (int i = 0; i < navires.length; i++) {
            navires[i] = new Navire(i);
        }
    }
    
    
   
    /**
     * Méthode de l'attaque la grille de l'adversaire
     * @param adversaire
     * @param x
     * @param y 
     */
    public void attaque(Joueur adversaire, int x, int y){
        
        
        
        int[][] tableau = adversaire.getGrille().getElements();
        if(tableau[x][y] == 0){
            System.out.println("Position Vide");
            adversaire.grille.setElements(9, x, y);
        }
        else if (tableau[x][y] == 8 || tableau[x][y] == 9){
            System.out.println("Position déjà attaquée");
        }
        else {
            if(tableau[x][y] == 5){
                adversaire.navires[0].setPtVie(adversaire.navires[0].getPtVie() - adversaire.navires[0].getDegAtt());
            }
            if(tableau[x][y] == 4){
                adversaire.navires[0].setPtVie(adversaire.navires[1].getPtVie() - adversaire.navires[1].getDegAtt());
            }
            if(tableau[x][y] == 3){
                adversaire.navires[0].setPtVie(adversaire.navires[2].getPtVie() - adversaire.navires[2].getDegAtt());
            }
           adversaire.grille.setElements(8, x, y);
        }
    }
}
