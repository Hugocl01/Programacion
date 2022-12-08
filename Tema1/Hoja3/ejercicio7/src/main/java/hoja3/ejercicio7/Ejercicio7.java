/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja3.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        //Variables
        int hormigas;
        int aranas;
        int cochinillas;
        int patas;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero de hormigas");
        hormigas = teclado.nextInt();
        System.out.println("Introduce el numero de arañas");
        aranas = teclado.nextInt();
        System.out.println("Introduce el numero de cochinillas");
        cochinillas = teclado.nextInt();
        
        patas = (hormigas * 6) + (aranas * 8) + (cochinillas * 14);
        System.out.println("El numero total de patas es = " + patas);
    }
}
