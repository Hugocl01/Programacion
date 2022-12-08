/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja2.ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author hugoc
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        //Variables
        String texto;
        float precio;

        //Inicializamos la lectura de pantalla con el JOptionPane
        texto = JOptionPane.showInputDialog("Escriba el precio");
        precio = Float.parseFloat(texto);
        
        //Variable para guardar el precio con IVA
        double precioiva = precio + (precio * 0.21);
        
        //Sacamos por pantalla los precios
        System.out.printf("El precio sin IVA es: %,.2f%n", precio);
        System.out.printf("El precio con el porcentaje del 21 de IVA es: %,.2f%n",
                precioiva);
        System.out.printf("El precio después de aplicar un porcentaje de 10 de descuento es: %,.2f%n",
                precioiva - (precioiva * 0.10));
    }
}
