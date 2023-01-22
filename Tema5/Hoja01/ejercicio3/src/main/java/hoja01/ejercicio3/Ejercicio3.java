/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja01.ejercicio3;

/**
 *
 * @author DAW102
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        System.out.println("Añadimos la bombilla y la pancha");
        AparatoElectrico bombilla = new AparatoElectrico(150);
        AparatoElectrico plancha = new AparatoElectrico(2000);
        System.out.println("Encendemos la bombilla y la plancha");
        bombilla.enciende();
        plancha.enciende();
        System.out.println("Consumo total: " + AparatoElectrico.consumo() + "W");
        System.out.println("Apagamos la bombilla");
        bombilla.apagado();
        System.out.println("Consumo total: " + AparatoElectrico.consumo() + "W");
     
    }
}
