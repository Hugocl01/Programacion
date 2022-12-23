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
        Agenda agenda1 = new Agenda(4);
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
                    agenda1.insertar();
                case 2 ->
                    agenda1.mostar();
                case 3 -> {
                    System.out.println("Introduce el nombre del contacto:");
                    String nombre = new Scanner(System.in).nextLine();
                    agenda1.buscar(nombre);
                }
                case 4 ->
                    System.out.println("Numero de contactos en la agenda: " + agenda1.getCont());
                case 5 -> {
                    System.out.println("Introduce el nombre del contacto:");
                    String nombre = new Scanner(System.in).nextLine();
                    agenda1.modificar(nombre);
                }
                case 6 ->
                    System.out.println("Has salido del programa");
                default ->
                    System.out.println("No has introducido una opcion dentro del rango:");
            };
        } while (opc != 6);
    }
}
