/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja1.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(10);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el radio de c3");
        Circulo c3 = new Circulo(teclado.nextDouble());
        c1.setRadio(5);
        System.out.printf("El radio de c1 es= %,.2f\n" , c1.getRadio());
        System.out.printf("El radio de c3 es= %,.2f\n" , c3.getRadio());
        System.out.printf("El area de c2 es= %,.2f\n" , c2.area());
        System.out.printf("El area de c3 es= %,.2f y la longitud es=  y la longitud es= %,.2f\n"
                , c3.area() , c3.longitud());
    }
}
