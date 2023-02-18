/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja04.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Programador extends Empleado{
    
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;

    public Programador() {
        super();
        System.out.println("****Datos del programador****");
        System.out.println("Introduce las lineas de codigo por hora:");
        this.lineasDeCodigoPorHora = new Scanner(System.in).nextInt();
        System.out.println("Introduce el lenguale dominante:");
        this.lenguajeDominante = new Scanner(System.in).nextLine();
    }

    public Programador(int lineasDeCodigoPorHora, String lenguajeDominante, 
            String nombre, String departamento, int edad, boolean casado, double salario) {
        super(nombre, departamento, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    public int getLineasDeCodigoPorHora() {
        return lineasDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }
    
    
}
