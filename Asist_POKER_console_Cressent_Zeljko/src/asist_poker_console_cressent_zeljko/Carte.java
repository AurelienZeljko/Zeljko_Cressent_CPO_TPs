/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asist_poker_console_cressent_zeljko;

/**
 *
 * @author aurelienzeljko
 */
public class Carte {
    String Couleur;
    String Valeur;
    
    public Carte(String couleur1,String valeur1){
        Couleur = couleur1;
        Valeur = valeur1;
    }
    public String lireCouleurCarte(){
        return Couleur;
    }
    public String lireValeurCarte(){
        return Valeur;
    }
}
