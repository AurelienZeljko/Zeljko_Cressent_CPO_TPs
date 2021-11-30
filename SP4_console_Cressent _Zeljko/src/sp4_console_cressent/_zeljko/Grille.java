
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_cressent._zeljko;

/**
 *
 * @author aurelienzeljko
 */
public class Grille {

    Cellule[][] CellulesJeu = new Cellule[6][7];

    public Grille() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                CellulesJeu[i][j] = new Cellule();
            }
        }
    }

    public boolean ajouterJetonDansColonne(Jeton J, int C) {

        for (int i = 0; i <= 6; i++) {

            if (CellulesJeu[i][C].jetonCourant == null) {

                CellulesJeu[i][C].jetonCourant = J;
                return true;
            }
        }
        return false;
    }

    public void afficherGrilleSurConsole() {
        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < 7; j++) {
                if (CellulesJeu[i][j].lireCouleurDuJeton() == "vide" && CellulesJeu[i][j].presenceTrouNoir() == false && CellulesJeu[i][j].presencedesintegrateur() == false) {
                    System.out.print("-");
                } else if (CellulesJeu[i][j].lireCouleurDuJeton() == "Rouge") {
                    System.out.print("R");
                } else if (CellulesJeu[i][j].lireCouleurDuJeton() == "Jaune") {
                    System.out.print("J");
                }
                if (CellulesJeu[i][j].presenceTrouNoir() == true) {
                    System.out.print("T");
                }
                if (CellulesJeu[i][j].presencedesintegrateur() == true) {
                    System.out.print("D");
                }

            }
            System.out.println();
        }
    }

    public boolean etreRemplie() {
        for (int i = 0; i < 6; i++) {
            if (CellulesJeu[5][i].jetonCourant == null) {
                return false;
            }

        }
        return true;
    }

    public void viderGrille() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                CellulesJeu[i][j].jetonCourant = null;
            }
        }
    }

    public boolean celluleOccupee(int A, int B) {
        if (CellulesJeu[A][B].jetonCourant == null) {
            return false;
        }
        return true;
    }

    public String lireCouleurDuJeton(int A, int B) {
        if (CellulesJeu[A][B].lireCouleurDuJeton() == "Rouge") {
            System.out.println("Rouge");
        } else if (CellulesJeu[A][B].lireCouleurDuJeton() == "Jaune") {
            System.out.println("Jaune");
        } else if (CellulesJeu[A][B].lireCouleurDuJeton() == "vide") {
            System.out.println("vide");
        }
        return null;
    }

    public boolean etreGagantePourJoueur(Joueur un_Joueur) {
        boolean resultat = false;
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 6; i++) {
                if (CellulesJeu[i][j].jetonCourant != null) {
                    if (CellulesJeu[i][j].lireCouleurDuJeton() == CellulesJeu[i][j + 1].lireCouleurDuJeton()) {
                        if (CellulesJeu[i][j].lireCouleurDuJeton() == CellulesJeu[i][j + 2].lireCouleurDuJeton()) {
                            if (CellulesJeu[i][j].lireCouleurDuJeton() == CellulesJeu[i][j + 3].lireCouleurDuJeton()) {
                                resultat = true;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (CellulesJeu[i][j].jetonCourant != null) {
                    if (CellulesJeu[i][j].lireCouleurDuJeton() == CellulesJeu[i + 1][j].lireCouleurDuJeton()) {
                        if (CellulesJeu[i][j].lireCouleurDuJeton() == CellulesJeu[i + 2][j].lireCouleurDuJeton()) {
                            if (CellulesJeu[i][j].lireCouleurDuJeton() == CellulesJeu[i + 3][j].lireCouleurDuJeton()) {
                                resultat = true;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (CellulesJeu[i][j].jetonCourant != null) {
                    if (CellulesJeu[i][j].lireCouleurDuJeton() == CellulesJeu[i + 1][j + 1].lireCouleurDuJeton()) {
                        if (CellulesJeu[i][j].lireCouleurDuJeton() == CellulesJeu[i + 2][j + 2].lireCouleurDuJeton()) {
                            if (CellulesJeu[i][j].lireCouleurDuJeton() == CellulesJeu[i + 3][j + 3].lireCouleurDuJeton()) {
                                resultat = true;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (CellulesJeu[i][j].jetonCourant != null) {
                    if (CellulesJeu[i][j].lireCouleurDuJeton() == CellulesJeu[i - 1][j + 1].lireCouleurDuJeton()) {
                        if (CellulesJeu[i][j].lireCouleurDuJeton() == CellulesJeu[i - 2][j + 2].lireCouleurDuJeton()) {
                            if (CellulesJeu[i][j].lireCouleurDuJeton() == CellulesJeu[i - 3][j + 3].lireCouleurDuJeton()) {
                                resultat = true;
                            }
                        }
                    }
                }
            }
        }
        return resultat;
    }

    public void tasserColonne(int A) {
        for (int i = 0; i < 6; i++) {
            if (i == 5) {
                CellulesJeu[i][A].jetonCourant = null;
            } else {
                if (CellulesJeu[i][A].jetonCourant == null) {
                    CellulesJeu[i][A].jetonCourant = CellulesJeu[i + 1][A].jetonCourant;
                    CellulesJeu[i + 1][A].jetonCourant = null;
                }
            }
        }
    }

    public void tasserGrille() {
        for (int i = 0; i < 7; i++) {
            tasserColonne(i);
        }
    }

    public boolean colonneRemplie(int A) {
        for (int i = 0; i < 6; i++) {
            if (CellulesJeu[i][A].jetonCourant == null) {
                return false;
            }
        }
        return true;
    }

    public boolean placerDesintegrateur(int A, int B) {
        if (CellulesJeu[A][B].presencedesintegrateur() == true) {
            return false;
        }
        CellulesJeu[A][B].placerdesintegrateur();
        return true;
    }

    public boolean placerTrouNoir(int A, int B) {
        if (CellulesJeu[A][B].presenceTrouNoir() == true) {
            return false;
        }
        CellulesJeu[A][B].placerTrouNoir();
        return true;
    }

    public boolean supprimerJeton(int A, int B) {
        if (CellulesJeu[A][B].jetonCourant != null) {
            CellulesJeu[A][B].jetonCourant = null;
            return true;
        }
        return false;

    }

    public Jeton recupererJeton(int A, int B) {
        if (CellulesJeu[A][B].jetonCourant != null) {
            Jeton C = CellulesJeu[A][B].recupererJeton();
            CellulesJeu[A][B].jetonCourant = null;
            return C;
        }
        return null;
    }
}
