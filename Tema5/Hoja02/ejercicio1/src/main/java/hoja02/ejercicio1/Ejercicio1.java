/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja02.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double sueldo;
        System.out.println("Introduce el sueldo del empleado");
        sueldo= teclado.nextDouble();
        Empleado emp = new Empleado(sueldo);
        System.out.println("Sueldo de empleado: " + emp.getSueldo());
        Encargado encar = new Encargado(emp.getSueldo());
        System.out.println("Sueldo del encargado: " + encar.getSueldo());
    }
}
