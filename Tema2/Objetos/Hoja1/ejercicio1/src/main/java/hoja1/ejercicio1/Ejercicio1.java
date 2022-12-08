/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja1.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        //Primer objeto constructor sin parametros
        CajaAhorro caja1 = new CajaAhorro();
        caja1.depositar(100);
        System.out.println("Saldo del primer objeto= " + caja1.obtenerSaldo());
        caja1.girar(50);
        System.out.println("Saldo del primer objeto= " + caja1.obtenerSaldo());
        System.out.println("Numero de transacciones del primer objeto= " 
                + caja1.obtenerTransacciones());
        
        //Segundo objeto constructor con parametros
        CajaAhorro caja2 = new CajaAhorro(200);
        System.out.println("Saldo del segundo objeto= " + caja2.obtenerSaldo());
        System.out.println("Numero de transacciones del segundo objeto= " 
                + caja2.obtenerTransacciones());
    }
}
