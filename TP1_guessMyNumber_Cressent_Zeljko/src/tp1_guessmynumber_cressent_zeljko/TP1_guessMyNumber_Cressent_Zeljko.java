/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_cressent_zeljko;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aurelienzeljko
 */
public class TP1_guessMyNumber_Cressent_Zeljko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        //System.out.println(n);
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer un nombre entre 0 et 100 :");
        int nb1 = sc.nextInt();
        while (nb1 != n) {
                if (nb1 == n) {
                    System.out.println("\n gagné");
                    break;
                }
                if (nb1 < n) {
                    System.out.println("\n trop petit");
                    
                }
                if (nb1 > n) {
                    System.out.println("\n trop grand");
                }   
                System.out.println("\n Entrer un nombre entre 0 et 100 :");
                nb1 = sc.nextInt();

        }
    }

}
