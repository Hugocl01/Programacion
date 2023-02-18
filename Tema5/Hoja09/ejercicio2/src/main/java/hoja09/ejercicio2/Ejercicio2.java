/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja09.ejercicio2;

/**
 *
 * @author DAW102
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        try {
            Prueba p = new Prueba();
            p = null;
            p.getA();
        } catch (NullPointerException npe) {
            System.out.println("Objeto nulo");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
