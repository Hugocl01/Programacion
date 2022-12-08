/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejemplos.ejem9;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Ejem9 {

    public static void main(String[] args) {
        /*
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        num = teclado.nextInt();
        if(num >= 0){
            System.out.println("El valor absoluto de " + num + " es " + num);
        }else{
            System.out.println("El valor absoluto de " + num + " es " + (num+(num*(-2))));
        }
         */
        int num = -3;
        int a;
        a = num > 0 ? num : num * (-1);
        System.out.println("El valor absoluta es " + a);
    }
}
