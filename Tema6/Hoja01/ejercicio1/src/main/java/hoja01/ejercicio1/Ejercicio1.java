/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja01.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Integer entero[] = new Integer[5];
        entero[0] = new Integer(1);
        entero[1] = new Integer(2);
        entero[2] = new Integer(3);
        entero[3] = new Integer(4);
        entero[4] = new Integer(5);
        Contenedor c1 = new Contenedor(entero);
        Integer int1 = new Integer(6);
        c1.insertarAlPrincipio(int1);
    }
}
