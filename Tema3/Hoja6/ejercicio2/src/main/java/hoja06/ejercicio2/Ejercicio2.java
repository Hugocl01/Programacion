/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja06.ejercicio2;

/**
 *
 * @author hugoc
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Carta carta1 = new Carta();
        System.out.println(carta1.mostrar());
        Carta carta2 = new Carta();
        System.out.println(carta2.mostrar());
        if (carta1.getNum()>carta2.getNum()){
            System.out.println(carta1.mostrar() + " es la carta ganadora");
        } else if (carta2.getNum()>carta1.getNum()){
            System.out.println(carta2.mostrar() + " es la carta ganadora");
        } else {
            System.out.println("Las cartas son iguales");
        }
    }
}
