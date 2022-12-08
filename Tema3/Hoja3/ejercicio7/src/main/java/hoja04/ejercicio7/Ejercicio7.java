/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja04.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int opc;
        System.out.println("Introduce el numero a operar");
        num = teclado.nextInt();
        Operaciones op1 = new Operaciones(num);
        do {
            System.out.println("Introduce una opcion");
            System.out.println("1.- contar cuantas cifras tiene");
            System.out.println("2.- escriba sus 10 primeros múltiplos");
            System.out.println("3.- decir si es perfecto");
            System.out.println("4.- salir");
            opc = teclado.nextInt();
            switch (opc) {
                case 1 -> op1.cifras();
                case 2 -> op1.multiplos();
                case 3 -> op1.perfecto();
                case 4 -> {
                }
                default -> System.out.println("No has introducido ninguna de estas opciones");
            }
        } while (opc != 4);
    }
}
