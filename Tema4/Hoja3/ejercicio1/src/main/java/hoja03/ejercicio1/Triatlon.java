/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja03.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Triatlon {

    private int dorsal;
    private String nombre;
    private int[] puntuaciones;

    public Triatlon(int dorsal, String nombre, int numPruebas) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.puntuaciones = new int[numPruebas];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < puntuaciones.length; i++) {
            System.out.println("Introduce la puntuacion nº " + (i + 1) + ":");
            puntuaciones[i] = teclado.nextInt();
        }
    }

    public Triatlon() {
        Scanner teclado = new Scanner(System.in);
        int numPruebas;
        System.out.println("Introduce el dorsal:");
        this.dorsal = teclado.nextInt();
        System.out.println("Introduce el nombre:");
        this.nombre = teclado.nextLine();
        System.out.println("Introduce el numero de pruebas:");
        numPruebas = teclado.nextInt();
        this.puntuaciones = new int[numPruebas];
        for (int i = 0; i < puntuaciones.length; i++) {
            System.out.println("Introduce la puntuacion nº " + (i + 1) + ":");
            puntuaciones[i] = teclado.nextInt();
        }
    }

    public double pMedia() {
        int suma = 0;
        for (int i = 0; i < puntuaciones.length; i++) {
            suma += puntuaciones[i];
        }
        return suma / puntuaciones.length;
    }

    public boolean esSelecionado() {
        int mayor = puntuaciones[0];

        for (int i = 0; i < puntuaciones.length; i++) {
            if (puntuaciones[i] > mayor) {
                mayor = puntuaciones[i];
            }
        }
        boolean alcanzado = mayor > 10;
        return alcanzado;
    }

    public String mostrar() {
        String puntos = "";
        for (int i = 0; i < puntuaciones.length; i++) {
            puntos += puntuaciones[i];
            if (i < puntuaciones.length - 1) {
                puntos += ", ";
            }
        }
        return "Dorsal: " + dorsal + " Nombre: " + nombre + " Puntos: " + puntos
                + " Media: " + pMedia();
    }

}
