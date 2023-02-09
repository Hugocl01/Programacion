/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja05.ejercicio2;

/**
 *
 * @author hugoc
 */
public class Gato extends Mamifero implements Domestico, Felino {

    private String nombre;

    public Gato(String nombre, String raza, int nPatas, String alimento) {
        super(raza, nPatas, alimento);
        this.nombre = nombre;
    }

    @Override
    public String arañar() {
        return "araña";
    }

    @Override
    public String obedecer() {
        return "obedece";
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + super.toString() + '}';
    }

}
