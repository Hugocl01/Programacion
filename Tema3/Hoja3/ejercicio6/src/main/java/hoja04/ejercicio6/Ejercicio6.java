/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja04.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int apuesta;
        int cantidad = 0;
        int num;
        int random;
        int opcion;
        int perdido = 0;
        do {
            System.out.println("Introduce la cantidad para apostar:");
            apuesta = teclado.nextInt();
            System.out.println("Apuestas al 1 o al 2?");
            num = teclado.nextInt();
            random = (int) Math.floor(Math.random()*2)+1;
            System.out.println(random);
            if (num == random) {
                cantidad += apuesta*2;
                System.out.println("Has ganado " + apuesta*2);
            } else {
                perdido -= apuesta;
                apuesta = 0;
                System.out.println("Has perdido todo ");
            }
            System.out.println("¿Quieres volver a intentarlo?");
            System.out.println("1- Volver a intetarlo");
            System.out.println("2- Salir");
            opcion = teclado.nextInt();
 
        }while(opcion == 1);
        System.out.println("Ganancias finales: " + cantidad);
        System.out.println("dinero perdido: " + perdido);
    }
}
