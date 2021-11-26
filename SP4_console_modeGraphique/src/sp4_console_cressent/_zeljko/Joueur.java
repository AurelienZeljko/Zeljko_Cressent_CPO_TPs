/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_cressent._zeljko;

/**
 *
 * @author aurelienzeljko
 */
public class Joueur {
    String nom;
    String couleur;
    Jeton[]ListeJetons = new Jeton[21];
    int nombreDesintegrateurs;
    int nombreJetonsRestants;
    
    public  Joueur(String s) {
        nom = s;
        nombreDesintegrateurs = 0;
        nombreJetonsRestants = 0;

    }
    
    public void affecterCouleur(String couleur1){
        couleur=couleur1;
    }
    
    public boolean ajouterJeton (Jeton unjeton) {
        for ( int i=0; i<21 ; i++){
            if (ListeJetons[i]==null){
                ListeJetons[i]=unjeton;
                nombreJetonsRestants++;
                return true;
            }
        }

        return false;
    }
    
    public void obtenirDesintegrateur(){
        nombreDesintegrateurs++;
    }
    
    public boolean utiliserDesintegrateur (){
        if (nombreDesintegrateurs!=0){
            nombreDesintegrateurs--;
            return true;
        }
        else{
            return false;
        }
    }
}

