/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja09.ejercicio2;

/**
 *
 * @author hugoc
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Alimento fresa = new Alimento("Fresa", 1, 5, false);
        System.out.println("Nombre: " + fresa.getNombre());
        System.out.println("Grasas: " + fresa.getGrasas());
        System.out.println("Hidratos: " + fresa.getHidratos());
        System.out.println("Es de origen animal? " + fresa.isOrigenAnimal());
        System.out.println("");
        System.out.println(fresa.getAll());
        System.out.println("Es dietetico? " + fresa.esDietetico());
        System.out.println("Calorias: " + fresa.calorias(100));
        System.out.println("");
        Alimento huevos = new Alimento("Huevo", 20, 14, true);
        System.out.println("Nombre: " + huevos.getNombre());
        System.out.println("Grasas: " + huevos.getGrasas());
        System.out.println("Hidratos: " + huevos.getHidratos());
        System.out.println("Es de origen animal? " + huevos.isOrigenAnimal());
        System.out.println("");
        System.out.println(huevos.getAll());
        System.out.println("Es dietetico? " + huevos.esDietetico());
        System.out.println("Calorias: " + huevos.calorias(100));
    }
}
