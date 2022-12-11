/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja02.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Invierno {

    private double[] temp;

    public Invierno(int num) {
        Scanner teclado = new Scanner(System.in);
        temp = new double[num];
        for (int i = 0; i < temp.length; i++) {
            System.out.println("Introduce un numero");
            temp[i] = teclado.nextDouble();
        }
    }

    public double tempMedia() {
        double suma = 0;
        for (int i = 0; i < temp.length; i++) {
            suma += temp[i];
        }
        return suma / temp.length;
    }

    public double[] fahrenheit() {
        double[] fahrenheit = new double[temp.length];
        for (int i = 0; i < temp.length; i++) {
            fahrenheit[i] = temp[i] * 1.8 + 32;
        }
        return fahrenheit ;
    }

    public String mostrar(double temp[]) {
        String cadena = "";
        for (int i = 0; i < temp.length; i++) {
            cadena+=temp[i]+" ";
        }
        return cadena;
    }

    public double[] getTemp() {
        return temp;
    }
    
}
