/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja06.ejercicio3;

/**
 *
 * @author hugoc
 */
public class SintonizadorFM {

    private double frecuencia;

    //Constructor por defecto
    public SintonizadorFM() {
        this.frecuencia= 80;
    }

    //Constructor con parametros
    public SintonizadorFM(double frecuencia) {
        if (frecuencia < 80) {
            this.frecuencia = 80;
        } else {
            this.frecuencia = frecuencia;
        }
        if (frecuencia > 108) {
            this.frecuencia = 108;
        } else {
            this.frecuencia = frecuencia;
        }

    }

    //Constructor copia
    public SintonizadorFM(SintonizadorFM objRadio) {
        this.frecuencia = objRadio.frecuencia;
    }

    public void subir() {
        frecuencia += 0.5;
        if (frecuencia > 108) {
            frecuencia = 80;
        }
    }

    public void bajar() {
        frecuencia -= 0.5;
        if (frecuencia < 80) {
            frecuencia = 108;
        }
    }

    private void comprobarRango() {
        if (frecuencia > 108) {
            frecuencia = 80;
        }
        if (frecuencia < 80) {
            frecuencia = 108;
        }
    }

    public double mostrar() {
        return frecuencia;
    }

}
