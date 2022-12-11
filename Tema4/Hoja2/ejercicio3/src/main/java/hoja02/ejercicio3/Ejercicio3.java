/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja02.ejercicio3;

/**
 *
 * @author hugoc
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Invierno invierno1 = new Invierno(10);
        System.out.println("La temperatura media es: " + invierno1.tempMedia());
        System.out.println(invierno1.mostrar(invierno1.fahrenheit()));
        System.out.println(invierno1.mostrar(invierno1.getTemp()));
    }
}
