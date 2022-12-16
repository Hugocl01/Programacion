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

            System.out.println("fila");
            int fila = 0;
            for (int i = fila; i < matriz1.length; i++) {
                System.out.println(matriz1[fila][i]);
            }

            System.out.println("columna");
            int colum = 0;
            for (int i = fila; i < matriz1.length; i++) {
                System.out.println(matriz1[i][colum]);
            }

            System.out.println("diagonal");
            for (int i = 0; i < matriz1.length; i++) {
                System.out.println(matriz1[i][i]);
            }

            System.out.println("diagonal inversa");
            for (int i = matriz1.length - 1; i >= 0; i--) {
                System.out.println(matriz1[i][i]);
            }
            
            System.out.println("diagonal hacia arriba");
            for (int i = matriz1.length - 1, j = matriz1.length -1; i >= 0; i--, j--) {
                System.out.println(matriz1[i][i]);
            }
        } while (opcion != 6);
    }
}
