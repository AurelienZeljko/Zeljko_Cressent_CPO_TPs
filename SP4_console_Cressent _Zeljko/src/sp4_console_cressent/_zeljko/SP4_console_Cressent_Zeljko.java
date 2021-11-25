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

        String A="aurel";
        String B="jules";
        Joueur Joueur1 = new Joueur(A);
        Joueur Joueur2 = new Joueur(B);
        Partie unePartie = new Partie(Joueur1,Joueur2);
        unePartie.initialiserPartie();
        //unePartie.debuterPartie();
    }
    
}
