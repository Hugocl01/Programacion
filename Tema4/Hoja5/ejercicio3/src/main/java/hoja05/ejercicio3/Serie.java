/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja05.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Serie {

    private double[][] num;
    private char tipo;

    public Serie(char tipo) {
        Scanner teclado = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Introduce el numero de filas de la matriz:");
        x = teclado.nextInt();
        System.out.println("Introduce el numero de columnas de la matriz:");
        y = teclado.nextInt();
        this.num = new double[x][y];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.println("Introduce el valor de X: " + (i + 1) + " Y: " + (j + 1));
                num[i][j] = teclado.nextDouble();
            }
        }
        this.tipo = tipo;
    }

    public double resultado() {
        double total = 0;
        if (this.tipo == '+') {
            for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < num[i].length; j++) {
                    total += num[i][j];
                }
            }
        }
        if (this.tipo == '*') {
            total = 1;
            for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < num[i].length; j++) {
                    total *= num[i][j];
                }
            }
        }
        return total;
    }
}
