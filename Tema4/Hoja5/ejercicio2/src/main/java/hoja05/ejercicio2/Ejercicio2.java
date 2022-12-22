/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja05.ejercicio2;

/**
 *
 * @author hugoc
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        //Primer objeto
        Sopa sopa1 = new Sopa();
        sopa1.mostar();
        System.out.println("");
        //Segundo objeto
        Sopa sopa2 = new Sopa(20,25);
        sopa2.mostar();
        sopa2.setPalabra("Rata", 2, 0, 1);
        sopa2.mostar();
    }
}
