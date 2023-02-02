/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja03.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Cono extends Figura{

    public Cono(double radio, double altura) {
        super(radio, altura);
    }
    
    @Override
    public double area() {
        double diagonal= Math.sqrt((Math.pow(radio, 2)+Math.pow(altura, 2)));
        double area= Math.PI*radio*(radio+diagonal);
        return area;
    }
    
    @Override
    public double volumen() {
        double volumen = (Math.PI*Math.pow(radio, 2)*altura)/3;
        return volumen;
    }
}
