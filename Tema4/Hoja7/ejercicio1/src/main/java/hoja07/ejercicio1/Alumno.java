/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja07.ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Alumno {

    private String nombre;
    private int notas[];

    public Alumno(String nombre) {
        Scanner teclado = new Scanner(System.in);
        this.nombre = nombre;
        this.notas = new int[5];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introduce la " + (i + 1) + " nota:");
            notas[i] = teclado.nextInt();
        }
    }

    public int mayor() {
        Arrays.sort(notas);
        return notas[notas.length - 1];
    }

    public int menor() {
        Arrays.sort(notas);
        return notas[0];
    }

    public void ponerACero() {
        Arrays.fill(notas, 0);
    }

    public int buscar(int nota) {
        Arrays.sort(notas);
        return Arrays.binarySearch(notas, nota);
    }

    public int[] tresMejores() {
        Arrays.sort(notas);
        int array[] = Arrays.copyOfRange(notas, 2, 5);
        return array;
    }

    public void mostrar() {
        for (int i = 0; i < notas.length; i++) {
            System.out.println((i + 1) + "º nota:" + notas[i]);
        }
    }
}
