/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.app;

/**
 *
 * @author darielbezerra
 */
public class Point2D {

    private int x;
    private int y;

    /**
      * 
      * Point 2D sans paramètres
      */
    public Point2D() {
        this.x = 0;
        this.y = 0
    }

    
    /**
      * 
      * Point 2D avec paramètres
      */
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
      * 
      * Point 2D a partir d'un autre Point 2D
      */
    public Point2D(Point2D p) {
        this.x = p.x;
        this.y = p.y;
    }
    
    /**
      * 
      * Affichage
      */
    public void affiche() {
        System.out.println("[" + this.x + "; " + this.y + "]");
    }

    /**
      * 
      * Set X
      */
    public void setX(int x) {
        this.x = x;
    }

    /**
      * 
      * Set Y
      */
    public void setY(int y) {
        this.y = y;
    }

    /**
      * 
      * Get X
      */
    public int getX() {
        return x;
    }

    /**
      * 
      * Get Y
      */
    public int getY() {
        return y;
    }

    /**
      * 
      * Set Position
      */
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
      * 
      * Translate
      */
    public void translate(int dx, int dy) {
        setX(dx + x);
        setY(dy + y);
    }

    /**
      * 
      * Distance entre deux points
      * @param p1 - Coordonnées d'un personnage
      * @param p2 - Coordonnées d'un personnage
      * @return - Le résultat du calcul de la distance entre les coordonnées de deux personnages
      */
    public Double distance(Point2D p1, Point2D p2) {
        return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
    }

}
