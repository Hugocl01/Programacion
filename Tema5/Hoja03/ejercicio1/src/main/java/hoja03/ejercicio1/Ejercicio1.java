/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja03.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Cono cono1= new Cono(2,5);
        Cilindro cilindro1= new Cilindro(3,7);
        System.out.println("Cono:");
        System.out.printf("Area cono: %,.2f\n" , cono1.area());
        System.out.printf("Volumne cono: %,.2f\n" , cono1.volumen());
        System.out.println("Cilindro:");
        System.out.printf("Area cilindro: %,.2f\n" , cilindro1.area());
        System.out.printf("Volumne cilindro: %,.2f\n" , cilindro1.volumen());
    }
}
