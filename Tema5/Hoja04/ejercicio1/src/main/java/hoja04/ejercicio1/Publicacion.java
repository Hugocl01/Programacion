/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja04.ejercicio1;

import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;

/**
 *
 * @author DAW102
 */
public abstract class Publicacion {

    protected String titulo;
    protected String autor;
    protected LocalDate fecha;

    public Publicacion(String titulo, String autor, int anio, int mes, int dia) {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = LocalDate.of(anio, mes, dia);
    }

    @Override
    public abstract String toString();
    
}
