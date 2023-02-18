/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja07.ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Ejercicio5 {

    /*
    public static void main(String[] args) {
        int dividendo = 0;
        int divisor = 0;
        boolean salir = false;
        do {
            System.out.println("Introcude el dividendo:");
            try {
                dividendo = new Scanner(System.in).nextInt();
                salir = true;
            } catch (InputMismatchException e) {
                System.out.println("El numero introducido no es entero");
            }
        } while (!salir);
        salir = false;
        do {
            System.out.println("Introduce el divisor:");
            try {
                divisor = new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
                System.out.println("El numero introducido no es entero");
            }
            try {
                double res = dividir(dividendo, divisor);
                salir = true;
            } catch (ArithmeticException div) {
                System.out.println("No se puede dividir por 0");
            }
        } while (!salir);
        System.out.println("El resultado es");
    }
     */
    public static void main(String[] args) {
        int dividendo = 0;
        int divisor = 0;
        double res = 0;
        boolean salir = false;
        do {
            System.out.println("Introcude el dividendo:");
            try {
                dividendo = new Scanner(System.in).nextInt();
                salir = true;
            } catch (InputMismatchException e) {
                System.out.println("El numero introducido no es entero");
            } finally {
                if (salir) {
                    System.out.println("Dato introducido");
                } else {
                    System.out.println("Introduce el dividendo de nuevo");
                }
            }
        } while (!salir);
        salir = false;
        do {
            System.out.println("Introduce el divisor:");
            try {
                divisor = new Scanner(System.in).nextInt();
                res = dividir(dividendo, divisor);
                salir = true;
            } catch (InputMismatchException e) {
                System.out.println("El numero introducido no es entero");
            } finally {
                if (salir) {
                    System.out.println("Dato introducido");
                } else {
                    System.out.println("Introduce el divisor de nuevo");
                }
            }
        } while (!salir);
        System.out.println("El resultado es: " + res);
    }

    /*
    public static double dividir(int dividendo, int divisor) throws ArithmeticException {
        int res;
        res = dividendo / divisor;
        return res;
    }
     */
    public static double dividir(int dividendo, int divisor) {
        double res = 0;
        try {
            res = dividendo / divisor;
        } catch (ArithmeticException ae) {
            System.out.println("El dividendo no se puede dividir entre 0");
        } finally {
            if (res == 0) {
                System.out.println("Introduce el divisor de nuevo");
            }
        }
        return res;
    }
}
