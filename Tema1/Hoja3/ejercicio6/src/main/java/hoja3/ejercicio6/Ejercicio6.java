/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja3.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        //Variables
        double mili;
        double centi;
        double metros;
        double resultado;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Intoduce los milimetros");
        mili = teclado.nextDouble();
        System.out.println("Intoduce los centimetros");
        centi = teclado.nextDouble();
        System.out.println("Intoduce los metros");
        metros = teclado.nextDouble();
        
        mili/=10;
        metros*=100;
        resultado= mili + centi + metros;
        System.out.printf("La suma de todas las longitudes es = %,.2f\n" , resultado);      
    }
}
