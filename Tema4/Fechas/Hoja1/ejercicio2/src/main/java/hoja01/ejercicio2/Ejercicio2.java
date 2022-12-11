/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja01.ejercicio2;

/**
 *
 * @author hugoc
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Veterinario manuel = new Veterinario();
        Mascota gato1 = new Mascota("Lana",10,02,2018);
        manuel.anadir(gato1);
        Mascota gato2 = new Mascota("Akane",20,01,2020);
        manuel.anadir(gato2);
        Mascota gato3 = new Mascota("Mia",24,10,2015);
        manuel.anadir(gato3);
        System.out.println(manuel.mostrar());
        System.out.println(manuel.mostrarMayores());
    }
}
