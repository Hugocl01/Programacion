/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja05.ejercicio3;

import java.time.LocalDate;

/**
 *
 * @author hugoc
 */
public class Contacto implements Comparable<Contacto>{

    protected String nombre;
    protected String apellidos;
    protected int telefonoMovil;
    protected String email;
    protected LocalDate fechaNaacimiento;

    public Contacto(String nombre, String apellidos, int telefonoMovil, 
            String email, LocalDate fechaNaacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefonoMovil = telefonoMovil;
        this.email = email;
        this.fechaNaacimiento = fechaNaacimiento;
    }
    
    @Override
    public int compareTo(Contacto o) {
        return nombre.compareTo(o.nombre);
    }
    
    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", telefonoMovil=" + telefonoMovil + ", email=" + email + ", fechaNaacimiento=" + fechaNaacimiento + '}';
    }
    
}
