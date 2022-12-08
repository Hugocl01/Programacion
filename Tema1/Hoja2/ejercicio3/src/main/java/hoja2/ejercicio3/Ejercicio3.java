/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        
        double euros;
        double peseta = 166.3860;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el precio de la vivienda en euros ");
        euros = teclado.nextDouble();
        System.out.printf("El precio de la vivienda en euros es: %,.2f%n" , euros);
        System.out.printf("El precio de la vivienda en pesetas es: %,.3f%n" , (peseta * euros));
        
    }
}
