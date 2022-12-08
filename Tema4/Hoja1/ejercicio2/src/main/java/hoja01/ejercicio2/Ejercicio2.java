/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja01.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] temp = new int[10];
        double suma = 0;
        for (int i = 0; i < temp.length; i++) {
            System.out.println("Introduce la temperatura");
            temp[i] = teclado.nextInt();
            suma += temp[i];
        }
        System.out.println(suma / temp.length);
    }
}
