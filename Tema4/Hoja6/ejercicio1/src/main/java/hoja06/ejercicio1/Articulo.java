/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja06.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Articulo {
    
    private int codigo;
    private String descripcion;
    private int existencias;
    
    public Articulo() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Intoduce el codigo:");
        this.codigo = teclado.nextInt();
        System.out.println("Intoduce la descripcion:");
        this.descripcion = new Scanner(System.in).nextLine();
        System.out.println("Intoduce las existencias:");
        this.existencias = teclado.nextInt();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getExistencias() {
        return existencias;
    }
    
}
