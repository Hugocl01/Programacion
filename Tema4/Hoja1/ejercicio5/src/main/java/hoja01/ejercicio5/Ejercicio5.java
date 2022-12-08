/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja01.ejercicio5;

/**
 *
 * @author hugoc
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int reserva;
        for (int i = 0; i < array.length; i++) {
            reserva = array[i];
            if (array.length / 2 > i) {
                array[i] = array[array.length-1-i];
            }
            array[array.length-1-i] = reserva;
            System.out.println(array[i]);
        }
    }
}
