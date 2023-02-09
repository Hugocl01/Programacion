/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja05.ejercicio3;

import java.time.LocalDate;

/**
 *
 * @author hugoc
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Agenda ag1 = new Agenda(4);
        LocalDate fnac = LocalDate.now();
        Contacto juan = new Contacto("Juan", "Diaz", 123456789, "juan@gmail.com", fnac);
        Contacto pablo = new Contacto("Pablo", "Diaz", 123456789, "juan@gmail.com", fnac);
        Contacto alex = new Contacto("Alex", "Vazquez", 123456789, "alex@gmail.com", fnac);
        Contacto juan2 = new Contacto("Juan", "Fernandez", 123456789, "juan2@gmail.com", fnac);
        Contacto elsa = new Contacto("Elsa", "Rata", 123456789, "elsa@gmail.com", fnac);
        ag1.insertar(juan);
        ag1.insertar(alex);
        ag1.insertar(juan2);
        ag1.insertar(elsa);
        ag1.buscar("juan");
        ag1.eliminar("juan");
        ag1.mostrar();
        System.out.println("Ordenamos");
        ag1.ordenar();
        ag1.mostrar();
    }
}
