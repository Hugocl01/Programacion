/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja03.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Alumno extends Persona {

    private int[] notas;

    public Alumno(int numNotas) {
        super();
        this.notas = new int[numNotas];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Intoduce las notas:");
            notas[i]= new Scanner(System.in).nextInt();
        }
    }

    public String mostrar() {
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        media /= notas.length;
        return "DNI: " + this.getDni() + " Direccion: " + this.getDireccion()
                + " Nombre: " + this.getNombre() + " Media: " + media;
    }

}
