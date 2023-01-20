/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja08.ejercicio2;

/**
 *
 * @author DAW102
 */
public class Multiplicar {

    private int array[][];

    public Multiplicar() {
        this.array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            array[0][i] = i;
            array[i][0] = i;
        }
    }

    public void multiplica() {
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {
                array[i][j] = i * j;
            }
        }
    }

    public void muestra() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] >= 10) {
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print(array[i][j] + "  ");
                }
            }
            System.out.println("");
        }
    }

    public int[] valoresAspa() {
        int aspa[] = new int[20];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || ((array.length - i )== j)) {
                    aspa[i] = array[i][j];
                    System.out.print(aspa[i]+" ");

                }
            }
        }
        System.out.println("");
        return aspa;
    }

    public int[] tablaMultiplicar(int num) {
        int tabla[] = new int[10];
        for (int i = num; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                tabla[i] = array[num][i];
            }
        }
        return tabla;
    }
}
