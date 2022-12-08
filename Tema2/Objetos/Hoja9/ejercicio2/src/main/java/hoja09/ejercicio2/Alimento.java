/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja09.ejercicio2;

/**
 *
 * @author hugoc
 */
public class Alimento {

    //Atributos
    private String nombre;
    private int grasas;
    private int hidratos;
    private boolean origenAnimal;

    public Alimento(String nombre, int grasas, int hidratos, boolean origenAnimal) {
        this.nombre = nombre;
        this.grasas = grasas;
        this.hidratos = hidratos;
        this.origenAnimal = origenAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGrasas() {
        return grasas;
    }

    public int getHidratos() {
        return hidratos;
    }

    public boolean isOrigenAnimal() {
        return origenAnimal;
    }

    public String getAll() {
        String datos = String.format("ALIMENTO:\n\tNombre: %s\n\tGrasas: %d\n\tHidratos: %d\n"
                + "\tOrigen Animal: %b", nombre, grasas, hidratos, origenAnimal);
        return datos;
    }

    public boolean esDietetico() {
        if (grasas < 12 && !origenAnimal) {
            return true;
        } else {
            return false;
        }
    }

    public double calorias(int gramos) {
        double calorias = gramos * (this.grasas * 5.3 + this.hidratos * 2.1);
        return calorias;
    }
}
