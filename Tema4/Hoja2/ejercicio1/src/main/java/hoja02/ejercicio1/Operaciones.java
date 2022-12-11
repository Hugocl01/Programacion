/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja02.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Operaciones {

    private int[] num = new int[5];

    public Operaciones() {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce un numero");
            num[i] = teclado.nextInt();
        }
    }

    public void multiplica() {
        for (int i = 0; i < num.length; i++) {
            num[i] *= 2;
            System.out.println(num[i]);
        }
    }

    public void mostrar() {
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    public int suma() {
        int suma = 0;
        for (int i = 0; i < num.length; i++) {
            if(i/2==0) {
                suma += num[i];
            }
        }
        return suma;
    }
}
