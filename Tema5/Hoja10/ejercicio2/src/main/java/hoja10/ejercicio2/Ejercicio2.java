/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja10.ejercicio2;

import hoja10.ejercicio1.*;

/**
 *
 * @author hugoc
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Troyano juan = new Troyano("Juan", 20, 8);
        Caballo caballoTroya = new Caballo(juan, 100);
        System.out.println("Montamos Juan");
        System.out.println(caballoTroya.montar(juan));
        caballoTroya.desmontar();
        System.out.println("Montamos Carlos");
        Griego carlos = new Griego("Carlos", 18 , 7);
        System.out.println(caballoTroya.montar(carlos));
    }
}
