package org.centrale.app;

import java.util.Scanner;

public class World {
    private Joueur joueur1;
    private Joueur joueur2;

    public World(){
        this.joueur1 = new Joueur("Joueur 1","joueur1@gmail.com");
        this.joueur2 = new Joueur("Joueur 2","joueur2@gmail.com");
        System.out.println("Merci de placer vos navires "+joueur1.getNom());
        this.joueur1.getGrille().placement();
        System.out.println("Merci de placer vos navires "+joueur2.getNom());
        this.joueur2.getGrille().placement();
    }
    
    public void setJoueur1(Joueur j){
    this.joueur1 = j;
    }
    
    public void setJoueur2(Joueur j){
    this.joueur2 = j;
    }
    
    public Joueur getJoueur1(){
    return this.joueur1;
    }
    
    public Joueur getJoueur2(){
    return this.joueur2;
    }

    /**Methode tourDeJeu qui declanche un tour pour l'un des deux joueurs
     * qui choisit une position cible pour attaquer
     * @param joueur1
     * @param joueur2
     */
    public void tourDeJeu(Joueur joueur1, Joueur joueur2){
        Scanner input = new Scanner(System.in);
        System.out.println("C'est le tour du "+joueur1.getNom());
        System.out.println("Affichage de la grille du "+joueur1.getNom());
        joueur1.getGrille().affichage();
        System.out.println("\n Affichage de la grille du "+joueur2.getNom()+"\n");
        joueur2.getGrille().affichageCache();
        System.out.println("A toi d'attaquer "+joueur1.getNom()+" !");
        int x,y;
        do{
            System.out.println("Vous devez choisir un point d'attaque x,y");
            System.out.println("Attention à bien choisir des valeurs entre 0 et 4 !");
            System.out.println("Choisir x");
            String xString = input.nextLine();
            x = Integer.parseInt(xString);
            System.out.println("Choisir y");
            String yString = input.nextLine();
            y = Integer.parseInt(yString);
        }while(x<0 || x>4 || y<0 || y>4);
        joueur1.attaque(joueur2,x,y);
    }
}
