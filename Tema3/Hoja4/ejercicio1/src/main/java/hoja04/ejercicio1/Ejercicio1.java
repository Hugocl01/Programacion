/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja04.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("Introduce una opcion: ");
            opcion = teclado.nextInt();
            System.out.println("1- Metodo 1");
            System.out.println("2- Metodo 2");
            System.out.println("3- Metodo 3");
            System.out.println("4- Metodo 4");
            System.out.println("5- Salir");
            System.out.println("-----------");
            switch (opcion){
                case 1: Operaciones.metodo1();
                case 2: Operaciones.metodo2();
                case 3: Operaciones.metodo3();
                case 4: Operaciones.metodo4();
            }
        }while(opcion != 5);
        System.out.println("Salieste del programa");
    }
}
