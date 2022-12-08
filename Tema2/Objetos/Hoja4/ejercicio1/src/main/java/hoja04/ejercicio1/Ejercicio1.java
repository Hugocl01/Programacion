/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja04.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo((float)10.0f);
        
        c1.setRadio((float)6.30f);
        System.out.println("Radio del circulo de primer circulo una vez "
                + "establecido un radio: " + c1.getRadio());
        
        System.out.println("Radio del circulo de segundo circulo nada "
                + "más crearlo: " + c2.getRadio());
    }
}
