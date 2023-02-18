/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja06.ejercicio1;

/**
 *
 * @author hugoc
 */
public class DeTres implements Series {

    //Atributos//Atributos
    private int valor;

    //Constructor
    public DeTres() {
        this.valor = inicio;
    }

    @Override
    public int getSiguiente() {
        return valor + 2;
    }

    @Override
    public void reiniciar() {
        this.valor = 0;
    }

    @Override
    public void setComenzar(int x) {
        this.valor = x;
    }
}
