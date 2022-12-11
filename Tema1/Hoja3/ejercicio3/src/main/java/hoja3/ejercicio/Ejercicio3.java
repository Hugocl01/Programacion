/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja3.ejercicio;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        //variable
        int num;
        int num2;
        int resultado = 0;
        int restante;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        num = teclado.nextInt();
        System.out.println("Introduce un numero");
        num2 = teclado.nextInt();
        resultado = num % num2;
        restante = num2 - resultado;
        System.out.println("A " + num + " hay que sumarle " + restante 
                + ", para que el resultado sea multiplo de" + num2);
        
    }
}
