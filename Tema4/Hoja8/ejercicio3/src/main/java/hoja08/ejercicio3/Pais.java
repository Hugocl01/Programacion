/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja08.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Pais {
    private String pais;
    private Ciudad ciudades[];
    private int numCiudades;

    public Pais(String pais) {
        this.pais = pais;
        this.ciudades = new Ciudad[25];
        this.numCiudades = 0;
    }
    
    public void anadirCiudad(){
        Scanner tcl = new Scanner(System.in);
        if(numCiudades+1<= ciudades.length-1){
            System.out.println("Introduce los datos del la cuidad:");
            System.out.println("Intoduce el nombre:");
            String nombre = new Scanner(System.in).nextLine();
            System.out.println("Intoduce la latitud:");
            double latitud = tcl.nextDouble();
            System.out.println("Intoduce la longitud:");
            double longitud = tcl.nextDouble();
            System.out.println("Intoduce el numero de habitantes:");
            int habitantes = tcl.nextInt();
            
        } else {
            System.out.println("Limite de ciudades alcanzado");
        }
    }
    
    
}
