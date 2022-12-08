/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja3.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        //Variables
        double cambio;
        
        Scanner teclado = new Scanner(System.in);
        //Primer objeto
        Finanzas finanza1 = new Finanzas();
        System.out.println("Introduce la cantidad de dolares");
        cambio = teclado.nextDouble();
        System.out.printf("El cambio a euros es= %,.2f€\n" , finanza1.dolaresToEuros(cambio));
        System.out.println("Introduce la cantidad de euros");
        cambio = teclado.nextDouble();
        System.out.printf("El cambio a euros es= %,.2f€\n" , finanza1.eurosToDolares(cambio));
        
        //Segundo objeto
        Finanzas finanza2 = new Finanzas(1.10);
        System.out.println("Introduce la cantidad de dolares");
        cambio = teclado.nextDouble();
        System.out.printf("El cambio a euros es= %,.2f€\n" , finanza2.dolaresToEuros(cambio));
        
    }
}
