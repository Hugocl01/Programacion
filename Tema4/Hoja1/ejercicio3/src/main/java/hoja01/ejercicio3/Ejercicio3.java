/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja01.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num;
        boolean encontrado = false;
        System.out.println("Introduce un numero");
        num = teclado.nextInt();
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) {
                System.out.println("Encontrado");
                System.out.println("Encontrado la posicion es: " + i);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Numero no encontrado");
        }
    }
}
