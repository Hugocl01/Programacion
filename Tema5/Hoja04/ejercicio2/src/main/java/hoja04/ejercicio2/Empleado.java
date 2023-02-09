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
public class Empleado {

    protected String nombre;
    protected String departamento;
    protected int edad;
    protected boolean casado;
    protected double salario;

    public Empleado() {
        int opc = 0;
        System.out.println("****Introduce los datos****");
        System.out.println("Introduce el nombre:");
        this.nombre = new Scanner(System.in).nextLine();
        System.out.println("Introduce el departamento:");
        this.departamento = new Scanner(System.in).nextLine();
        System.out.println("Introduce la edad:");
        this.edad = new Scanner(System.in).nextInt();
        do {
            System.out.println("Introduce si esta casado:");
            System.out.println("\t1-Si");
            System.out.println("\t2-No");
            opc = new Scanner(System.in).nextInt();
        } while (opc != 1 && opc != 2);
        if (opc == 1) {
            this.casado = true;
        } else {
            this.casado = false;
        }
        System.out.println("Introduce el salario:");
        this.salario = new Scanner(System.in).nextDouble();
    }

    public Empleado(String nombre, String departamento, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    public void clasificacion() {
        if (edad <= 21) {
            System.out.println("Principiante");
        } else if (edad >= 22 && edad <= 35) {
            System.out.println("Intermedio");
        } else {
            System.out.println("Senior");
        }
    }

    public void imprimir() {
        System.out.println("Empleado{" + "nombre=" + nombre + ", departamento="
                + departamento + ", edad=" + edad + ", casado=" + casado
                + ", salario=" + salario + '}');
    }

    public void aumentarSalario(int porcentaje) {
        this.salario += this.salario * porcentaje / 100;
    }
    
}
