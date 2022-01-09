/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_cressent_zeljko;

/**
 *
 * @author aurelienzeljko
 */
public class celulle {
    jeton jetonCourant;
    
    public celulle(){
        jetonCourant=null;
    }
    
    public boolean affecterjeton(jeton unjeton){
        if (jetonCourant==null){
            jetonCourant=unjeton;
            return true;
        }
        return false;
        
    }
    
    public String lireCouleurjeton(){
        if (jetonCourant==null) 
            return "rien";
        else{
            return jetonCourant.lireCouleur();
        }
    }

}
