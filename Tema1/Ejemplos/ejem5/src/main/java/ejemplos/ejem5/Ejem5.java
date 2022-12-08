/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejemplos.ejem5;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Ejem5 {

    public static void main(String[] args) {
        byte edad = 0;
        boolean mayor = false;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Intoduce tu edad:");
        edad = teclado.nextByte();
        if (edad >= 18) {
            mayor = true;
            System.out.println(mayor);
        } else {
            mayor = false;
            System.out.println(mayor);
        }
    }
}
