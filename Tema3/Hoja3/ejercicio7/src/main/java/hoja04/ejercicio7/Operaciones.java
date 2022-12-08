/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja04.ejercicio7;

/**
 *
 * @author hugoc
 */
public class Operaciones {

    private int num;

    public Operaciones(int num) {
        this.num = num;
    }

    public void cifras() {
        int contador = 1;
        for (int i = 10; i < num; i *= 10) {
            if(num / i >= 1){
                contador++;
            } else {
                i = num;
            }
        }
        System.out.println("Tiene " + contador + " cifras");
    }

    public void multiplos() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public void perfecto() {
        int divisores = 0;
        for (int i = 1; i < num; i++) {
            if(num % i == 0){
                divisores += num / i;
            }
        }
        if(num != divisores){
            System.out.println("El numero es perfecto");
        } else {
            System.out.println("El numero no es perfecto");
        }
    }
}
