/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja07.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo(4,7);
        System.out.println("El largo del rectangulo 1 es: " + r1.getLargo());
        System.out.println("El ancho del rectangulo 1 es: " + r1.getAncho());
        System.out.println("El largo del rectangulo 2 es: " + r2.getLargo());
        System.out.println("El ancho del rectangulo 2 es: " + r2.getAncho());
        r1.setLargo(2);
        r1.setAncho(4);
        System.out.println("Agregamos al rectangulo 1 un largo de 2 y un ancho de 4");
        System.out.println("El largo del rectangulo 1 es: " + r1.getLargo());
        System.out.println("El ancho del rectangulo 1 es: " + r1.getAncho());
        System.out.println("El largo del rectangulo 2 es: " + r2.getLargo());
        System.out.println("El ancho del rectangulo 2 es: " + r2.getAncho());
        System.out.println("El area del rectangulo 1 es: " + r1.area());
        System.out.printf("La diagonal del rectangulo 1 es: %,.2f\n" , r1.diagonal());
        System.out.println("El area del rectangulo 2 es: " + r2.area());
        System.out.printf("La diagonal del rectangulo 2 es: %,.2f\n" , r2.diagonal());
    }
}
