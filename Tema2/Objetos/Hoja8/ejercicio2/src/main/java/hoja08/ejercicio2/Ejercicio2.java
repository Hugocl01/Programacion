/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja08.ejercicio2;

/**
 *
 * @author DAW102
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Libro libro1 = new Libro("9788467941159", "Chainsaw Man", "Tatsuki Fujimoto");
        System.out.println("Es español? " + libro1.esEspanol());
        libro1.mostar();
        System.out.println("");
        
        Libro libro2 = new Libro("9780439023481", "Los juegos del hambre", "suzanne collins ");
        System.out.println("Es español? " + libro2.esEspanol());
        libro2.mostar();
    }
}
