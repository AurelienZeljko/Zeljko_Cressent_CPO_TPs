/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_cressent._zeljko;

/**
 *
 * @author aurelienzeljko
 */
public class Cellule {
    Jeton jetonCourant;
    boolean trouNoir;
    boolean desintegrateur;
    
    public Cellule(){
        jetonCourant=null;
        trouNoir=false;
        desintegrateur=false;
    }
    
    public boolean affecterJeton(Jeton unJeton){
        if (jetonCourant == null){
            jetonCourant=unJeton;
            return true;
        }
        return false;
        
    }
    
    public Jeton recupererJeton(){
        Jeton jetonRecuperation = jetonCourant;
        jetonCourant = null;
        return jetonRecuperation;
    }
    
    public boolean supprimerJeton () {
        if ( jetonCourant != null ){
            jetonCourant=null;
            return true;
        }
        return false;
           
    }
    public boolean placerTrouNoir(){
        if ( trouNoir==false){
            trouNoir=true;
            return true;
        }
        return false;
    }
    public boolean placerdesintegrateur(){
        if ( desintegrateur==false){
            desintegrateur=true;
            return true;
        }
        return false;
    }
    public boolean presenceTrouNoir(){
        if ( trouNoir==true){
            return true;
        }
        return false;
    }
    public boolean presencedesintegrateur(){
        if ( desintegrateur==true){
            return true;
        }
        return false;
    }
    public String lireCouleurDuJeton(){
        if ( jetonCourant==null){
            return "vide";
        }
        return jetonCourant.lireCouleur();
    }
    public boolean recupererDesintegrateur(){
        if ( desintegrateur==true ){
            desintegrateur=false;
            return true;
        }
        return false;
    }
    public boolean activerTrouNoir(){
        if ( trouNoir==true){
            jetonCourant=null;
            return true;
        }
        return false;
    }

}
