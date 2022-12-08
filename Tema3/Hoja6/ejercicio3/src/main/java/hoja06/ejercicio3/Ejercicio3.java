/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja06.ejercicio3;

/**
 *
 * @author hugoc
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        //Objeto1
        System.out.println("Creamos el primer objeto");
        SintonizadorFM radio1 = new SintonizadorFM(107);
        System.out.println(radio1.mostrar());
        System.out.println("Realizamos 4 subidas");
        radio1.subir();
        radio1.subir();
        radio1.subir();
        radio1.subir();
        System.out.println(radio1.mostrar());
        System.out.println("Realizamos 3 bajadas");
        radio1.bajar();
        radio1.bajar();
        radio1.bajar();
        System.out.println(radio1.mostrar());
        
        //Objeto2
        System.out.println("Creamos el segundo objeto");
        SintonizadorFM radio2 = new SintonizadorFM(200);
        System.out.println(radio2.mostrar());
        
        //Objeto3 constructor copia
        System.out.println("Creamos el tercer objeto");
        SintonizadorFM radio3 = new SintonizadorFM(radio2);
        System.out.println(radio3.mostrar());
        radio3.subir();
        radio3.bajar();
        System.out.println(radio3.mostrar());
    }
}
