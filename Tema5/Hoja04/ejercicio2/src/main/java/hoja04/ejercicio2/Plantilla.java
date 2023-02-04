/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja04.ejercicio2;

/**
 *
 * @author hugoc
 */
public class Plantilla {

    private Empleado[] empleados;
    private int cont;

    public Plantilla(int numEmpleados) {
        this.empleados = new Empleado[numEmpleados];
        this.cont = 0;
    }

    public void insertarEmpleado(Empleado emp) {
        if (cont + 1 < empleados.length) {
            empleados[cont] = emp;
        }
    }

    public String informacion() {
        String cadena = "";
        for (int i = 0; i < cont; i++) {
            cadena.concat(empleados[i].toString() + "\n");
        }
        return cadena;
    }
    
    public Programador masLineas() {
        int mayor=0;
        for (int i = 0; i < cont; i++) {
            if (empleados[i] instanceof Programador && empleados[i].) {
                
            }
        }
    }
}
