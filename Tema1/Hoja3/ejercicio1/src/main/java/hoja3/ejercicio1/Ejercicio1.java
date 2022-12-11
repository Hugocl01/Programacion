/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja3.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        //Variables
        double num;
        double iva;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el precio");
        num = teclado.nextDouble();
        System.out.println("Introduce un IVA");
        iva = teclado.nextDouble();
        iva = num * iva / 100;
        System.out.printf("El IVA es = %,.2f\n" , iva);
        num = num + iva;
        System.out.printf("El precio total es= %,.2f\n" , num);
    }
}
