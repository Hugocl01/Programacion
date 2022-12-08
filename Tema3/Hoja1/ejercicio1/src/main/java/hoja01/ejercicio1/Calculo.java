/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja01.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Calculo {

    //Atributos
    private Scanner teclado = new Scanner(System.in);

    //Metodos
    public void metodo1() {
        teclado = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num = teclado.nextInt();
        if (num >= 100 && num <= 1000) {
            System.out.println("Esta entre 100 y 1000");
        } else {
            System.out.println("No esta entre 100 y 1000");
        }
    }

    public void metodo2() {
        teclado = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num = teclado.nextInt();
        if (num > 0) {
            System.out.println("El numero es positivo");
        } else if (num < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es nulo");
        }
    }

    public void metodo3() {
        teclado = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num = teclado.nextInt();
        if (num % 2 == 0 && num % 5 == 0) {
            System.out.println("Es divisible entre 2 y 5");
        } else {
            System.out.println("No es divisible entre 2 y 5");
        }
    }

    public void metodo4() {
        teclado = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        double num = teclado.nextDouble();
        if (num % 1 == 0) {
            System.out.println("El numero no tiene parte fraccionaria");
        } else {
            System.out.println("El numero tiene parte fraccionaria");
        }
    }

    public void metodo5() {
        teclado = new Scanner(System.in);
        System.out.println("Introduce un numero entre 1900 y 2100:");
        int num = teclado.nextInt();
        if (num >= 1900 && num <= 2100) {
            if ((num % 4 == 0) && ((num % 100 == 0) || (num % 400 != 0))) {
                System.out.println("El año es bisiesto");
            } else {
                System.out.println("El año no es bisiesto");
            }
        } else {
            System.out.println("El numero no esta entre 1900 y 2100");
        }
    }

    public void metodo6() {
        teclado = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num = teclado.nextInt();
        if (num % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }

    public void metodo7() {
        teclado = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num = teclado.nextInt();
        if (num >= 1 && num <= 10) {
            if (num % 2 == 0) {
                System.out.println("El numero es par");
            } else {
                System.out.println("El numero es impar");
            }
        }
    }

    public void metodo8() {
        teclado = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num1 = teclado.nextInt();
        System.out.println("Introduce un numero:");
        int num2 = teclado.nextInt();
        System.out.println("Introduce un numero:");
        int num3 = teclado.nextInt();
        if (num1 == num2 && num2 == num3) {
            System.out.println("Los numeros son iguales");
            System.out.println(num3 + ", " + num2 + ", " + num1);
        } else {
            if (num1 >= num2 && num2 >= num3) {
                System.out.println("Maximo: " + num1 + " minimo: " + num3);
                System.out.println(num3 + ", " + num2 + ", " + num1);
            } else if (num2 >= num3 && num3 >= num1) {
                System.out.println("Maximo: " + num2 + " minimo: " + num1);
                System.out.println(num1 + ", " + num3 + ", " + num2);
            } else if (num3 >= num1 && num1 >= num2) {
                System.out.println("Maximo: " + num3 + " minimo: " + num2);
                System.out.println(num2 + ", " + num1 + ", " + num3);
            } else if (num1 >= num3 && num3 >= num2) {
                System.out.println("Maximo: " + num1 + " minimo: " + num2);
                System.out.println(num2 + ", " + num3 + ", " + num1);
            } else if (num2 >= num1 && num1 >= num3) {
                System.out.println("Maximo: " + num2 + " minimo: " + num3);
                System.out.println(num3 + ", " + num1 + ", " + num2);
            } else if (num3 >= num2 && num2 >= num1) {
                System.out.println("Maximo: " + num3 + " minimo: " + num1);
                System.out.println(num1 + ", " + num2 + ", " + num3);
            }
        }
    }

    public void metodo9() {
        teclado = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num1 = teclado.nextInt();
        System.out.println("Introduce un numero:");
        int num2 = teclado.nextInt();
        if (num1 % num2 == 0) {
            System.out.println("El " + num1 + " es divisible entre " + num2);
        } else {
            System.out.println("El " + num1 + " no es divisible entre " + num2);
        }
        if (num2 % num1 == 0) {
            System.out.println("El " + num2 + " es divisible entre " + num1);
        } else {
            System.out.println("El " + num2 + " no es divisible entre " + num1);
        }
    }

}
