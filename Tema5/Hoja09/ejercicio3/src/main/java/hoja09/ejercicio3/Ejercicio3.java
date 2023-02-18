/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja09.ejercicio3;

/**
 *
 * @author DAW102
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        try {
            int[] array = new int[2];
            for (int i = 0; i < 10; i++) {
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException are) {
            System.out.println("Error matriz fuera de limites");
        }
    }
}
