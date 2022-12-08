/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        //Variables
        double radio;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Intoduce el radio del circulo");
        radio = teclado.nextDouble();
        System.out.println("La longitud del circulo es= " + (2 * Math.PI * radio));
        System.out.println("El area del circulo es= " + (Math.PI * Math.pow(radio, 2)));
    }
}
