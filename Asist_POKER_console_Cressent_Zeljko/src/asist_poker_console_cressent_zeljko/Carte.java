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
    boolean Visible;

    public Carte(String couleur, String valeur) {
		Couleur = couleur;
		Valeur = valeur;
	}

	public int comparer(Carte A) {
		return Valeur.compareTo(A.AvoirValeur())+Couleur.compareTo(A.AvoirCouleur());
	}

	/**
	 * @return the couleur
	 */
	public String AvoirCouleur() {
		return Couleur;
	}

	/**
	 * @return the valeur
	 */
	public String AvoirValeur() {
		return Valeur;
	}
	
	public String toString(){
		return Valeur.toString()+" de "+Couleur.toString();
	}

}

