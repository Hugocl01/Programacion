/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja3.ejercicio9;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        //Variables
        int numA , numB;
        boolean igual;
        
        //Pedimos los numeros por teclado
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        numA = teclado.nextInt();
        System.out.println("Introduce el segundo numero");
        numB= teclado.nextInt();
        
        //Condicion para que la salida sea true
        igual = numA == numB;
        
        //Se saca el resultado por pantalla
        System.out.println(igual);
    }
}
