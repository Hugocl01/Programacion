/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja02.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Vectores {

    private int[] num = new int[5];

    public Vectores() {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce un numero");
            num[i] = teclado.nextInt();
        }
    }

    public int menor() {
        int menor = num[0];
        for (int i = 0; i < num.length; i++) {
            if (menor > num[i]) {
                menor = num[i];
            }
        }
        return menor;
    }

    public int mayor() {
        int mayor = num[0];
        for (int i = 0; i < num.length; i++) {
            if (mayor < num[i]) {
                mayor = num[i];
            }
        }
        return mayor;
    }

    public double media() {
        double suma = 0;
        for (int i = 0; i < num.length; i++) {
            suma += num[i];
        }
        return suma / num.length;
    }
}
