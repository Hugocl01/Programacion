/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja06.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Principal1 {

    public static void main(String[] args) {
        DeDos dos = new DeDos();
        System.out.println(dos.getSiguiente());
        System.out.println(dos.getSiguiente());
        System.out.println(dos.getSiguiente());
        System.out.println(dos.getSiguiente());
        System.out.println(dos.getSiguiente());
        System.out.println("Reinicio la serie");
        dos.reiniciar();
        System.out.println("Comienzo la serie en 100");
        dos.setComenzar(100);
        System.out.println(dos.getSiguiente());
        System.out.println(dos.getSiguiente());
        System.out.println(dos.getSiguiente());
        System.out.println(dos.getSiguiente());
        System.out.println(dos.getSiguiente());
    }
}
