/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja04.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int matriz1[][] = {{101, 102, 103, 104, 105}, {201, 202, 203, 204, 205},
        {301, 302, 303, 304, 305}, {401, 402, 403, 404, 405}, {501, 502, 503, 504, 505}};
        int opcion = 0;
        do {
            System.out.println("****Menu****");
            System.out.println("1.-Mostrar elementos de una fila");
            System.out.println("2.-Mostrar elementos de una columna");
            System.out.println("3.-Mostar elementos de la diagonal");
            System.out.println("4.-Mostar elementos de la diagonal inversa");
            System.out.println("5.-Mostar elementos de la diagonal hacia arriba");
            System.out.println("6.-Salir");
            System.out.println("Intruduce una opcion:");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Introduce la fila");
                    int fila = teclado.nextInt() - 1;
                    if (fila < matriz1.length - 1 && fila >= 0) {
                        for (int i = 0; i < matriz1[fila].length; i++) {
                            System.out.println(matriz1[fila][i]);
                        }
                    } else {
                        System.out.println("El numero de fila no es valido");
                    }
                }
                case 2 -> {
                    System.out.println("Introduce la columna");
                    int colum = teclado.nextInt() - 1;
                    if (colum < matriz1[colum].length - 1 && colum >= 0) {
                        for (int i = 0; i < matriz1.length; i++) {
                            System.out.println(matriz1[i][colum]);
                        }
                    } else {
                        System.out.println("El numero de columna no es valido");
                    }
                }
                case 3 -> {
                    for (int i = 0 , j = 0; i < matriz1.length; i++ , j++) {
                        System.out.println(matriz1[i][j]);
                    }
                }
                case 4 -> {
                    for (int i = matriz1.length - 1, j= matriz1[i].length - 1; i >= 0 && j >= 0; i--, j--) {
                        System.out.println(matriz1[i][j]);
                    }
                }
                case 5 -> {
                    for (int i = matriz1.length - 1, j = 0; i >= 0 && j < matriz1[i].length; i--, j++) {
                        System.out.println(matriz1[i][j]);
                    }
                }
                case 6 -> {
                    System.out.println("Has salido del programa");
                }
                default -> {
                    System.out.println("El numero no es valido");
                }
            }
        } while (opcion != 6);
    }
}
