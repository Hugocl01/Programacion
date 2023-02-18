/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja04.ejercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author DAW102
 */
public class Libro extends Publicacion {

    private int numPaginas;

    public Libro(int numPaginas, String titulo, String autor, int anio, int mes, int dia) {
        super(titulo, autor, anio, mes, dia);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        //Fecha en formato español/España
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy")
                .withLocale(new Locale("es","ES"));
        return "Libro{" + " titulo: " + titulo + " autor: " + autor + " fecha: "
                + f + " numPaginas=" + numPaginas + '}';
    }

}
