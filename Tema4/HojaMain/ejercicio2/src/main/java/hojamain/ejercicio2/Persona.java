/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hojamain.ejercicio2;

/**
 *
 * @author DAW102
 */
public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String imprimir() {
        return "Ejercicio2{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    public void esMayorEdad() {
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
    
    public static void main(String[] args) {
        int edad = Integer.parseInt(args[1]);
        Persona p1 = new Persona(args[0],edad);
        System.out.println(p1.edad);
        p1.esMayorEdad();
    }
}
