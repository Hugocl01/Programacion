/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja01.ejercicio2;

/**
 *
 * @author hugoc
 */
public class Ticket {

    private double kilosNaranjas;

    public Ticket(double kilosNaranjas) {
        this.kilosNaranjas = kilosNaranjas;
    }

    public String imprimir() {
        double importe;
        if (kilosNaranjas > 10) {
            importe = kilosNaranjas * 1.2;
        } else {
            importe = kilosNaranjas * 1.5;
        }
        String cadena = String.format("****Ticket***\n\tKilos de narajas: %,.2f"
                + "\n\tImporte: %,.2f€", kilosNaranjas, importe);
        return cadena;
    }

}
