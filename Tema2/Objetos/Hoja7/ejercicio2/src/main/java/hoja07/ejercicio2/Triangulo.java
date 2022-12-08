/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja07.ejercicio2;

/**
 *
 * @author DAW102
 */
public class Triangulo {

    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public boolean esIsosceles() {
        boolean esIsosceles = (lado1 == lado2 < lado3 )|| 
        (lado1 == lado3  <lado2)||( lado2 == lado3  < lado1);
        return esIsosceles;
    }

    public boolean esEquilatero() {
        boolean esEquilatero = lado1 == lado2 && lado1 == lado3 && lado2 == lado3;
        return esEquilatero;
    }

    public double perimetro() {
        double perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }
}
