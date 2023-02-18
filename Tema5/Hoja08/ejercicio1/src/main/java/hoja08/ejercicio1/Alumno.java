/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja08.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Alumno {

    //Atributos
    private String nombre;
    private int[] notas;

    //Constructor
    public Alumno(int numNotas) {
        System.out.println("Introduce el nombre del alumno:");
        this.nombre = new Scanner(System.in).nextLine();
        this.notas = new int[numNotas];
        boolean acabado = false;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introduce la " + (i + 1) + "º nota:");
            notas[i] = Datos.agregarNota();
        }
    }

    public void mostar() {
        System.out.print("Nombre: " + nombre + "\t");
        System.out.print("Notas: ");
        for (int i = 0; i < notas.length; i++) {
            if (i < (notas.length - 1)) {
                System.out.print(notas[i] + ", ");
            } else {
                System.out.print(notas[i] + "\n");
            }
        }
    }

}
