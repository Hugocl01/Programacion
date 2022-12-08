/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio3;

/**
 *
 * @author hugoc
 */
public class Monedero {
    private double dinero;

    public Monedero(double dinero) {
        this.dinero = dinero;
    }
    
    public void meterDinero(double dinero){
        this.dinero+= dinero;
    }
    
    public void sacarDinero(double dinero){
        if (this.dinero-dinero<0) {
            System.out.println("No hay saldo suficiente");
        }else{
            this.dinero-= dinero;
        }
    }

    public double dineroDisponible() {
        return dinero;
    }
    
    
}
