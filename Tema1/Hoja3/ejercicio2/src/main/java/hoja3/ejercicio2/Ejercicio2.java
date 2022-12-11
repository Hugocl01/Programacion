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
        //Variables
        int num;
        int resultado = 0;
        int restante;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        num = teclado.nextInt();
        resultado = num % 7;
        restante = 7 - resultado;
        System.out.println("A " + num + " hay que sumarle " + restante 
                + ", para que el resultado sea multiplo de 7");
    }
}
