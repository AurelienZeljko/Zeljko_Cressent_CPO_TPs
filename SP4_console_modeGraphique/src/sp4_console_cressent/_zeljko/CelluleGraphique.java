/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_cressent._zeljko;

import javax.swing.JButton;

/**
 *
 * @author aurelienzeljko
 */
public class CelluleGraphique extends JButton {
    Cellule celluleAssociee;
    
    public CelluleGraphique(Cellule uneCellule){
        celluleAssociee = uneCellule;
    }
}
