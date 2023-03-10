/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja06.ejercicio1;

/**
 *
 * @author DAW102
 */
public class DeDos implements Series {
    //Atributos
    private int valor;
    private int anterior;

    //Constructor
    public DeDos() {
        this.valor = inicio;
        this.anterior = inicio - 2;
    }

    @Override
    public int getSiguiente() {
        return valor += 2;
    }

    public int getAnterior() {
        return anterior - 2;
    }
    
    @Override
    public void reiniciar() {
        this.valor = 0;
    }

    @Override
    public void setComenzar(int x) {
        this.anterior = this.valor;
        this.valor = x;
    }
    
}
