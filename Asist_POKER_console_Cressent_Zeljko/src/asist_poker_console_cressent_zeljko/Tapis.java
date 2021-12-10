/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asist_poker_console_cressent_zeljko;

/**
 *
 * @author aurelienzeljko
 */
public class Tapis {

    Carte[] TapisJeu = new Carte[5];
    Carte[] TapisJ1 = new Carte[2];
    Carte[] TapisJ2 = new Carte[2];
    boolean FlopVisible=false;
    boolean TurnVisible=false;
    boolean RiverVisible=false;

    public boolean Tapisremplie() {
        for (int i = 0; i < 6; i++) {
            if (TapisJeu[5] == null) {
                return false;
            }
        }
        return true;
    }

    public boolean mainRemplieJoueur() {
        for (int i = 0; i < 3; i++) {
            if (TapisJ1[2] == null) {
                return false;
            }
        }
        return true;
    }

    public boolean mainRemplieAdv() {
        for (int i = 0; i < 3; i++) {
            if (TapisJ2[2] == null) {
                return false;
            }
        }
        return true;
    }

    public void ViderTapis() {
        for (int i = 0; i < 6; i++) {
            TapisJeu[i] = null;
        }
    }
    
    public void ViderMainJoueur() {
        for (int i = 0; i < 6; i++) {
            TapisJeu[i] = null;
        }
    }
    
    public void ViderMainAdv() {
        for (int i = 0; i < 6; i++) {
            TapisJeu[i] = null;
        }
    }
    

    public void RetournerFlop(){
        if ( RiverVisible==false && TurnVisible==false){
            FlopVisible=true;
            TapisJeu[0].Visible=true;
            TapisJeu[1].Visible=true;
            TapisJeu[2].Visible=true;
        }
        else {
            System.out.print("pas possible de retourner flop");
        }
    }
    
    public void RetournerTurn(){
        if ( FlopVisible==true && RiverVisible==false){
            TurnVisible=true;
            TapisJeu[3].Visible=true;
        }
        else {
            System.out.print("pas possible de retourner Turn");
        }
    }
    
    public void RetournerRiver(){
        if ( FlopVisible==true && TurnVisible==false){
            RiverVisible=true;
            TapisJeu[4].Visible=true;
        }
        else {
            System.out.print("pas possible de retourner River");
        }
    }
    
    public void AfficherTapis(){
        
    }
}

