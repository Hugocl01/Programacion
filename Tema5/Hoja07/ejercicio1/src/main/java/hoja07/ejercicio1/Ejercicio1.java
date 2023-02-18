/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja07.ejercicio1;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author DAW102
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        boolean salir = false;
        int entero = 0;
        double decimal = 0;
        do {
            System.out.println("Introduce un numero entero: ");
            try {
                entero = new Scanner(System.in).nextInt();
                salir = true;
            } catch (InputMismatchException e) {
                System.out.println("El numero introducido no es entero");
            }
        } while (!salir);
        salir = false;
        do {
            System.out.println("Introduce un numero decimal: ");
            try {
                decimal = new Scanner(System.in).nextDouble();
                salir = true;
            } catch (InputMismatchException e) {
                System.out.println("El numero introducido no es decimal");
            }
        } while (!salir);
        System.out.println("Numero introducidos correctamente");
        System.out.println("Entero: " + entero);
        System.out.println("Decimal: " + decimal);
    }
}
