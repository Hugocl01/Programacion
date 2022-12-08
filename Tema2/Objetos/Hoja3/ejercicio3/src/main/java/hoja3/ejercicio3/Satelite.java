/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio3;

/**
 *
 * @author hugoc
 */
public class Satelite {

    private double meridiano;
    private double paralelo;
    private double distancia;

    public Satelite() {
        meridiano = 0;
        paralelo = 0;
        distancia = 0;
    }

    public Satelite(double meridiano, double paralelo, double distancia) {
        this.meridiano = meridiano;
        this.paralelo = paralelo;
        this.distancia = distancia;
    }

    public void printPosicion() {
        System.out.println("Posicion: meridiano= " + meridiano + " paralelo= "
                + paralelo + " distancia= " + distancia);
    }

    public void variarAltura(double distancia) {
        this.distancia += distancia;
    }

    public void variarPosicion(double meridiano, double paralelo) {
        this.meridiano += meridiano;
        this.paralelo += paralelo;
    }

    public boolean enOrbita() {
        boolean enOrbita = this.distancia > 16000 ? true : false;
        return enOrbita;
    }
}
