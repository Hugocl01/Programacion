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
        String cadena = "";
        for (int i = 0; i < mascotas.length; i++) {
            cadena += mascotas[i].toString().concat("\n");
        }
        return cadena;
    }

    public String mostrarMayores() {
        String cadena = "";
        for (int i = 0; i < mascotas.length; i++) {
            if (mascotas[i].getEdad > 5) {
                cadena += mascotas[i].toString().concat("\n");
            }
        }
        return cadena;
    }
}
