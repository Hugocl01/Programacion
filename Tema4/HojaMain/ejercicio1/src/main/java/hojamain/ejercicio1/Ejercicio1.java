/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hojamain.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int total = 0;
        if (args.length == 1 && args[0].length()==3) {
            int numA =   Integer.parseInt(args[0].substring(0,1));
            int numB = Integer.parseInt(args[0].substring(1,2));
            int numC = Integer.parseInt(args[0].substring(2,3));
            total = (int) (Math.pow(numA, 3) + Math.pow(numB, 3) + Math.pow(numC, 3));
            if (total == Integer.parseInt(args[0])) {
                System.out.println("El numero es Armstrong");
            } else {
                System.out.println("El no numero es Armstrong");
            }
        }
    }
}
