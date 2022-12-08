/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja02.ejercicio1;

/**
 *
 * @author hugoc
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Operaciones op1 = new Operaciones();
        System.out.println("Multiplico x2 los elementos del array");
        op1.multiplica();
        System.out.println("Muestro el array");
        op1.mostrar();
        System.out.println("Suma de todos los valores del array");
        System.out.println(op1.suma());
    }
}
