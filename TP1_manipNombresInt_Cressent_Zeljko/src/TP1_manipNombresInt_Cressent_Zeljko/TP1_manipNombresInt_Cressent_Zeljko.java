/*
 * TP1
 * 18/10
 */
package TP1_manipNombresInt_Cressent_Zeljko;

import java.util.Scanner;

/**
 *
 * @author aurelienzeljko
 */
public class TP1_manipNombresInt_Cressent_Zeljko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int nb1;
    int nb2;
    int somme;
    int difference;
    int produit;
    int quotient;
    int reste;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("\n Entrer un entier :");
    nb1=sc.nextInt();
    
    Scanner sc1 = new Scanner(System.in);
    System.out.println("\n Entrer un deuxieme entier :");
    nb2=sc.nextInt();
    
    somme=nb1+nb2;
    System.out.println("la somme de nb1 et nb2 est : " + somme);
    
    difference=nb1-nb2;
    System.out.println("la difference de nb1 et nb2 est : " + difference);
    
    produit=nb1*nb2;
    System.out.println("le produit de nb1 et nb2 est : " + produit);
    
    quotient=nb1/nb2;
    reste=nb1%nb2;
    System.out.println("le quotient de nb1 et nb2 est : " + quotient +" et le reste est " + reste);
    }
    
}
