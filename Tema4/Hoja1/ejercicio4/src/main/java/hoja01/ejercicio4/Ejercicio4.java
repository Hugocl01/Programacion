/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja01.ejercicio4;

/**
 *
 * @author DAW102
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        int[] der = {1,2,3,4,5,6,7,8,9,10};
        int[] izq = new int[10];
        for (int i = der.length-1, j = 0; i >= 0 && j< izq.length; i-- , j++) {
            izq[j] = der[i];
            System.out.print(izq[j]);
        }
    }
}
