/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja10.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Estaticos {

    //Introducir String
    public static String introducirNombre() {
        String cadena = "";
        boolean salir = false;
        do {
            System.out.println("Introduce la edad del Guerrero:");
            try {
                cadena = new Scanner(System.in).nextLine();
                salir = true;
            } catch (InputMismatchException ime) {
                System.out.println("Error"
                        + "\nRepitelo de nuevo");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!salir);
        return cadena;
    }

    public static int introducirEdad() {
        int num = 0;
        boolean salir = false;
        do {
            System.out.println("Introduce la edad del Guerrero:");
            try {
                num = new Scanner(System.in).nextInt();
                if (num >= 15 && num <= 60) {
                    salir = true;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Error el dato introducido no es de tipo entero"
                        + "\nRepitelo de nuevo");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!salir);
        return num;
    }

    public static int introducirFuerza() {
        int num = 0;
        boolean salir = false;
        do {
            System.out.println("Introduce la fuerza del Guerrero:");
            try {
                num = new Scanner(System.in).nextInt();
                if (num >= 1 && num <= 10) {
                    salir = true;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Error el dato introducido no es de tipo entero"
                        + "\nRepitelo de nuevo");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!salir);
        return num;
    }
}
