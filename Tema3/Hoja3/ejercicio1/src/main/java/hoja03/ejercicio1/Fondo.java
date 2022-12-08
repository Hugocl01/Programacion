/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja03.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Fondo {

    private double c;
    private double i;
    private int n;

    public Fondo(double c, double i, int n) {
        this.c = c;
        this.i = i;
        this.n = n;
    }

    public void evolucion() {
        int contador = 1;
        double cFinal = 0;
        do {
            cFinal = c + (c * i / 100 * contador);
            System.out.println("Capital el año " + contador + " es: " + cFinal);
            contador++;
        } while (contador <= n);
    }

}
