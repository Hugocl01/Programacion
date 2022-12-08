/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja01.ejercicio6;

/**
 *
 * @author hugoc
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int[] array1 = {10,2,3,41,5,6,70,8,98,100};
        int mayor = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > mayor) {
                mayor = array1[i];
            }
        }
        System.out.println("El numero mayor es: " + mayor);
    }
}
