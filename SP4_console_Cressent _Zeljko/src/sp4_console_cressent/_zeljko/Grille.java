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
            for (int j = 0;  j< 7; j++) {
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
    public void afficherGrilleSurConsole(){
        for ( int i=0 ; i<6 ; i++){
            for (int j=0 ; j<7 ; j++){
                if (CellulesJeu[i][j].lireCouleurDuJeton() == "vide") {
                              System.out.print("-");
                }
                else  if (CellulesJeu[i][j].lireCouleurDuJeton() == "Rouge") {
                              System.out.print("R");
                }
                else  if (CellulesJeu[i][j].lireCouleurDuJeton() == "Jaune") {
                              System.out.print("J");
                }
            }
            System.out.println();
        }
    }
}
