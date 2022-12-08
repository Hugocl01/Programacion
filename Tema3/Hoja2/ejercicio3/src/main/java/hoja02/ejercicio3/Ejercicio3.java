/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja02.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int opcion;
        double operacion = 0;
        System.out.println("Introduce un numero");
        num = teclado.nextInt();
        System.out.println("1-Cuadrado del numero");
        System.out.println("2-Doble del numero");
        System.out.println("3-Raiz cuadrada del numero");
        System.out.println("Introduce una opcion");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1 ->
                operacion = Math.pow(num, 2);
            case 2 ->
                operacion = num * 2;
            case 3 ->
                operacion = Math.sqrt(num);
            default ->
                System.out.println("No has selecionado ninguna opcion");
        };
        System.out.println("El resultado es: " + operacion);
    }
}
