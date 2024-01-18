package org.centrale.app;

public class Navire {

    /** points de vie de la creature*/
    private int ptVie;
    /**degre d'attack commun à tous les navires*/
    private int degAtt;
    /**type du navire*/
    private TypeNavire typeNavire;
    /** largeur du navire selon l'axe des x*/
    private int largeur;
    /** longueur du navire selon l'axe des y*/
    private int longueur;

    /** constructeur permettant d'initialiser les 3 navires de chaque joueur*/
    public Navire(int numero){
        if(numero==0) {
            this.typeNavire=TypeNavire.PORTE_AVION_1;
            this.largeur=5;
        }
        else if(numero==1) {
            this.typeNavire=TypeNavire.CUIRASSE_2;
            this.largeur=4;
        }
        else {
            this.typeNavire=TypeNavire.DESTROYER_3;
            this.largeur=3;
        }
        this.longueur=1;
        this.ptVie=100;
        this.degAtt=50;
    }

    /**getters des differents attributs*/
    public int getPtVie() {
        return ptVie;
    }

    public int getDegAtt() {
        return degAtt;
    }

    public TypeNavire getTypeNavire() {
        return typeNavire;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getLongueur() {
        return longueur;
    }

    /** setters des differents attributs*/
    public void setTypeNavire(TypeNavire typeNavire) {
        this.typeNavire = typeNavire;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }
    public void setPtVie(int ptVie) {
        this.ptVie = ptVie;
    }

    public void setDegAtt(int degAtt) {
        this.degAtt = degAtt;
    }
}
