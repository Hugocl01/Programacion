/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja05.ejercicio1;

/**
 *
 * @author hugoc
 */
public class Figura {

    private char[][] matriz;
    private char letra;

    public Figura(char caracter, int n) {
        this.letra = caracter;
        this.matriz = new char[n][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = caracter;
            }
        }
    }

    public String cuadrado() {
        String cadena = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                cadena += matriz[i][j] + " ";
            }
            cadena += "\n";
        }
        return cadena;
    }

    public String cuadradoVacio() {
        String cadena = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0 || i == matriz.length - 1) {
                    cadena += matriz[i][j] + " ";
                } else if (j == 0 || j == matriz[i].length - 1) {
                    cadena += matriz[i][j] + " ";
                } else {
                    cadena += " " + " ";
                }
            }
            cadena += "\n";
        }
        return cadena;
    }

    public String aspa() {
        String cadena = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    cadena += matriz[i][j] + " ";
                } else if (i + j == matriz.length-1) {
                    cadena += matriz[i][j] + " ";
                } else {
                    cadena += " " + " ";
                }
            }
            cadena += "\n";
        }
        return cadena;
    }

}
