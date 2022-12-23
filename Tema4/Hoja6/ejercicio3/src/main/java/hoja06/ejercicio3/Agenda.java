/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja06.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Agenda {

    private Persona[] personas;
    private int cont;

    public Agenda(int num) {
        this.personas = new Persona[num];
        this.cont = 0;
    }

    public void insertar() {
        Scanner teclado = new Scanner(System.in);
        boolean aux = false;
        String nombre;
        int telefono;
        System.out.println("Intro");
        for (int i = 0; i < cont; i++) {
            if ((personas[i].getNombre().equalsIgnoreCase("")) && (personas[i].getTelefono() == 0) && !aux) {
                System.out.println("Intoduce el nombre del nuevo contacto:");
                nombre = new Scanner(System.in).nextLine();
                System.out.println("Intoduce el numero del nuevo contacto:");
                telefono = teclado.nextInt();
                personas[i] = new Persona(nombre, telefono);
                System.out.println("Nuevo contacto guardado");
                aux = true;
            }
        }
    }

    public void mostar() {
        System.out.println("AGENDA:");
        for (int i = 0; i < cont; i++) {
            System.out.println(personas[i].getNombre() + ": " + personas[i].getTelefono());
        }
    }

    public void buscar(String nombre) {
        for (int i = 0; i < cont; i++) {
            if (personas[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(personas[i].getNombre() + ": " + personas[i].getTelefono());
            } else {
                System.out.println("Persona no encontrada");
            }
        }
    }

    public void modificar(String nombre) {
        Scanner teclado = new Scanner(System.in);
        int telefono;
        for (int i = 0; i < cont; i++) {
            if (personas[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(personas[i].getNombre() + ": " + personas[i].getTelefono());
                System.out.println("Introduce el telefono actual:");
                telefono = teclado.nextInt();
                System.out.println("Datos actualizados:");
                System.out.println(personas[i].getNombre() + ": " + personas[i].getTelefono());
            } else {
                System.out.println("Persona no encontrada");
            }
        }
    }

    public int getCont() {
        return cont;
    }

}
