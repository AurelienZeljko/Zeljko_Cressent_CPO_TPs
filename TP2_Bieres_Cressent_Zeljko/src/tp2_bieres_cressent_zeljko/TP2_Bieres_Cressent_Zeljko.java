/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_cressent_zeljko;

/**
 *
 * @author aurelienzeljko
 */
public class TP2_Bieres_Cressent_Zeljko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        bouteilleBiere uneBiere = new bouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson",true) ;
        bouteilleBiere uneBiere1 = new bouteilleBiere("Tripel Karmeliet", 8.4 ,"Bosteels",false) ;
        bouteilleBiere uneBiere2 = new bouteilleBiere("Paix Dieu", 10.0 ,"Caulier",false) ;
        bouteilleBiere uneBiere3 = new bouteilleBiere("Chouffe", 8.0 ,"Achouffe",true) ;
        //uneBiere.nom = "Cuvée des trolls";
        //uneBiere.degreAlcool = 7.0 ;
        //uneBiere.brasserie="Dubuisson";
        //uneBiere.lireEtiquette();
        //uneBiere.nom = "Leffe";
        //uneBiere.degreAlcool = 6.6 ;
        //uneBiere.brasserie = "Abbaye de Leffe";
        uneBiere.lireEtiquette();
        uneBiere1.lireEtiquette();
        uneBiere2.lireEtiquette();
        uneBiere3.lireEtiquette();
        uneBiere.Décapsuler();
        uneBiere1.Décapsuler();
        //uneBiere2.Décapsuler();
        //uneBiere3.Décapsuler();
    }
    
}
