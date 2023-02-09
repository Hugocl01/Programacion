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
        String cadena = "Plantilla:\n";
        for (int i = 0; i < cont; i++) {
            cadena.concat(empleados[i].toString() + "\n");
        }
        return cadena;
    }

    public Programador masLineas() {
        int mayor = 0;
        for (int i = 0; i < cont; i++) {
            if (empleados[i] instanceof Programador programador) {
                if (programador.getLineasDeCodigoPorHora() > mayor) {
                    mayor = i;
                }
            }
        }
        Programador prog = (Programador) empleados[mayor];
        return prog;
    }

    public String infoSenior() {
        String cadena = "";
        for (int i = 0; i < cont; i++) {
            if (empleados[i].edad > 35) {
                cadena.concat(empleados[i].toString() + "\n");
            }
        }
        return cadena;
    }

    public void aumentoProgramadores() {
        for (int i = 0; i < cont; i++) {
            if (empleados[i] instanceof Programador) {
                empleados[i].salario += empleados[i].salario * 20 / 100;
            }
        }
    }
}
