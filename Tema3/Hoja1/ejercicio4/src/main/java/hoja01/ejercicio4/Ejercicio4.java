/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja01.ejercicio4;

/**
 *
 * @author hugoc
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Billete b1 = new Billete(800, 7);
        System.out.println(b1.importe());
        Billete b2 = new Billete(1000, 8);
        System.out.println(b2.importe());
    }
}
