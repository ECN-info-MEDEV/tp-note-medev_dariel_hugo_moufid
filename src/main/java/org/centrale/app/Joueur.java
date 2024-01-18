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
     * Constructeur avec paramètres
     * @param nom
     * @param mail 
     */
    public Joueur(String nom, String mail) {
        this.nom = nom;
        this.mail = mail;
    }
    
    /**
     * Constructeur sans paramètres
     */
    public Joueur(){
        this.nom = "Joueur";
        this.mail = "";
    }
    
    
    
    public void attaque(int x, int y){
        
    }
    
    
}
