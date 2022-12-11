/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja01.ejercicio2;

/**
 *
 * @author hugoc
 */
public class Veterinario {

    private Mascota[] mascotas;
    private int contMascotas;

    public Veterinario() {
        mascotas = new Mascota[10];
        this.contMascotas = 0;
    }

    public void anadir(Mascota animal) {
        mascotas[contMascotas] = animal;
        contMascotas++;
    }

    public String mostrar() {
        for (int i = 0; i < mascotas.length; i++) {

        }
    }

    public String mostrarMayores() {

    }
}
