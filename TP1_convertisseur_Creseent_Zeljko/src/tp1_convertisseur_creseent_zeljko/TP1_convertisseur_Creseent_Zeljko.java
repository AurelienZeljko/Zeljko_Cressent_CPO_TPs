/*
 * TP1
 * 18/10
 */
package tp1_convertisseur_creseent_zeljko;

import java.util.Scanner;

/**
 *
 * @author aurelienzeljko
 */
public class TP1_convertisseur_Creseent_Zeljko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double nb1;
        double nb2;
        double nb3;
        double nb4;
        double nb5;
        System.out.println(" 1) celcius->Kelvin \n 2) Farenheit-->Celcius \n 3) Celcius-->Farenheit \n 4) Kelvin-->Farenheit \n 5) Farenheit-->Kelvin ");
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer l'operateur :");
        int operateur = sc.nextInt();

        if (operateur < 6 && operateur >= 1) {

            if (operateur == 1) {
                System.out.println("\n Bonjour, saisissez la valeur :");
                double A = sc.nextDouble();
                nb1 = CelciusVersKelvin(A);
                System.out.println("la temperature en kelvin est : " + nb1 + "K");
            }

            if (operateur == 2) {
                System.out.println("\n Bonjour, saisissez la valeur :");
                double B = sc.nextDouble();
                nb2 = FarenheitVersCelcius(B);
                System.out.println("la temperature en degres est : " + nb2 + "°");
            }
            if (operateur == 3) {
                System.out.println("\n Bonjour, saisissez la valeur :");
                double C = sc.nextDouble();
                nb3 = CelciusVersFarenheit(C);
                System.out.println("la temperature en farenheit est : " + nb3 + "°F");
            }
            if (operateur == 4) {
                System.out.println("\n Bonjour, saisissez la valeur :");
                double D = sc.nextDouble();
                nb4 = KelvinVersFarenheit(D);
                System.out.println("la temperature en fareheint est : " + nb4 + "°F");
            }
            if (operateur == 5) {
                System.out.println("\n Bonjour, saisissez la valeur :");
                double E = sc.nextDouble();
                nb5 = FarenheitVersKelvin(E);
                System.out.println("la temperature en Kelvin est : " + nb5 + "K");
            }
        }
        else {
            System.out.println("\n La valeur de l'operateur n'est pas comprise entre 1 et 5");
        }
    }

    

    public static double CelciusVersKelvin(double tempC) {
        double tempK;
        tempK = tempC + 273.15;
        return tempK;
    }

    public static double FarenheitVersCelcius(double tempF) {
        double tempC;
        tempC = (tempF - 32) * (5 / 9.0);
        return tempC;
    }

    public static double CelciusVersFarenheit(double tempC) {
        double tempF;
        tempF = tempC * (9 / 5.0) + 32;
        return tempF;
    }

    public static double KelvinVersFarenheit(double tempK) {
        double tempF;
        tempF = tempK * (9 / 5.0) - 459.67;
        return tempF;
    }

    public static double FarenheitVersKelvin(double tempF) {
        double tempK;
        tempK = (tempF + 459.67) * (5 / 9.0);
        return tempK;
    }

}
