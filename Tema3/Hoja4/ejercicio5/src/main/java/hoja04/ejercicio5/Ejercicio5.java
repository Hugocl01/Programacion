/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja04.ejercicio5;

/**
 *
 * @author DAW102
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int mayor = 0;
        int menor = 100;
        for (int i = 0; i < 10; i++) {
            int num = (int) Math.floor(Math.random() * 100) + 1;
            System.out.println("El numero aleatorio " + i + "es: " + num);
            if (num > mayor) {
                mayor = num;
            }
            if (num < menor) {
                menor = num;
            }
        }
        System.out.println("La edad mayor es: " + mayor);
        System.out.println("La edad menor es: " + menor);
    }
}
