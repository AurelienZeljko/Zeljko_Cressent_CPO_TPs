/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_cressent._zeljko;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aurelienzeljko
 */
public class Partie {

    Joueur[] ListeJoueurs;
    Joueur joueurCourant;
    Grille grilleJeu;

    public Partie(Joueur joueur1, Joueur joueur2) {
        ListeJoueurs = new Joueur[2];
        ListeJoueurs[0] = joueur1;
        ListeJoueurs[1] = joueur2;

    }

    public void attribuerCouleursAuxJoueurs() {
        ListeJoueurs[0].affecterCouleur("rouge");
        ListeJoueurs[1].affecterCouleur("jaune");
    }

    public void initialiserPartie() {
        grilleJeu = new Grille();
        for (int i = 0; i < 21; i++) {
            Jeton JetonJoueur1 = new Jeton("rouge");
            ListeJoueurs[0].ajouterJeton(JetonJoueur1);
            Jeton JetonJoueur2 = new Jeton("jaune");
            ListeJoueurs[1].ajouterJeton(JetonJoueur2);
        }
        Random nombre = new Random();
        for (int i = 1; i < 6; i++) {
            boolean trouNoir = false;
            while (trouNoir == false) {
                int A = nombre.nextInt(6);
                int B = nombre.nextInt(7);
                trouNoir = grilleJeu.placerTrouNoir(A, B);
            }
        }

        
    }

    public void debuterPartie() {
        grilleJeu.afficherGrilleSurConsole();
        Scanner sc= new Scanner(System.in); 
        int colonne=0;
        System.out.println("Choisissez une colonne entre 1 et 7");
        colonne=sc.nextInt();
        Jeton J= new Jeton();
        if (colonne<=7 && colonne>=1){
            grilleJeu.ajouterJetonDansColonne(J, colonne);
        }
    }
}