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

        //Random generateurAleat = new Random();
        //int n = generateurAleat.nextInt(100);
        //System.out.println(n);
        //Scanner sc = new Scanner(System.in);
        //System.out.println("\n Entrer un nombre entre 0 et 100 :");
        //int nb1 = sc.nextInt();
        //int t = 1;
        System.out.println(" 1) facile \n 2) moyen \n 3) difficile ");
        System.out.println("\n Entrer l'operateur :");
        Scanner sc = new Scanner(System.in);
        int operateur = sc.nextInt();
        if (operateur == 1) {
            Random generateurAleat = new Random();
            int n = generateurAleat.nextInt(100);
            //System.out.println(n);
            System.out.println("\n Entrer un nombre entre 0 et 100 :");
            int nb1 = sc.nextInt();
            int t = 1;
            while (nb1 != n) {
                t = t + 1;
                if (nb1 == n) {
                    System.out.println("\n gagné");
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
            System.out.println("vous avez gagné en :" + t + "essai");
        }
        if (operateur == 2) {
            Random generateurAleat = new Random();
            int n = generateurAleat.nextInt(500);
            //System.out.println(n);
            System.out.println("\n Entrer un nombre entre 0 et 500 :");
            int nb1 = sc.nextInt();
            int t = 1;
            while (nb1 != n) {
                t = t + 1;
                if (nb1 == n) {
                    System.out.println("\n gagné");
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
            System.out.println("vous avez gagné en :" + t + "essai");
        }
        if (operateur == 3) {
            Random generateurAleat = new Random();
            int n = generateurAleat.nextInt(1000);
            //System.out.println(n);
            System.out.println("\n Entrer un nombre entre 0 et 1000 :");
            int nb1 = sc.nextInt();
            int t = 1;
            while (nb1 != n) {
                t = t + 1;
                if (nb1 == n) {
                    System.out.println("\n gagné");
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
            System.out.println("vous avez gagné en :" + t + "essai");

        }
    }
}
