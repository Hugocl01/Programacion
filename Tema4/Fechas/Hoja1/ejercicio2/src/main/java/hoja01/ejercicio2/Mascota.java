/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja01.ejercicio2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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

    public long getEdad() {
        return ChronoUnit.YEARS.between(LocalDate.now(), fechaNacimiento);  //Años entre fecha actual y fecha de nacimiento
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", Fecha de nacimiento=" + fechaNacimiento + '}';
    }

}
