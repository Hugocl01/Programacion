/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja09.ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 500 - 1 + 1) + 1;
        boolean salida = false;
        int num = 0;
        int intentos = 0;
        System.out.println("****Adivina el numero****");
        do {
            System.out.println("Introduce un numero entre 1 y 500:");
            intentos++;
            try {
                num = new Scanner(System.in).nextInt();
                if (num == x) {
                    salida = true;
                } else if (num > 500 || num < 1) {
                    throw new Exception("El numero esta fuera de rango");
                } else if (num > x) {
                    throw new Exception("El numero es menor");
                } else {
                    throw new Exception("El numero es mayor");
                }
            } catch (InputMismatchException ime) {
                System.out.println("No has introducido un numero entero");
            } catch (Exception ran) {
                System.out.println(ran.getMessage());
            }
        } while (!salida);
        System.out.println("Numero de intentos: " + intentos);
    }
}
