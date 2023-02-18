/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja07.ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int numA = 0;
        int numB = 0;
        double division = 0;
        boolean salir = false;
        do {
            System.out.println("Introcude un numero:");
            try {
                numA = new Scanner(System.in).nextInt();
                salir = true;
            } catch (InputMismatchException e) {
                System.out.println("El numero introducido no es entero");
            }
        } while (!salir);
        salir = false;
        do {
            System.out.println("Introduce otro numero:");
            try {
                numB = new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
                System.out.println("El numero introducido no es entero");
            }
            try {
                division = numA / numB;
                if (numB == 0) {
                    throw new ArithmeticException("No se puede dividir por 0");
                }
                salir = true;
            } catch (ArithmeticException ae) {
                System.out.println(ae.getMessage());
            }
        } while (!salir);
        System.out.println("Division= " + division);
    }
}
