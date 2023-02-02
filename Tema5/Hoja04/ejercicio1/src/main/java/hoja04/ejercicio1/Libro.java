/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja04.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Libro extends Publicacion {

    private int numPaginas;

    public Libro(int numPaginas, String titulo, String autor, int dia, int mes, int anio) {
        super(titulo, autor, dia, mes, anio);
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "numPaginas=" + numPaginas + '}';
    }

}
