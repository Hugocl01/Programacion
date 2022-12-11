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
public class Curso {

    private String curso;
    public String[] alumnos;

    public Curso(int numAlumnos, String curso) {
        this.curso = curso;
        Scanner teclado = new Scanner(System.in);
        this.alumnos = new String[numAlumnos];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Introduce el " + (i + 1) + "º nombre");
            alumnos[i] = new Scanner(System.in).nextLine();
        }
    }

    public void iniciales() {
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print(alumnos[i].charAt(0) + ".");
        }
        System.out.print("\n"); //Salto de linea
    }

    public void desplaza() {
        String ultimo = alumnos[alumnos.length - 1];
        for (int i = alumnos.length - 1; i > 0; i--) {
            if (i > 0) {
                alumnos[i] = alumnos[i - 1];
                alumnos[0] = ultimo;
            }
        }
    }

    public String verNombre(int posicion) {
        String nombre = alumnos[posicion - 1];
        return nombre;
    }

    public boolean esDaw() {
        boolean daw = this.curso.toUpperCase().contains("DAW");
        return daw;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
