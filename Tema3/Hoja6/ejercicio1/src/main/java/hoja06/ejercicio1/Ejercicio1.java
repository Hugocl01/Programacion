/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja06.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Tarjeta t1 = new Tarjeta("Hugo", "12345678901234567890", 10000.50);
        System.out.println(t1.getPin());
        t1.setEstado(Estado.HABILITADA);
        System.out.println("Introduce el importe:");
        double importe = teclado.nextDouble();
        System.out.println("Introduce el PIN:");
        int pinUsuario = teclado.nextInt();
        t1.pagar(importe, pinUsuario, "descripcion", true);
        System.out.println(t1);
    }
}
