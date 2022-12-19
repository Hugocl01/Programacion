/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja05.ejercicio3;

/**
 *
 * @author hugoc
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Serie s1 = new Serie('+');
        Serie s2 = new Serie('*');
        System.out.println(s1.resultado());
        System.out.println(s2.resultado());
    }
}
