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
    Grille grilleJeu = new Grille();

    public Partie(Joueur joueur1, Joueur joueur2) {
        ListeJoueurs = new Joueur[2];
        ListeJoueurs[0] = joueur1;
        ListeJoueurs[1] = joueur2;

    }

    public void debuterPartie() {
        initialiserPartie();
        while ((grilleJeu.etreGagantePourJoueur(ListeJoueurs[0]) == false) && (grilleJeu.etreRemplie() == false) && (grilleJeu.etreGagantePourJoueur(ListeJoueurs[1]) == false)) {

            grilleJeu.afficherGrilleSurConsole();
            System.out.println("1) jouer un jeton");
            System.out.println("2) Désintégrer un jeton");
            System.out.println("3) Récupérer un jeton");
            Scanner sc = new Scanner(System.in);
            int action = sc.nextInt();
            while (action < 1 && action > 3) {
                System.out.println("ta valeur n'est pas bonne");
                action = sc.nextInt();
            }
            if (action == 2) {
                if (joueurCourant.nombreDesintegrateurs == 0) {
                    System.out.println("pas de desintegrateur");
                    while (action != 1 && action != 3) {
                        System.out.println("choisi un chiffre entre 1 et 3");
                        action = sc.nextInt();
                    }
                }
            }
            switch (action) {
                case 1 -> {
                    boolean result;
                    System.out.println("choisi une collone ");
                    int col = sc.nextInt() - 1;
                    while (col < 0 || col > 6) {
                        System.out.println("cette collone n'existe pas");
                        col = sc.nextInt() - 1;
                    }
                    joueurCourant.nombreJetonsRestants--;

                    int i = 0;
                    while (grilleJeu.CellulesJeu[i][col].jetonCourant != null) {
                        i++;
                        if (i == 5) {
                            break;
                        }
                    }
                    if (grilleJeu.CellulesJeu[i][col].presencedesintegrateur() == true) {
                        grilleJeu.CellulesJeu[i][col].recupererDesintegrateur();
                        joueurCourant.nombreDesintegrateurs++;
                    }

                    result = grilleJeu.ajouterJetonDansColonne(joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants], col);
                    while (result == false) {
                        System.out.println("Colonne pleine, choisissez une autre colonne");
                        col = sc.nextInt() - 1;
                        result = grilleJeu.ajouterJetonDansColonne(joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants], col);
                    }
                    if (grilleJeu.CellulesJeu[i][col].presenceTrouNoir()== true) {
                        grilleJeu.CellulesJeu[i][col].activerTrouNoir();
                        grilleJeu.CellulesJeu[i][col].supprimerJeton();
                    }

                    grilleJeu.afficherGrilleSurConsole();
                }

                case 2 -> {
                    System.out.println("choisi une ligne ");
                    int lig2 = sc.nextInt() - 1;
                    System.out.println("choisi une collone");
                    int col2 = sc.nextInt() - 1;
                    while (grilleJeu.CellulesJeu[lig2][col2].lireCouleurDuJeton() == joueurCourant.couleur) {
                        System.out.println("Le jeton est de votre couleur ");
                        System.out.println("choisi une ligne ");
                        lig2 = sc.nextInt() - 1;
                        System.out.println("choisi une collone ");
                        col2 = sc.nextInt() - 1;
                    }
                    grilleJeu.supprimerJeton(lig2, col2);
                    grilleJeu.tasserGrille(col2);
                    grilleJeu.afficherGrilleSurConsole();
                    joueurCourant.nombreDesintegrateurs--;
                    System.out.println("Nombre de désintégrateur : " + joueurCourant.nombreDesintegrateurs + "du " + joueurCourant);
                }

                case 3 -> {
                    System.out.println("choisi une ligne");
                    int lig3 = sc.nextInt() - 1;
                    System.out.println("choisi une collone");
                    int col3 = sc.nextInt() - 1;
                    while (grilleJeu.CellulesJeu[lig3][col3].lireCouleurDuJeton() != joueurCourant.couleur) {
                        System.out.println("Le jeton n'est pas de votre couleur ");
                        System.out.println("choisi une ligne");
                        lig3 = sc.nextInt() - 1;
                        System.out.println("choisi une collone ");
                        col3 = sc.nextInt() - 1;
                    }
                    grilleJeu.supprimerJeton(lig3, col3);
                    grilleJeu.tasserGrille(col3);
                    grilleJeu.afficherGrilleSurConsole();
                }
            }
            if (grilleJeu.etreGagantePourJoueur(joueurCourant) == false) {
                if (ListeJoueurs[0] == joueurCourant) {
                    joueurCourant = ListeJoueurs[1];
                } else {
                    joueurCourant = ListeJoueurs[0];
                }

                System.out.println("Tour suivant :" + joueurCourant.nom);
                System.out.println("Nombre de jeton de " + joueurCourant.nom + " est : " + joueurCourant.nombreJetonsRestants);
                System.out.println("Nombre de désintégrateur de " + joueurCourant.nom + " est : " + joueurCourant.nombreDesintegrateurs);
            }

        }
        System.out.println(joueurCourant.nom + " a gagné, Bravo!");
    }

    public void attribuerCouleursAuxJoueurs() {
        Random couleur = new Random();
        int alea = couleur.nextInt(2);
        if (alea == 1) {
            ListeJoueurs[0].affecterCouleur("Jaune");
            System.out.println(ListeJoueurs[0].nom + " est Jaune");
            ListeJoueurs[1].affecterCouleur("Rouge");
            System.out.println(ListeJoueurs[1].nom + " est Rouge");
        } else {
            ListeJoueurs[0].affecterCouleur("Rouge");
            System.out.println(ListeJoueurs[0].nom + " est Rouge");
            ListeJoueurs[1].affecterCouleur("Jaune");
            System.out.println(ListeJoueurs[1].nom + " est Jaune");
        }
    }

    public void initialiserPartie() {
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
        for (int i = 1; i < 4; i++) {
            boolean trouNoir = false;
            while (trouNoir == false) {
                int A = nombre1.nextInt(6);
                int B = nombre1.nextInt(7);
                trouNoir = grilleJeu.placerTrouNoir(A, B);
            }
        }
        Random nombre3 = new Random();
        for (int i =1 ; i<4 ; i++){
            int A, B;
            do {
                A = nombre3.nextInt(6);
                B = nombre3.nextInt(7);
            } while (grilleJeu.CellulesJeu[A][B].presencedesintegrateur() == true);

            grilleJeu.placerDesintegrateur(A, B);
        }
        //grilleJeu.afficherGrilleSurConsole();
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
