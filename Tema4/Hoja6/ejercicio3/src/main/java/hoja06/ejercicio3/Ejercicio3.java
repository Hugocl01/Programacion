/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja06.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc;
        do {
            System.out.println("****Menu****");
            System.out.println("1. Nuevo contacto");
            System.out.println("2. Mostar la agenda");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Ver numero de contactos en la agenda");
            System.out.println("5. Modificar telefono de la agenda");
            System.out.println("6. Salir");
            System.out.println("Introduce una opcion:");
            opc = teclado.nextInt();
            switch (opc) {
                case 1 ->
                case 2 ->
                case 3 ->
                case 4 ->
                case 5 ->
                case 6 ->
                default ->
            }
        } while (opc != 6);
    }
}
