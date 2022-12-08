/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja04.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int clave = (int) Math.floor(Math.random() * 9999) + 1;
        System.out.println(clave);
        boolean acierto = false;
        for (int i = 1; i <= 4 && !acierto; i++) {
            System.out.println("Intoduce la contraseña: ");
            int codigo = teclado.nextInt();
            if (clave == codigo) {
                acierto = true;
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
            } else {
                System.out.println("Lo siento, esa no es la combinación "
                        + "le quedan " +(4-i)  +" intentos");
            }
        }
    }
}
