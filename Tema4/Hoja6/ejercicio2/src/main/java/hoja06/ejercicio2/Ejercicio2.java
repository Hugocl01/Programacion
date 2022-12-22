/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja06.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Banco banco1 = new Banco(3);
        int opc;
        do {
            System.out.println("****MENU****");
            System.out.println("1. Ingresar un cliente");
            System.out.println("2. Mostar los usuarios del banco");
            System.out.println("3. Buscar cliente");
            System.out.println("4. Eliminar un cliente");
            System.out.println("5. Salir");
            System.out.println("Introduce una opcion:");
            opc = teclado.nextInt();
            switch (opc) {
                case 1 ->
                    banco1.ingresar();
                case 2 ->
                    banco1.mostrar();
                case 3 ->
                    banco1.buscar();
                case 4 -> {
                    System.out.println("Introduce el id del usuario que quieras eliminar");
                    int num = teclado.nextInt();
                    banco1.eliminar(num);
                }
                case 5 ->
                    System.out.println("Introduce una opcion:");
                default ->
                    System.out.println("Introduce una opcion:");

            };
        } while (opc != 5);
    }
}
