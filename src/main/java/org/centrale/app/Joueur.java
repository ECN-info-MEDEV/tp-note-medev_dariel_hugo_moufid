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
    private Grille[][] grille;


    
    /**
     * Constructeur avec paramètres
     * @param nom
     * @param mail 
     */
    public Joueur(String nom, String mail) {
        this.nom = nom;
        this.mail = mail;
        this.navires = new Navire[3];
        this.grille = new Grille[5][5];
        
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
        this.grille = new Grille[5][5];
        
        for (int i = 0; i < navires.length; i++) {
            navires[i] = new Navire(i);
        }
    }
    
    
    
    public void attaque(Joueur adversaire, int x, int y){
        if(adversaire.grille[x][y] == null){
            System.out.println("Position Vide");
        }
        else{
            if(adversaire.grille[x][y] == adversaire.navires[0].typeNavire()){
                adversaire.navires[0].setPtVie(adversaire.navires[0].getPtVie() - adversaire.navires[0].getDegAtt());
                System.out.println("Vous avez attaqué le Porte Avion");
            }
            if(adversaire.grille[x][y] == adversaire.navires[1].typeNavire()){
                adversaire.navires[0].setPtVie(adversaire.navires[1].getPtVie() - adversaire.navires[1].getDegAtt());
                System.out.println("Vous avez attaqué le Cuirasse");
            }
            if(adversaire.grille[x][y] == adversaire.navires[2].typeNavire()){
                adversaire.navires[0].setPtVie(adversaire.navires[2].getPtVie() - adversaire.navires[2].getDegAtt());
                System.out.println("Vous avez attaqué le Destroyer");
            }
            
        }
    }
    
    
}
