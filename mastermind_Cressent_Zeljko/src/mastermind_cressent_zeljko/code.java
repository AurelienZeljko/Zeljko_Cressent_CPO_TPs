/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_cressent_zeljko;
import java.util.Random;
/**
 *
 * @author aurelienzeljko
 */
public class code {
    String[] code;
    String[] couleur = {"jaune", "rouge", "vert", "bleu", "violet", "cyan", "blanc", "gris"};
    

    code () {
        code = new String[4];
    }

    public String[] CodeSecret(){
        Random A = new Random();
        int B;
        String[]secret=new String[8];
        B = A.nextInt(8);
        for(int i=0;i<8;i++){
            secret[i]=couleur[i];
        }
        for (int i = 0; i < 4; i++) {
            B = A.nextInt(8);
            while(secret[B]==null){
                B = A.nextInt(8);
            }
            code[i] = secret[B];
            secret[B]=null;
        }
        return code;
    }
}
