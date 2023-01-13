/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja07.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Alumno hugo = new Alumno("Hugo");
        System.out.println("Introduce la nota que quieres buscar:");
        int num = teclado.nextInt();
        System.out.println("Posicion del numero buscado: " + hugo.buscar(num));
        int array[] = hugo.tresMejores();
        System.out.println("Las 3 mejores notas son:");
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + "º nota: " + array[i]);
        }
        System.out.println("Mayor nota: " + hugo.mayor());
        System.out.println("Menor nota: " + hugo.menor());
        hugo.ponerACero();
        System.out.println("----Notas despues de poner a 0----");
        hugo.mostrar();
    }
}
