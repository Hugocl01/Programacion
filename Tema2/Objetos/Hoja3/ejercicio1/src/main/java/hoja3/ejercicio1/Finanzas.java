/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio1;

/**
 *
 * @author hugoc
 */
public class Finanzas {
    private double cambio;

    public Finanzas() {
        cambio = 1.06;
    }

    public Finanzas(double cambio) {
        this.cambio = cambio;
    }
    
    public double dolaresToEuros(double cantidad){
        cantidad*=cambio;
        return cantidad;
    }
    
    public double eurosToDolares(double cantidad){
        cantidad/=cambio;
        return cantidad;
    }
}
