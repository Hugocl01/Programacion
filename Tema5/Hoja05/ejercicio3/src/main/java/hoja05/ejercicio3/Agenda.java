/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja05.ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Agenda {

    private Contacto contactos[];
    private int cont;

    public Agenda(int numContactos) {
        this.contactos = new Contacto[numContactos];
        this.cont = 0;
    }

    public void insertar(Contacto nuevo) {
        if (cont < contactos.length) {
            contactos[cont] = nuevo;
            cont++;
            System.out.println("Se ha agregado el nuevo contacto");
        } else {
            System.out.println("No se puede insertar mas contactos numero maximo");
        }
    }

    public void buscar(String nombreContacto) {
        for (int i = 0; i < cont; i++) {
            if (contactos[i].nombre.equalsIgnoreCase(nombreContacto)) {
                System.out.println(contactos[i].toString());
            }
        }
    }

    public void eliminar(String nombreContacto) {
        int opc = 0;
        int pos = 0;
        for (int i = 0; i < cont; i++) {
            if (contactos[i].nombre.equalsIgnoreCase(nombreContacto)) {
                do {
                    System.out.println("Se ha encontrado el siguiente contacto:");
                    System.out.println(contactos[i].toString());
                    System.out.println("Deseas borrar este contacto:");
                    System.out.println("1 -Si");
                    System.out.println("2 -No");
                    opc = new Scanner(System.in).nextInt();
                } while (opc != 1 && opc != 2);
                if (opc == 1 && i < cont - 1) {
                    for (int j = i; j < cont - 1; j++) {
                        contactos[j] = contactos[j + 1];
                    }
                    cont--;
                    opc = 0;
                    System.out.println("Se ha eliminado el contacto");
                }
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < cont; i++) {
            System.out.println(contactos[i].toString());
        }
    }

    public void ordenar() {
        Arrays.sort(contactos, 0, cont);
    }

}
