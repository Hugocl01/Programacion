/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplos.ejem2;

import javax.swing.JOptionPane;
/**
 *
 * @author DAW102
 */
public class Ejem2 {

    public static void main(String[] args) {
        String texto; //variable para almacenar los datos recogidos por la caja de texto
        short anio , nacimiento;
        texto =JOptionPane.showInputDialog("Escribe el año actual");
        anio = Short.parseShort(texto);
        texto =JOptionPane.showInputDialog("Escribe tu año de nacimiento");
        nacimiento = Short.parseShort(texto);
        System.out.println("Tu edad actual es= " + (anio-nacimiento));
    }
}
