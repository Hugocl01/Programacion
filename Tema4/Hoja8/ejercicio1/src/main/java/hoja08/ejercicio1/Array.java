/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja08.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Array {

    private int vector[][];

    public Array() {
        this.vector = new int[10][10];
    }

    public void mostrar() {
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                System.out.print(vector[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void introducir() {
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                System.out.println("Introduce un valor en " + (i + 1) + (j + 1) + ":");
            }
        }
    }

}
