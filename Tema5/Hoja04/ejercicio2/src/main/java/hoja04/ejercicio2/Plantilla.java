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
        if (cont  < empleados.length) {
            empleados[cont] = emp;
            cont++;
        }else{
            System.out.println("Error");
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
        Programador prog = null;
        int mayor = 0;
        int posProg = 0;
        for (int i = 0; i < cont; i++) {
            if (empleados[i] instanceof Programador programador) {
                if (programador.getLineasDeCodigoPorHora() > mayor) {
                    mayor = programador.getLineasDeCodigoPorHora();
                    prog = (Programador) empleados[i];
                }
            }
        }
        return prog;
    }

    public String infoSenior() {
        String cadena = "";
        for (int i = 0; i < cont; i++) {
            if (empleados[i] instanceof Programador prog) {
                if(prog.edad > 35) {
                    cadena.concat(prog.toString() + "\n");
                }
            }
        }
        return cadena;
    }

    public void aumentoProgramadores() {
        for (int i = 0; i < cont; i++) {
            if (empleados[i] instanceof Programador prog 
                    && prog.getLenguajeDominante().equalsIgnoreCase("java") ) {
                empleados[i].salario += empleados[i].salario * 20 / 100;
            }
        }
    }
}
