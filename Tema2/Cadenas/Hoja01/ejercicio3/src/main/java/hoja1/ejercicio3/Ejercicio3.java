/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja3.ejercicio3;

/**
 *
 * @author hugoc
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        String cadena = "Hola Mundo Feliz";
        String cadenaRem = cadena;
        
        cadenaRem = cadenaRem.replace('a', 'o');
        cadenaRem = cadenaRem.replace('e', 'o');
        cadenaRem = cadenaRem.replace('i', 'o');
        cadenaRem = cadenaRem.replace('u', 'o');
        System.out.println(cadenaRem);
    }
}
