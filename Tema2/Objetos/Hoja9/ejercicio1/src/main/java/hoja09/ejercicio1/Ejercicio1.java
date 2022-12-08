/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja09.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la temperatura");
        Alarma alarma1 = new Alarma(teclado.nextDouble());
        System.out.println("Llamamos al metodo comprueba");
        alarma1.comprueba();
        System.out.println("La temperatura es: " + alarma1.getTemperatura());
        System.out.println("Timbre encendido? " + alarma1.isTimbre());
    }
}
