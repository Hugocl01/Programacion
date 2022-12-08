/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja01.ejercicio4;

/**
 *
 * @author hugoc
 */
public class Billete {
    private int distancia;
    private int numDias;

    public Billete(int distancia, int numDias) {
        this.distancia = distancia;
        this.numDias = numDias;
    }
    
    public double importe(){
        double precio;
        if (numDias > 7 && distancia > 800) {
            precio = distancia * 0.60 - (distancia * 0.60 * 30 / 100);
        } else {
            precio = distancia * 0.60;
        }
        return precio;
    }
}
