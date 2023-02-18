/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja07.ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        boolean salir = false;
        int num = 0;
        int cont = 0;
        do {
            System.out.println("Introduce un numero entre 0 y 100:");
            cont++;
            try {
                num = new Scanner(System.in).nextInt();
                if (num > 0 && num < 100) {
                    salir = true;
                } else {
                    throw new Exception("El numero esta fuera del rango");
                }
            } catch (InputMismatchException ime) {
                System.out.println("El numero introducido no es entero");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } while (!salir);
        System.out.println("El numero introducido es: " + num
                + " Numero de intentos: " + cont);
    }
}
