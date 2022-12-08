/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja05.ejercicio4;

/**
 *
 * @author DAW102
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i+=10) {
            System.out.println("Ciclo Nº " + i);
            for (int j = 0; j < 10; j++) {
                System.out.println(j+i);
            }
        }
    }
}
