/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja08.ejercicio2;

/**
 *
 * @author DAW102
 */
public class Libro {

    //Atributos
    private String isbn;
    private String titulo;
    private String autor;

    //Constructor
    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean esEspanol() {
        String espanol = "84";
        boolean esEspanol = isbn.substring(3, 5).equals(espanol);
        return esEspanol;
    }

    public void mostar() {
        System.out.println(titulo.toUpperCase());
        System.out.println((autor.substring(0, 1).toUpperCase()).concat((autor.substring(1)).toLowerCase()));
    }
    
}
