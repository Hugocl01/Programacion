/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja04.ejercicio2;

/**
 *
 * @author DAW102
 */
public class Tabla {

    private int array[][];

    public Tabla() {
        this.array = new int[5][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                this.array[i][j] = (int) Math.floor(Math.random() * 100) + 1;
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(this.array[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public int mayorF(int fila) {
        fila--;
        int mayor = array[fila][0];
        for (int i = 0; i < array[fila].length; i++) {
            if (mayor < array[fila][i]) {
                mayor = array[fila][i];
            }
        }
        return mayor;
    }

    public int mayorC(int colum) {
        colum--;
        int mayor = array[0][colum];
        for (int i = 0; i < array.length; i++) {
            if (mayor < array[i][colum]) {
                mayor = array[i][colum];
            }
        }
        return mayor;
    }

    public double media() {
        double media = 0;
        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                media += this.array[i][j];
                cont++;
            }
        }
        return media / cont;
    }
}
