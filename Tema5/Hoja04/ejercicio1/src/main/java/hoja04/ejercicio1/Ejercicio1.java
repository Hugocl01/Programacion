/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja04.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Publicacion publicaciones[] = new Publicacion[10];
        for (int i = 0; i < publicaciones.length; i++) {
            System.out.println("Introduce ");
            publicaciones[i]= new Libro(12);
        }
    }
}
