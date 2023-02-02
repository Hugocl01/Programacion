/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja02.ejercicio3;

/**
 *
 * @author DAW102
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Circulo cir = new Circulo();
        Cuadrado cua = new Cuadrado();
        Triangulo tri = new Triangulo();
        Rombo rom = new Rombo();
        System.out.println("Circulos:");
        cir.identidad();
        System.out.println(cir.toString());
        System.out.println("Cuadrados:");
        cua.identidad();
        System.out.println(cua.toString());
        System.out.println("Triangulos:");
        tri.identidad();
        System.out.println(tri.toString());
        System.out.println("Rombos:");
        rom.identidad();
        System.out.println(rom.toString());
        
    }
}
