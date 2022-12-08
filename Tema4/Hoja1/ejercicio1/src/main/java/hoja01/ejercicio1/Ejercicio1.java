/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja01.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int[] num = {-2, -2, -2, -2, -2, -2, -2, -2, -2, -2};
        for (int i = 0; i < num.length; i++) {
            num[i] = -1;
            System.out.println(num[i]);
        }

        for (int i = 0; i < num.length - 1; i++) {
            num[i] = (int) Math.floor(Math.random() * 10) + 1;
            for (int j = i + 1; j < num.length - 1; j++) {
                do {
                    num[i] = (int) Math.floor(Math.random() * 10) + 1;
                } while (num[i] == num[j]);
            }
            System.out.println(num[i]);
        }
    }
}
