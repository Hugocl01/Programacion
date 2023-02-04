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
public class Disco extends Publicacion {

    private int duracionMinutos;

    public Disco(int duracionMinutos, String titulo, String autor, int anio, int mes, int dia) {
        super(titulo, autor, anio, mes, dia);
        this.duracionMinutos = duracionMinutos;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
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
        return "Disco{" + " titulo: " + titulo + " autor: " + autor + " fecha: " + 
                fecha + " duracionMinutos: " + duracionMinutos + '}';
    }

}
