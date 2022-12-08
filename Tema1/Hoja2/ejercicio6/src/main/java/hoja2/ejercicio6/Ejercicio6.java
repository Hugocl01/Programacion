/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja2.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        //Variables
        float radio;
        float altura;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Intoduce el radio del cilindro");
        radio = teclado.nextFloat();
        System.out.println("Intoduce la altura del cilindro");
        altura = teclado.nextFloat();

        //Sacamos por pantalla el resultado
        System.out.printf("Su área lateral es: %,.2f%n" , (2 * Math.PI * radio * altura));
        System.out.printf("Su volumen es: %,.2f%n" , (Math.PI * Math.pow(radio, 2) * altura));
    }
}
