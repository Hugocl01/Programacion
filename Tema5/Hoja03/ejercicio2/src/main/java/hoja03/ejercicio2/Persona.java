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
public abstract class Persona {

    private String dni;
    private String nombre;
    private String direccion;

    public Persona() {
        System.out.println("Introduce el DNI:");
        this.dni = new Scanner(System.in).next();
        System.out.println("Introduce el nombre:");
        this.nombre = new Scanner(System.in).nextLine();
        System.out.println("Introduce el direccion:");
        this.direccion = new Scanner(System.in).nextLine();
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String mostrar() {
        return "Persona{" + "nombre= " + nombre + ", direccion= " + direccion + '}';
    }

}
