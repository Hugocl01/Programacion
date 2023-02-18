/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja10.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Griego extends Guerrero {

    public Griego(String nombre, int edad, int fuerza) {
        super(nombre, edad, fuerza);
    }

    public boolean retirarse() {
        boolean retirada = false;
        if (this.herido && !this.muerto) {
            retirada = true;
        }
        return retirada;
    }
}
