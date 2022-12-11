/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja3.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        //Variables
        int entrada;
        int segundos = 0;
        int minutos = 0;
        int horas = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce los segundos");
        entrada = teclado.nextInt();
        horas = entrada / 3600;
        entrada = entrada - (horas * 3600);
        minutos = entrada / 60;
        entrada = entrada - (minutos * 60);
        segundos = entrada;
        System.out.println("Horas " + horas + " minutos " + minutos + " segundos " + segundos);
    }
}
