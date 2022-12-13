/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja3.ejercicio10;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        //Variables
        double lanzamiento;
        
        //Pedimos los numeros por teclado
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el lanzamiento en metros");
        lanzamiento = teclado.nextDouble();
        System.out.printf("El lanzamiento en centimetros es de %d\n" , (int)(lanzamiento * 100));
    }
}
