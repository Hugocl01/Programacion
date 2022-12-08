/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja07.ejercicio2;

/**
 *
 * @author DAW102
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(2,5,5);
        Triangulo t2 = new Triangulo(5,5,5);
        System.out.println("Triangulo 1 es isosceles: " + t1.esIsosceles());
        System.out.println("Triangulo 1 es equilatero: " + t1.esEquilatero());
        System.out.println("El perimetro del triangulo 1 es; " + t1.perimetro());
        System.out.println("Triangulo 2 es isosceles: " + t2.esIsosceles());
        System.out.println("Triangulo 2 es equilatero: " + t2.esIsosceles());
        System.out.println("El perimetro del triangulo 2 es; " + t2.perimetro());
    }
}
