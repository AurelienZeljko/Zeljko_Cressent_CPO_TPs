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


    public void debuterPartie() {
        grilleJeu.afficherGrilleSurConsole();
        Scanner sc = new Scanner(System.in);
        int colonne = 0;
        System.out.println("Choisissez une colonne entre 1 et 7");
        colonne = sc.nextInt();
        Jeton J = new Jeton("Rouge");
        if (colonne <= 7 && colonne >= 1) {
            grilleJeu.ajouterJetonDansColonne(J, colonne);
        }
    }

    public void initialiserPartie() {
//        grilleJeu.viderGrille();
        Scanner sc = new Scanner(System.in);
        System.out.println("nom du premier joueur :");
        Joueur joueur1 = new Joueur(sc.nextLine());
        System.out.println("nom du deuxieme joueur :");
        Joueur joueur2 = new Joueur(sc.nextLine());
        ListeJoueurs[0] = joueur1;
        ListeJoueurs[1] = joueur2;

        attribuerCouleurAuxJoueurs();
        Random couleur = new Random();
        int aleat = couleur.nextInt(2);
        if (aleat == 1) {
            joueurCourant = ListeJoueurs[0];
            System.out.println(ListeJoueurs[0].nom + " commence.");
        } else {
            joueurCourant = ListeJoueurs[1];
            System.out.println(ListeJoueurs[1].nom + " commence.");
        }
        for (int i = 0; i < 21; i++) {
            Jeton unJeton = new Jeton(ListeJoueurs[0].couleur);
            ListeJoueurs[0].ajouterJeton(unJeton);
            Jeton unJeton2 = new Jeton(ListeJoueurs[1].couleur);
            ListeJoueurs[1].ajouterJeton(unJeton2);
        }
        Random nombre = new Random();
        for (int i = 1; i < 3; i++) {
            boolean trouNoir = false;
            boolean Desintegrateur = false;
            while (trouNoir == false && Desintegrateur == false) {
                int A = nombre.nextInt(6);
                int B = nombre.nextInt(7);
                trouNoir = grilleJeu.placerTrouNoir(A, B);
                Desintegrateur = grilleJeu.placerDesintegrateur(A, B);
            }
        }
        Random nombre1 = new Random();
        for ( int i=1 ; i<4 ; i++){
            boolean trouNoir = false;
            while(trouNoir == false ){
                int A = nombre1.nextInt(6);
                int B = nombre1.nextInt(7);
                trouNoir = grilleJeu.placerTrouNoir(A, B);
            }
        }
        Random nombre3 = new Random();
        for ( int i=1 ; i<4 ; i++){
            boolean Desintegrateur = false;
            while(Desintegrateur == false ){
                int A = nombre3.nextInt(6);
                int B = nombre3.nextInt(7);
                Desintegrateur = grilleJeu.placerDesintegrateur(A, B);
            }
        }
            
        
        grilleJeu.afficherGrilleSurConsole();

    }

    public void attribuerCouleurAuxJoueurs() {
        Random couleur = new Random();
        int nbr = couleur.nextInt(2);
        if (nbr == 1) {
            ListeJoueurs[0].affecterCouleur("Jaune");
            System.out.println(ListeJoueurs[0].nom + " est Jaune.");
            ListeJoueurs[1].affecterCouleur("Rouge");
            System.out.println(ListeJoueurs[1].nom + " est Rouge.");
        } else {
            ListeJoueurs[0].affecterCouleur("Rouge");
            System.out.println(ListeJoueurs[0].nom + " est Rouge.");
            ListeJoueurs[1].affecterCouleur("Jaune");
            System.out.println(ListeJoueurs[1].nom + " est Jaune.");
        }
    }
}
