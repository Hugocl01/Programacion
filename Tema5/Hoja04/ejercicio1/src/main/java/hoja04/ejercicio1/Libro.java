/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja04.ejercicio1;

import java.time.LocalDate;

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
        return "Libro{" + " titulo: " + titulo + " autor: " + autor + " fecha: "
                + fecha + " numPaginas=" + numPaginas + '}';
    }

}
