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

    public AparatoElectrico(double potencia, boolean encendido) {
        this.potencia = potencia;
        this.encendido = encendido;
        System.out.println("Consumo total: " + consumoTotal + "W");
    }

    public static int consumo() {
        return consumoTotal;
    }

    public void enciende() {
        if (!encendido) {
            encendido = true;
            consumoTotal += potencia;
        }
    }

    public void apagado() {
        if (encendido) {
            encendido = false;
            consumoTotal -= potencia;
        }
    }
}
