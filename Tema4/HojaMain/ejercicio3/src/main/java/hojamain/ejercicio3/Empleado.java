/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hojamain.ejercicio3;

/**
 *
 * @author hugoc
 */
public class Empleado {

    private String nombre;
    private double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Ejercicio3{" + "Nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }

    public void impuestos() {
        if (sueldo > 3000) {
            System.out.println("Debes pagar impuestos");
        }
    }

    public static void main(String[] args) {
        double sueldo = Double.parseDouble(args[1]);
        Empleado emp= new Empleado(args[0],sueldo);
        System.out.println(emp.toString());
        emp.impuestos();
        emp.setNombre("Hugo");
        emp.setSueldo(1500);
        System.out.println(emp.toString());
        
    }
}
