/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja05.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce las horas");
        int horas = teclado.nextInt();
        System.out.println("Introduce los minutos");
        int min= teclado.nextInt();
        System.out.println("Introduce los segundos");
        int seg = teclado.nextInt();
        for (int i = horas; i <= 23; i++) {
            horas = 0;
            for (int j = min; j <= 59; j++) {
                min = 0;
                for (int k = seg; k <=59; k++) {
                    System.out.println(i + ":" + j + ":" + k);
                    seg = 0;
                }
            }
        }
    }
}
