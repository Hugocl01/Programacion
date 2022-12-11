/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja03.ejercicio3;

/**
 *
 * @author hugoc
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Comunidad comu = new Comunidad("Cataluña", 4);  //Barcelona, Gerona, Lérida y Tarragona
        System.out.println("Mostramos");
        System.out.println(comu.mostrar());
        System.out.println("Sorteo");
        System.out.println(comu.sorteo());
        System.out.println("Buscar");
        System.out.println(comu.buscar("Barcelona"));
    }
}
