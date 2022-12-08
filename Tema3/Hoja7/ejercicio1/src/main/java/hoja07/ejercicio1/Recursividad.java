/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja07.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Recursividad {

    public static int factorial(int num) {
        int factorial;
        if (num > 1) {
            factorial = num * factorial(num - 1);
        } else {
            factorial = 1;
        }
        return factorial;
    }

    public static int sumaSusNumeros(int num) {
        int suma;
        if (num > 1) {
            suma = num + sumaSusNumeros(num - 1);
        } else {
            suma = num;
        }
        return suma;
    }

    public static void imprimeNumeros(int num) {
        if (num > 0) {
            imprimeNumeros(num - 1);
            System.out.print(num);
        }
    }

    public static int numeroDigitos(int num) {
        if (num <= 0) {
            return 0;
        }
        return 1 + numeroDigitos(num / 10);
    }

    public static int potencia(int num, int exp) {
        if (exp == 0) {
            return 1;
        } else if (exp == 1){
            return num;
        } else {
            return num * potencia(num, exp - 1);
        }
    }
}
