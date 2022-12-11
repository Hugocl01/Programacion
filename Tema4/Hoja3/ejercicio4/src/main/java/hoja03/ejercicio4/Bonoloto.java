/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja03.ejercicio4;

/**
 *
 * @author hugoc
 */
public class Bonoloto {

    private int[] numeros;

    public Bonoloto() {
        this.numeros = new int[6];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) Math.floor(Math.random() * 49) + 1;
            for (int j = 0; j < i; j++) {
                do {
                    numeros[i] = (int) Math.floor(Math.random() * 49) + 1;
                } while (numeros[i] == numeros[j]);
            }
        }
    }

    public String mostrar() {
        String cadena = "";
        for (int i = 0; i < numeros.length; i++) {
            cadena += (numeros[i] + " ");
        }
        return cadena;
        
    }
}
