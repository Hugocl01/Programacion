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
        String nombre ="Pepito";
        String primerApellido ="Perez";
        String segundoApellido ="Fernandez";
        
        String nombreApellido1 = nombre.concat(primerApellido);
        String nombreCompleto = nombreApellido1.concat(segundoApellido);
        System.out.println("El nombre completo es: " + nombreCompleto);
        System.out.println("La longitudo de la cadena es: " + nombreCompleto.length());
        
        
    }
}
