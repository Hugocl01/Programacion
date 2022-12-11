/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja03.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Comunidad {

    private String nombre;
    private String[] provincias;

    public Comunidad(String nombre, int numProvincias) {
        Scanner teclado = new Scanner(System.in);
        this.nombre = nombre;
        this.provincias = new String[numProvincias];
        for (int i = 0; i < provincias.length; i++) {
            System.out.println("Introduce la " + (i + 1) + "º provincia");
            provincias[i] = teclado.next();
        }
    }

    public String mostrar() {
        String cadena = "";
        for (int i = 0; i < provincias.length; i++) {
            if (provincias[i].length() >= 3) {
                cadena += provincias[i].substring(0, 3) + " ";
            } else {
                cadena += provincias[i] + " ";
            }

        }
        return String.format(nombre.toUpperCase(), cadena);
    }

    public String sorteo() {
        int random = (int) Math.floor(Math.random() * provincias.length) + 1;
        return provincias[random];
    }

    public int buscar(String nombre) {
        int posicion = -1;
        for (int i = 0; i < provincias.length; i++) {
            if (nombre.equalsIgnoreCase(provincias[i])) {
                posicion = i;
            }
        }
        return posicion;
    }
}
