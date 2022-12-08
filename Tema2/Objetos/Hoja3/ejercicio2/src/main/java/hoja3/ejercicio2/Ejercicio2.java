/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja3.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //Primer objeto
        Numero n1 = new Numero();
        n1.suma(5);
        System.out.println("El valor despues de la suma es= " + n1.getNumA());
        n1.resta(1);
        System.out.println("El valor despues de la resta es= " + n1.getNumA());
        System.out.println("El doble del valor es= " + n1.doble());
        System.out.println("El triple del valor es= " + n1.triple());
        n1.setNumA(10);
        System.out.println("El valor es= " + n1.getNumA());
        
        //Segundo objeto
        Numero n2 = new Numero(5);
        System.out.println("El valor es= " + n2.getNumA());
        n2.suma(5);
        System.out.println("El valor despues de la suma es= " + n2.getNumA());
        n2.resta(1);
        System.out.println("El valor despues de la resta es= " + n2.getNumA());
        System.out.println("El doble del valor es= " + n2.doble());
        System.out.println("El triple del valor es= " + n2.triple());
        n2.setNumA(10);
        System.out.println("El valor es= " + n2.getNumA());
    }
}
