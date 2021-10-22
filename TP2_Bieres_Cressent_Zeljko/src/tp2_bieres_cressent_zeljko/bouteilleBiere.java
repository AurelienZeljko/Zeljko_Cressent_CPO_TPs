package tp2_bieres_cressent_zeljko;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aurelienzeljko
 */
public class bouteilleBiere {
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte=false;
    

    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie  ) ;
    }
    public bouteilleBiere(String unNom, double unDegre, String uneBrasserie, boolean ouverte) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }
    public void Décapsuler() {
        if (ouverte=false) {
            ouverte=true;
            System.out.println("je viens de l'ouvrir, SANTE !");
        }
        else{
            System.out.println("ta biere est deja ouverte, SANTE !");
        }
    }
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés)Ouverte ? ";
        if (ouverte == true ) chaine_a_retourner += "oui" ; else chaine_a_retourner += "non" ;
        return chaine_a_retourner ;
    }
}