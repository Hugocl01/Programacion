/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja04.ejercicio2;

/**
 *
 * @author DAW102
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Coche coche1 = new Coche("1234RET", 20);
        System.out.println("Creo un coche1 con matricula y velocidad");
        coche1.mostrarVelMat();
        System.out.println("Creo un coche2 con matricula");
        Coche coche2 = new Coche("4567KKK");
        coche2.mostrarVelMat();
        System.out.println("Coche 2 frena 10");
        coche2.frena(10);
        coche2.mostrarVelMat();
        System.out.println("Coche2 acelera 80");
        coche2.acelera(80);
        coche2.mostrarVelMat();
        coche1.mostrarVelMat();
        coche1.letrasMatricula();
        
        
       
    }
}
