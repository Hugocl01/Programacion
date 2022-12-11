/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja03.ejercicio1;

/**
 *
 * @author hugoc
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Triatlon t1 = new Triatlon(8, "Hugo", 5);
        System.out.println(t1.pMedia());
        System.out.println(t1.esSelecionado());
        System.out.println(t1.mostrar());
        
        System.out.println("Uso el 2º constructor");
        Triatlon t2 = new Triatlon();
        System.out.println(t2.pMedia());
        System.out.println(t2.esSelecionado());
        System.out.println(t2.mostrar());
    }
}
