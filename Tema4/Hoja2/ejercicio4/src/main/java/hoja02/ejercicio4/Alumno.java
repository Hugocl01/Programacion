/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja02.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Alumno {

    private String nombre;
    private int[] notas = new int[5];

    public Alumno(String nombre) {
        this.nombre = nombre;
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introduce la " + (i + 1) + "º nota ");
            notas[i] = teclado.nextInt();
        }
    }

    public int mayor() {
        int mayor = notas[1];
        for (int i = 0; i < notas.length; i++) {
            if (mayor < notas[i]) {
                mayor = notas[i];
            }
        }
        return mayor;
    }
    
    public int menor() {
        int menor = notas[1];
        for (int i = 0; i < notas.length; i++) {
            if (menor > notas[i]) {
                menor = notas[i];
            }
        }
        return menor;
    }
    
    public String mostrar(){
        return String.format("Nombre: %s" ,nombre);
        
    }
}
