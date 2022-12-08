/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2.ejercicio7;

/**
 *
 * @author hugoc
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        //Variables
        int a = 23;
        int b = 56;
        System.out.println("Variable a= " + a);
        System.out.println("Variable b= " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("Variable a= " + a);
        System.out.println("Variable b= " + b);
    }
}
