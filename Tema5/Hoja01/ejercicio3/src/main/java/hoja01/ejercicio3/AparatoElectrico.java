/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja01.ejercicio3;

/**
 *
 * @author DAW102
 */
public class AparatoElectrico {

    private static int consumoTotal = 0;
    private double potencia;
    private boolean encendido;

    public AparatoElectrico(double potencia) {
        this.potencia = potencia;
        this.encendido = false;
        System.out.println("Consumo total: " + consumoTotal + "W");
    }
    
    //Metodo estatico, se puede usar sin crear un objeto
    public static int consumo() {
        return consumoTotal;
    }

    public void enciende() {
        if (!encendido) {
            encendido = true;
            consumoTotal += potencia;
        } else {
            System.out.println("Ya esta encendido");
        }
    }

    public void apagado() {
        if (encendido) {
            encendido = false;
            consumoTotal -= potencia;
        } else {
            System.out.println("Ya esta apagado");
        }
    }
}
