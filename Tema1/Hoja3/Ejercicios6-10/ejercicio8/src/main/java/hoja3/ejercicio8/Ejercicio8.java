/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja3.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        //Variables
        int infantil;
        int adulto;
        double precioInfantil = 15.50;
        double precioAdulto = 20;
        double total;
        double resultado;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero de entradas infantiles");
        infantil = teclado.nextInt();
        System.out.println("Introduce el numero de entradas para adultos");
        adulto = teclado.nextInt();

        //Calculamos la suma de todas las entradas
        total = (infantil * precioInfantil) + (adulto * precioAdulto);

        //En caso de que el importe total sea igual o superior debemos aplicar un 5% de descuento
        resultado = total >= 100 ? total - (total * 0.05) : total;

        //Se saca el resultado por pantalla
        System.out.printf("El importe total es = %,.2f€\n", resultado);
    }
}
