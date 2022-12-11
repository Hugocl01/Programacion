/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja01.ejercicio2;

import java.time.LocalDate;

/**
 *
 * @author hugoc
 */
public class Mascota {

    private String nombre;
    private LocalDate fechaNacimiento;

    public Mascota(String nombre, int anio, int mes, int dia) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {

    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

}
