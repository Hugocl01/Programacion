/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hojamain.ejercicio2;

/**
 *
 * @author DAW102
 */
public class Ejercicio2 {

    private String nombre;
    private int edad;
    
    public static void main(String[] args) {
        System.out.println("Nombre: " + args[0] + " Edad: " + args[1]);
        if (Integer.parseInt(args[1]) >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}
