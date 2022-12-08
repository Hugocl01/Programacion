/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja1.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        /*Variables*/
        double x=0;
        double y=0;
        
        /*Introducciomos los valores de las variables*/
        System.out.println("Introduce el primer número: ");
        x = teclado.nextDouble();
        System.out.println("Introduce el segundo número: ");
        y = teclado.nextDouble();
        
        /*Imprimimos las operaciones*/
        System.out.println("x = " + x + " y = " + y);
        System.out.println("x + y = " +(x+y));
        System.out.println("x - y = " +(x-y));
        System.out.println("x * y = " +(x*y));
        System.out.println("x / y = " +(x/y));
        System.out.println("x ^ 2 = " + Math.pow(x ,2));
        System.out.println("√x = " + Math.sqrt(x));
    }
}
