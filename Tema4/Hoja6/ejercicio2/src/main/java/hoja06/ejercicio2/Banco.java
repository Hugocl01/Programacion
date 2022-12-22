/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja06.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Banco {

    private Cliente[] usuarios;
    private int cont;

    public Banco(int max) {
        this.usuarios = new Cliente[max];
        this.cont = 0;
    }

    public void ingresar() {
        int codigo = cont + 1;
        System.out.println("Introduce el nombre:");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("Introduce los apellidos;");
        String apellido = new Scanner(System.in).nextLine();
        System.out.println("Introduce tu telefono:");
        int telefono = new Scanner(System.in).nextInt();
        System.out.println("Introduce tu saldo:");
        int saldo = new Scanner(System.in).nextInt();
        usuarios[cont] = new Cliente(codigo, nombre, apellido, telefono, saldo);
        cont++;
    }

    public String buscar() {
        String cadena = "DATOS\n";
        System.out.println("Introduce el codigo del cliente");
        int idCliente = new Scanner(System.in).nextInt();
        for (int i = 0; i < cont; i++) {
            if (usuarios[i].getCodigo() == idCliente) {
                cadena.concat("Nombre: " + usuarios[i].getNombre() + "\n");
                cadena.concat("Apellidos: " + usuarios[i].getApellidos() + "\n");
                cadena.concat("Telefono: " + usuarios[i].getTelefono() + "\n");
                cadena.concat("Saldo: " + usuarios[i].getSaldo() + "\n");
            }
        }
        return cadena;
    }

    public void eliminar(int idUsuario) {
        for (int i = idUsuario - 1; i < cont - 1; i++) {
            usuarios[i] = usuarios[i + 1];
            usuarios[i].setCodigo(i + 1);
        }
        this.cont--;
    }

    public void mostrar() {
        String cadena = "Datos de todos los clientes:\n";
        for (int i = 0; i < cont; i++) {
            cadena.concat("****DATOS****\n");
            cadena.concat("Nombre: " + usuarios[i].getNombre() + "\n");
            cadena.concat("Apellidos: " + usuarios[i].getApellidos() + "\n");
            cadena.concat("Telefono: " + usuarios[i].getTelefono() + "\n");
            cadena.concat("Saldo: " + usuarios[i].getSaldo() + "\n");

        }
        System.out.println(cadena);
    }

}
