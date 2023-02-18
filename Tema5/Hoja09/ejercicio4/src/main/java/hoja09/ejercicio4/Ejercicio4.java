/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja09.ejercicio4;

/**
 *
 * @author DAW102
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        try {
            throw new MiExcepcion("Error de mi excepcion");
        } catch (MiExcepcion mi) {
            System.out.println(mi.getMessage());
        }
    }
}
