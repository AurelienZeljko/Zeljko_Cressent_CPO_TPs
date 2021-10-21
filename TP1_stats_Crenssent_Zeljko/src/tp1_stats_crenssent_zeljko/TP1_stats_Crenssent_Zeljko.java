/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_crenssent_zeljko;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aurelienzeljko
 */
public class TP1_stats_Crenssent_Zeljko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [] Tab = new double [6];
        Tab[0]=0;
        Tab[1]=0;
        Tab[2]=0;
        Tab[3]=0;
        Tab[4]=0;
        Tab[5]=0;
        System.out.println("\n Entrer un entier :");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int x=0;
        while ( x < m) {
            x+=1;
            Random generateurAleat = new Random();
            int n = generateurAleat.nextInt(6);
            Tab[n]=Tab[n]+1;

        }
        System.out.println("le tableau est :"+Arrays.toString(Tab));
        x=0;
        while ( x < 6) {
            Tab[x]= (Tab[x]/m) * 100 ;
            x=x+1;
            
        }
        System.out.println("le tableau en % est :"+Arrays.toString(Tab));
        }
        
        
        
    }
    

