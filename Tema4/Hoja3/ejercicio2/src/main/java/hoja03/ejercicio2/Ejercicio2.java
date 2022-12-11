/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja03.ejercicio2;

/**
 *
 * @author hugoc
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Curso c1 = new Curso(4, "1ºDAW");
        c1.iniciales();
        c1.desplaza();
        System.out.println(c1.verNombre(2));
        System.out.println(c1.esDaw());
    }
}
