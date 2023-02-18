/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja08.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Datos {

    public static int numNotas() {
        int numNotas = 0;
        boolean salir = false;
        do {
            System.out.println("Introduce el numero de notas:");
            try {
                numNotas = new Scanner(System.in).nextInt();
                salir = true;
            } catch (InputMismatchException ime) {
                System.out.println("El numero introducido no es un entero");
            } finally {
                if (!salir) {
                    System.out.println("Error vuelve a intentarlo");
                }
            }
        } while (!salir);
        return numNotas;
    }

    public static int agregarNota() {
        int nota = 0;
        boolean salir = false;
        do {
            try {
                nota = new Scanner(System.in).nextInt();
                if (nota < 0 || nota > 10) {
                    throw new Exception("La nota no esta dentro de los limites");
                }
                salir = true;
            } catch (InputMismatchException ime) {
                System.out.println("La nota introducida no es un entero");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                if (!salir) {
                    System.out.println("Introduce la nota de nuevo:");
                }
            }
        } while (!salir);
        return nota;
    }
    
    public static int posicion() {
        int pos = 0;
        boolean salir = false;
        do {
            System.out.println("Introduce la posicion:");
            try {
                pos = new Scanner(System.in).nextInt();
                salir = true;
            } catch (InputMismatchException ime) {
                System.out.println("El numero introducido no es un entero");
            } finally {
                if (!salir) {
                    System.out.println("Error vuelve a intentarlo");
                }
            }
        } while (!salir);
        return pos;
    }
}
