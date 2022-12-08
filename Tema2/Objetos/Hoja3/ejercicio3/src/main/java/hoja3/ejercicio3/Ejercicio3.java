/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja3.ejercicio3;

/**
 *
 * @author hugoc
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        //Primer objeto
        Satelite sat1 = new Satelite();
        sat1.printPosicion();
        sat1.variarAltura(100);
        sat1.variarPosicion(45, 22);
        sat1.printPosicion();
        System.out.println(sat1.enOrbita());
        
        //Segundo objeto
        Satelite sat2 = new Satelite(40,60,20000);
        sat2.printPosicion();
        sat2.variarAltura(5000);
        sat2.variarPosicion(45, 22);
        sat2.printPosicion();
        System.out.println(sat2.enOrbita());
    }
}
