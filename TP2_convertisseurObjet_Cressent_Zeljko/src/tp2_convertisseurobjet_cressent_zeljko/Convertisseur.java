/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_cressent_zeljko;

/**
 *
 * @author aurelienzeljko
 */
public class Convertisseur {

    int nbConversions=0;

    public  double CelciusVersKelvin(double tempC) {
        nbConversions++;
        double tempK;
        tempK = tempC + 273.15;
        return tempK;
    }

    public double FarenheitVersCelcius(double tempF) {
            nbConversions++;
        double tempC;
        tempC = (tempF - 32) * (5 / 9.0);
        return tempC;
    }

    public double CelciusVersFarenheit(double tempC) {
            nbConversions++;
        double tempF;
        tempF = tempC * (9 / 5.0) + 32;
        return tempF;
    }

    public double KelvinVersFarenheit(double tempK) {
            nbConversions++;
        double tempF;
        tempF = tempK * (9 / 5.0) - 459.67;
        return tempF;
    }

    public double FarenheitVersKelvin(double tempF) {
            nbConversions++;
        double tempK;
        tempK = (tempF + 459.67) * (5 / 9.0);
        return tempK;
    }

    public Convertisseur() {
        nbConversions = 0;
    }
    @Override
    public String toString () {
        return "nb de conversions"+ nbConversions;
    }
}
