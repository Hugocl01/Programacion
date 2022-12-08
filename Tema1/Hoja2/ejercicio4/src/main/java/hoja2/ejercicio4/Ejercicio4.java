/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        float altura;
        float base;
        float area;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la altura ");
        altura = teclado.nextFloat();
        System.out.println("Introduce la base ");
        base = teclado.nextFloat();
        area = (base*altura)/2;
        System.out.printf("El area del triangulo es: %,.2f%n" , area);
    }
}
