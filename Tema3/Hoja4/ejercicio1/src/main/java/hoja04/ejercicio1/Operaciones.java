/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja04.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Operaciones {

    public static void metodo1() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = teclado.nextInt();
        for (int i = num; i <= num; i--) {
            if (num % i == 0) {
                System.out.println("Los divisores son: " + i);
            }
        }
    }

    public static void metodo2() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int n1 = teclado.nextInt();
        System.out.println("Introduce un numero: ");
        int n2 = teclado.nextInt();
        if (n1 > n2) {
            int cambio = n1;
            n1 = n2;
            n2 = cambio;
        }
        for (int i = n1; i <= n2; i++) {
            if (i % 2 != 0) {
                System.out.println("El numero " + i + " es impar");
            }
        }
    }

    public static void metodo3() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = teclado.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void metodo4() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int a = teclado.nextInt();
        System.out.println("Introduce un numero: ");
        int b = teclado.nextInt();
        int cociente = 0;
        for (int i = 1; a >= b; i++) {
            System.out.println("NumeroA: " + a + " /NumeroB: " + b + " = " + (a -= b));
            cociente = i;
        }
        System.out.println("Numero cociente: " + cociente);
        System.out.println("Resto: " + a);
    }
}
