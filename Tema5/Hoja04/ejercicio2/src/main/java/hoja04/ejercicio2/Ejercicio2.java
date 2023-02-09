/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja04.ejercicio2;

/**
 *
 * @author hugoc
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        //Creamos la plantilla en este caso de 6 empleados
        Plantilla p1 = new Plantilla(6);
        //Creamos un empredo y usamos el metodo para insertalo en la plantilla
        Empleado paco = new Empleado();
        p1.insertarEmpleado(paco);
        //Creamos un empleado pero mediante el constructor con parametros
        Empleado juan = new Empleado("Juan", "Desarrollo", 54, true, 2100);
        p1.insertarEmpleado(juan);
        //Creamos otro empleado en este caso programador pero mediante el constructor con parametros
        Programador alex = new Programador(450, "Java", "Alex", "Desarrollo",
                36, false, 1400);
        p1.insertarEmpleado(alex);
        Programador laura = new Programador(470, "Python", "Laura", "Desarrollo",
                32, false, 1500);
        p1.insertarEmpleado(laura);
        System.out.println("Sacamos los datos de toda la plantilla");
        System.out.println(p1.informacion());
        System.out.println("Programdor con mas lineas escritas:");
        p1.masLineas().imprimir();
        System.out.println("Informacion de los empleados Senior");
        System.out.println(p1.infoSenior());
        System.out.println("Sacamos los datos de toda la plantilla despues del aumento");
        p1.aumentoProgramadores();
        System.out.println(p1.informacion());
    }
}
