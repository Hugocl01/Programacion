/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja01.ejercicio3;

/**
 *
 * @author hugoc
 */
public class Llamada {

    private int duracion;

    public Llamada() {
        this.duracion = 0;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public double aPagar(int minutos, int segundos) {
        double precio;
        if ((minutos == 1 && segundos == 0) || (minutos == 0 && segundos >0)) {
            precio = 0.25;
        } else {
            precio = 0.25 + (segundos / 10 * 0.1);
        }
        return precio;
    }
}
