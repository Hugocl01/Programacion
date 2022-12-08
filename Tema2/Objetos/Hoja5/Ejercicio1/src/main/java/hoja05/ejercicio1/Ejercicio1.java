/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja05.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Restaurante r1 = new Restaurante(3,4);
        System.out.println("Numero de huevos= " + r1.getHuevos());
        System.out.printf("Kilos de chorizo= %,.2f\n" , r1.getChorizo());
        r1.addHuevos(1);
        r1.addChorizos(0.5);
        System.out.println("Añadimos una docena de huevos y medio kilo de chorizo");
        System.out.println("Numero de huevos= " + r1.getHuevos());
        System.out.printf("Kilos de chorizo= %,.2f\n" , r1.getChorizo());
        System.out.printf("Numero de platos que puedo hacer= %,.0f\n" , r1.getNumPlatos());
        r1.sirvePlato();
        System.out.println("Servimos un plato");
        System.out.printf("Numero de platos que puedo hacer= %,.0f\n" , r1.getNumPlatos());
        System.out.println("Numero de huevos= " + r1.getHuevos());
        System.out.printf("Kilos de chorizo= %,.2f\n" , r1.getChorizo());
    }
}
