/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja02.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Encargado extends Empleado{

    public Encargado(double sueldo) {
        super(sueldo*1.1);
    }

    @Override
    public double getSueldo() {
        return sueldo;
    }
    
}
