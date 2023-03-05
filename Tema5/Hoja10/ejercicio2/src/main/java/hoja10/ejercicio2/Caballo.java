/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja10.ejercicio2;

import hoja10.ejercicio1.*;
import java.util.Arrays;

/**
 *
 * @author hugoc
 */
public class Caballo implements PuedeMontarse {

    private final int capacidad;
    private int ocupacion;
    private Guerrero[] ocupantes;

    //Constructores
    public Caballo(Guerrero[] array) {
        int cont = 0;
        boolean todosGriegos = array.length == cont;
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Griego) {
                cont++;
            }
        }
        if (todosGriegos) {
            ocupantes = new Guerrero[array.length];
            for (int i = 0; i < ocupantes.length; i++) {
                ocupantes[i] = array[i];
            }
            this.ocupacion = ocupantes.length;
            this.capacidad = ocupantes.length;
        } else {
            this.ocupacion = 0;
            this.ocupantes = new Guerrero[100];
            this.capacidad = 100;
        }
    }

    public Caballo(Guerrero x, int capacidad) {
        if (x instanceof Griego) {
            ocupantes = new Guerrero[capacidad];
            ocupantes[0] = x;
            this.capacidad = capacidad;
            this.ocupacion = 1;
        } else {
            ocupantes = new Guerrero[capacidad];
            this.capacidad = capacidad;
            this.ocupacion = 0;
        }
    }

    //Metodos
    public void ordenar() {
        Arrays.sort(ocupantes, 0, ocupacion);
    }

    public int buscar(String nombre) {
        int salida = 0;
        boolean acabar = false;
        for (int i = 0; i < ocupantes.length && !acabar; i++) {
            if (ocupantes[i].getNombre().equalsIgnoreCase(nombre)) {
                salida = i;
                acabar = true;
            }
        }
        return salida;
    }

    //Metodos de la interfaz
    @Override
    public int montar(Guerrero g) {
        int num = 0;
        if (g instanceof Griego) {
            if (ocupacion < ocupantes.length) {
                ocupantes[ocupacion] = g;
                num = ocupacion;
            } else {
                num = -1;
            }
        }
        if (g instanceof Troyano) {
            num = -2;
        }
        return num;
    }

    @Override
    public void desmontar() {
        Arrays.fill(ocupantes, null);
        this.ocupacion = 0;
    }
}
