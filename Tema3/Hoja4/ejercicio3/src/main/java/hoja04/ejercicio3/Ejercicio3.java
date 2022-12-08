/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja04.ejercicio3;

/**
 *
 * @author hugoc
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        for (int anio = 2016; anio <= 2030; anio++) {
            int a = anio % 19;
            int b = anio % 4;
            int c = anio % 7;
            int d = (19 * a + 24) % 30;
            int e = (2 * b + 4 * c + 6 * d + 5) % 7;
            int n = (22 + d + e);
            if (n > 31) {
                System.out.println("El domingo de pascua del año " + anio
                        + " es: " + (n - 31) + " de abril");
            } else {
                System.out.println("El domingo de pascua del año " + anio
                        + " es: " + n + " de marzo");
            }
        }
    }
}
