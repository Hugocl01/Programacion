/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja08.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Creamos la primera persona");
        Persona p1 = new Persona("Hugo", "Cayón", "Laso", "452348226G");
        System.out.println("La clave es: " + p1.clave());
        System.out.println("El dni es valido? " + p1.dniValido());
        System.out.println("");
        
        System.out.println("Creamos la segunda persona pero con dni falso");
        Persona p2 = new Persona("Fernando", "Alonso", "Díaz", "346366899W");
        System.out.println("La clave es: " + p2.clave());
        System.out.println("El dni es valido? " + p2.dniValido());
    }
}
