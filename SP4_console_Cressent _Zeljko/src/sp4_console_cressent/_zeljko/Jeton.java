/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_cressent._zeljko;

/**
 *
 * @author aurelienzeljko
 */
public class Jeton {
    String couleur;
    
    public  Jeton (String couleur1){
        couleur=couleur1;
    }
    public String lireCouleur() {
        String CouleurJeton = ("La couleur de votre jeton est :" + couleur) ;
        return CouleurJeton;
    }
}
