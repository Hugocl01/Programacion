/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja05.ejercicio2;

/**
 *
 * @author hugoc
 */
public class Sopa {

    private char[][] array;

    //Constructores
    public Sopa() {
        this.array = new char[10][20];
        String letras = "QWERTYUIOPASDFGHJKLÑZXCVBNM";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = letras.charAt((int) Math.floor(Math.random() * letras.length() - 1) + 1);
            }
        }
    }

    public Sopa(int filas, int columnas) {
        String letras = "QWERTYUIOPASDFGHJKLÑZXCVBNM";
        this.array = new char[filas][columnas];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = letras.charAt((int) Math.floor(Math.random() * letras.length() - 1) + 1);
            }
        }
    }

    //Metodos
    public void mostar() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void setPalabra(String palabra, int x, int y, int d) {

    }
}
