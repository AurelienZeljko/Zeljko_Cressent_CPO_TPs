/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asist_poker_console_cressent_zeljko;

/**
 *
 * @author aurelienzeljko
 */
public class Partie {
    Joueur[] ListeJoueurs;
    Joueur joueurCourant;
    Tapis grilleJeu = new Tapis();
    
    public Partie(Joueur joueur1, Joueur joueur2) {
        ListeJoueurs = new Joueur[2];
        ListeJoueurs[0] = joueur1;
        ListeJoueurs[1] = joueur2;

    }
    
    
}
