/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja08.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Array {

    private int vector[];

    public Array() {
        this.vector = new int[10];
    }

    public void mostrar() {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
    }

    public void introducir() {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Introduce un valor en " + (i + 1) + ":");
            vector[i] = teclado.nextInt();

        }
        System.out.println("Has intoducido todos los datos");
    }

    public int media() {
        int suma = 0;
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
            cont++;
        }
        return suma / vector.length;
    }

    public void modificar(int num, int pos) {
        for (int i = 0; i <= pos - 1; i++) {
            if (i == pos - 1) {
                vector[i] = num;
            }
        }
    }

    public void rotarIzquierda() {
        int aux = vector[0];
        for (int i = 0; i < vector.length - 1; i++) {
            vector[i] = vector[i + 1];
        }
        vector[vector.length - 1] = aux;
    }

    public void rotarDerecha() {
        int aux = vector[vector.length - 1];
        for (int i = vector.length - 1; i > 0; i--) {
            vector[i] = vector[i - 1];
        }
        vector[0] = aux;
    }

    public void comparar(int a[]) {
        System.out.println("Elementos iguales en ambos arrays:");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == a[i]) {
                System.out.println(vector[i]);
            }
        }
    }

    public void sumaPares() {
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] / 2 == 0) {
                suma += vector[i];
            }
        }
        System.out.println("La suma de todos los numeros pares es: " + suma);
    }

    public void multiplos(int num) {
        for (int i = 0; i < vector.length; i++) {
            vector[i]= num*(i+1);
        }
    }
}
