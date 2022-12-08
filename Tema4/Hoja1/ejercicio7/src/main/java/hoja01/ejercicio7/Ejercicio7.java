/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja01.ejercicio7;

/**
 *
 * @author hugoc
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int[] array = {11, 20, 23, 4, 55, 68, 17, 81, 39, 10};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    int aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
            System.out.println(array[i]);
        }
    }
}
