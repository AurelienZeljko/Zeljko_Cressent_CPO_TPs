/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_cressent_zeljko;

/**
 *
 * @author aurelienzeljko
 */
public class partie {
    code Code;
    plateau plateauJeu = new plateau();
    String[] code;
    joueur Joueur;

    partie(joueur unjoueur) {
        Code = new code();
    }
}