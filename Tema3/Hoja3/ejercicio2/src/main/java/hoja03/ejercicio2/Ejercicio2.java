/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja03.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc;
        do {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Salir");
            opc = teclado.nextInt();
            switch (opc) {
                case 1 ->  Calculo.metodo1();
                case 2 ->  Calculo.metodo2();
                case 3 ->  Calculo.metodo3();
                case 4 ->  Calculo.metodo4();
                case 5 ->  Calculo.metodo5();
                case 6 ->  System.out.println("Saliste del programa");
                default -> System.out.println("El numero introducido no esta entre el 1 y el 6");
            }
        }while (opc != 6);
    }
}
