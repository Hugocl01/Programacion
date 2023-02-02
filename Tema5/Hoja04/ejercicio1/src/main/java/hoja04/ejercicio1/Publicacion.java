/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja04.ejercicio1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author DAW102
 */
public abstract class Publicacion {

    protected String titulo;
    protected String autor;
    protected LocalDate fecha;

    public Publicacion(String titulo, String autor, int dia, int mes, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = LocalDate.of(dia, mes, anio);
    }

    @Override
    public abstract String toString();
    
}
