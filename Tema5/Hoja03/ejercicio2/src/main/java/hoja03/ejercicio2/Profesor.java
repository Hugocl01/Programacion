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
public class Profesor extends Persona {

    private String[] asignaturas;

    public Profesor(int numAsignaturas) {
        super();
        this.asignaturas = new String[numAsignaturas];
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println("Introduce la asignatura:");
            asignaturas[i]= new Scanner(System.in).nextLine();
        }
    }

    public String mostrar() {
        String cadena = "";
        for (int i = 0; i < asignaturas.length; i++) {
            if (i < asignaturas.length - 1) {
                cadena.concat(asignaturas[i] + ", ");
            } else {
                cadena.concat(asignaturas[i] + ".");
            }
        }
        return "DNI: " + this.getDni() + " Direccion: " + this.getDireccion()
                + " Nombre: " + this.getNombre() + " Asignaturas: " + cadena.toUpperCase();
    }
}
