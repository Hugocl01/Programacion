/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja01.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Pajaro {

    private String color;
    private int edad;
    private static int numPajaros = 0;

    public Pajaro() {
        nuevoPajaro();
    }

    public Pajaro(String color, int edad) {
        this.color = color;
        this.edad = edad;
        nuevoPajaro();
    }
    
    private static void nuevoPajaro() {
        numPajaros++;
    }
    
    public static void muestraPajaro() {
        System.out.println("El numero de pajaros es: " + numPajaros);
    }
}
