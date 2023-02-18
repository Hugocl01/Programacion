/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja07.ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int num = comprobar(0, 100);
        System.out.println("El numero introducido es: " + num);
    }

    public static int comprobar(int a, int b) {
        int valido = 0;
        boolean salir = false;
        do {
            System.out.println("Introduce un numero:");
            try {
                valido = new Scanner(System.in).nextInt();
                if (valido > a && valido < b) {
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
        return valido;
    }
}
