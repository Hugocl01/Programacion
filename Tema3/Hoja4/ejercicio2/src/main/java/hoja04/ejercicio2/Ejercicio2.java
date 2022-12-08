/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja04.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidad = 0;
        int contador = 0;
        for (int i = 1 ; cantidad <= 600 ; i++){
            System.out.println("Intoduce un donativo");
            cantidad += teclado.nextInt();
            contador = i;
        }
        System.out.println("Se ha alcanzado la cantidad con " + contador 
                + " donativos, cantidad total: " + cantidad);
    }
}
