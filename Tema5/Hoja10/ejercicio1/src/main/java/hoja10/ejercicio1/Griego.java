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
    
    //Constructor
    public Griego(String nombre, int edad, int fuerza) {
        super(Estaticos.introducirNombre(), Estaticos.introducirEdad(), Estaticos.introducirFuerza());
    }

    //Metodo
    @Override
    public boolean retirarse() {
        boolean retirada = false;
        if (this.isHerido() && !this.isMuerto()) {
            retirada = true;
        }
        return retirada;
    }
}
