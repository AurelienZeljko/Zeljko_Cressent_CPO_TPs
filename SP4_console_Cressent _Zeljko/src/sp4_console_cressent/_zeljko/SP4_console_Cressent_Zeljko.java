/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_console_cressent._zeljko;

/**
 *
 * @author aurelienzeljko
 */
public class SP4_console_Cressent_Zeljko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jeton J = new Jeton("Rouge");
        System.out.println(J.lireCouleur());
        Cellule c=new Cellule();
        System.out.println(c.lireCouleurDuJeton());
        c.affecterJeton(J);
        System.out.println(c.lireCouleurDuJeton());
        Grille g=new Grille();
        g.ajouterJetonDansColonne(J, 2);
        String A="aurel";
        String B="chloe";
        Joueur Joueur1 = new Joueur(A);
        Joueur Joueur2 = new Joueur(B);
        Partie unePartie = new Partie(Joueur1,Joueur2);
        unePartie.initialiserPartie();
        unePartie.debuterPartie();
    }
    
}
