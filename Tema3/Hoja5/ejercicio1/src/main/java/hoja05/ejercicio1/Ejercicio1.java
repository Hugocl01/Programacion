/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja05.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero de filas");
        int filas = teclado.nextInt();
        int espacios = filas;
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= espacios; j++) {
                if (j == espacios) {
                    for (int k = 1; k <= i; k++) {
                        System.out.print("*");
                        if(k<i){
                            System.out.print("*");
                        }
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
            espacios--;
        }
    }
}
