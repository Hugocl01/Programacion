/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja3.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        //Variable
        int a, b, c, x;
        double y;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce a");
        a = teclado.nextInt();
        System.out.println("Introduce b");
        b = teclado.nextInt();
        System.out.println("Introduce c");
        c = teclado.nextInt();
        System.out.println("Introduce x");
        x = teclado.nextInt();
        y = (a * Math.pow(x, 2) + (b*x) + c);
        System.out.println("El resultado de y es = " + y);
    }
}
