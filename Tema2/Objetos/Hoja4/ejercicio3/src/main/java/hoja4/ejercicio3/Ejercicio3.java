/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja4.ejercicio3;

/**
 *
 * @author hugoc
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Monedero m1 = new Monedero(20);
        System.out.println("Creo mi monedero con 20 euros");
        m1.meterDinero(10.4);
        System.out.println("Añado al monedero 10,4 Euros");
        System.out.printf("Tienes = %,.2f\n" , m1.dineroDisponible());
        System.out.println("Intento sacar 50 euros");
        m1.sacarDinero(50);
        System.out.printf("Tienes = %,.2f\n" , m1.dineroDisponible());
        System.out.println("Intento sacar 20 euros");
        m1.sacarDinero(20);
        System.out.printf("Tienes = %,.2f\n" , m1.dineroDisponible());
    }
}
