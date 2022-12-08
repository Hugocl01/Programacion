/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja05.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero de lineas");
        int lineas = teclado.nextInt();
        for (int i = 0; i < lineas; i++) {
            for (int j = 0; j < 9; j++) {
                int x= (int) Math.floor(Math.random()*9)+1;
                System.out.print(x);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
