/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja03.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Calculo {

    public Calculo() {

    }

    public static void metodo1() {
        int num = 10;
        while (num > 0) {
            System.out.println(num--);
        }
        System.out.println("¡DESPLIEGUE!");
    }

    public static void metodo2() {
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        int num;
        int positivos = 0;
        int negativos = 0;
        int nulos = 0;
        do {
            System.out.println("Introduce un numero");
            num = teclado.nextInt();
            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                nulos++;
            }
            contador++;
        } while (contador < 10);
        System.out.println("Positivos: " + positivos
                + " negativos: " + negativos + " nulos: " + nulos);
    }

    public static void metodo3() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = teclado.nextInt();
        int factorial = 1;
        while (num > 0) {
            factorial *= num;
            num--;
        }
        System.out.println("El factorial del numero es: " + factorial);
    }

    public static void metodo4() {
        Scanner teclado = new Scanner(System.in);
        char caracter;
        int contador = 0;
        do {
            System.out.println("Introduce un caracter");
            caracter = teclado.next().charAt(0);
            if (caracter != '.'){
                contador++;
            }
        } while (caracter != '.');
        System.out.println("Numero de caracteres intoducidos: " + contador);
    }

    public static void metodo5() {
        Scanner teclado = new Scanner(System.in);
        int num;
        int contador = 0;
        double media = 0;
        do {
            System.out.println("Introduce un numero");
            num = teclado.nextInt();
            if (num > 0) {
                media += num;
                contador++;
            }
        } while (num > 0);
        media /= contador;
        System.out.println("La media de los numero es: " + media);
    }
}
