/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja01.ejercicio2;

/**
 *
 * @author DAW102
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Bombilla b1 = new Bombilla();
        b1.estadoBombilla();
        b1.cambiarEstado();
        Bombilla.cambiarEstadoGeneral();
        b1.estadoBombilla();
    }
}
