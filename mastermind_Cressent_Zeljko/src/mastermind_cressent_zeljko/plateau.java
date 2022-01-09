/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_cressent_zeljko;

/**
 *
 * @author aurelienzeljko
 */
public class plateau {

    celulle[][] CellulesJeu = new celulle[14][4];
    
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public plateau() {
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 4; j++) {
                CellulesJeu[i][j] = new celulle();
            }
        }
    }

    public String lireCouleurjeton(int l, int c){
        return CellulesJeu[l][c].lireCouleurjeton();
    }
    
    public void vidergrille() {
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 4; j++) {
                CellulesJeu[i][j].jetonCourant = null;
            }
        }
    }

    public boolean ajouterjeton(jeton unjeton, int colonne, int A) {
        if (CellulesJeu[A][colonne].jetonCourant == null) {
            if (CellulesJeu[A][colonne].affecterjeton(unjeton) == true) {
                return true;
            }
        }
        return false;
    }

    public void afficherGrilleSurConsole(joueur unjoueur, int tab[]) {
        int essais = 0;
        int A = 14 - unjoueur.essaies;
        for (int i = 0; i <= A; i++) {
            for (int j = 0; j < 4; j++) {
                if (CellulesJeu[i][j].jetonCourant == null) {
                    System.out.print("R");
                } 
                else {
                    if (lireCouleurjeton(i,j).equalsIgnoreCase("jaune")) {
                        System.out.print(ANSI_YELLOW + " X" + ANSI_RESET);
                    }
                    if (lireCouleurjeton(i,j).equalsIgnoreCase("blanc")) {
                            System.out.print(ANSI_WHITE + " X" + ANSI_RESET);
                    }
                    if (lireCouleurjeton(i,j).equalsIgnoreCase("cyan")) {
                        System.out.print(ANSI_CYAN + " X" + ANSI_RESET);
                    }
                    if (lireCouleurjeton(i,j).equalsIgnoreCase("rouge")) {
                        System.out.print(ANSI_RED + " X" + ANSI_RESET);
                    }
                    if (lireCouleurjeton(i,j).equalsIgnoreCase("bleu")) {
                        System.out.print(ANSI_BLUE + " X" + ANSI_RESET);
                    }
                    if (lireCouleurjeton(i,j).equalsIgnoreCase("vert")) {
                        System.out.print(ANSI_GREEN + " X" + ANSI_RESET);
                    }
                    if (lireCouleurjeton(i,j).equalsIgnoreCase("violet")) {
                        System.out.print(ANSI_PURPLE + " X" + ANSI_RESET);
                    }
                    if (lireCouleurjeton(i,j).equalsIgnoreCase("gris")) {
                        System.out.print(" X" + ANSI_RESET);
                    }
                }

            }
            essais = essais + 1;
        }

    }
}
