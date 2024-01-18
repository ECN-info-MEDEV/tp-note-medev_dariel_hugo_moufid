package org.centrale.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        World World1 = new World();
        Joueur j1 = World1.getJoueur1();
        Joueur j2 = World1.getJoueur2();
        
        int i=0;
        int m=0;
 
        while(i<12 && m<12){
        World1.tourDeJeu(j1, j2);
        i=0;
        m=0;
        
        for(int j=0;j<World1.getJoueur1().getGrille().getTaille();j++){
            for(int k=0;k<World1.getJoueur1().getGrille().getTaille();k++){
                if(World1.getJoueur1().getGrille().getElements()[j][k] == 8){
                    i++;
                }
                if(World1.getJoueur2().getGrille().getElements()[j][k] == 8){
                    m++;
                }
            }
        if(i == 12 || m ==12){
        break;}
        }
                
        World1.tourDeJeu(j2, j1);
        
        for(int j=0;j<World1.getJoueur1().getGrille().getTaille();j++){
            for(int k=0;k<World1.getJoueur1().getGrille().getTaille();k++){
                if(World1.getJoueur1().getGrille().getElements()[j][k] == 8){
                    i++;
                }
                if(World1.getJoueur2().getGrille().getElements()[j][k] == 8){
                    m++;
                }
            }
        if(i == 12 || m ==12){
        break;}
        }
        
        }
        System.out.println("FIN DE JEU");
        
    }
}
