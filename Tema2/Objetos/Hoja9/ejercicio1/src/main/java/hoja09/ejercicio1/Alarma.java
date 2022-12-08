/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja09.ejercicio1;

/**
 *
 * @author hugoc
 */
public class Alarma {

    //Atributos
    private double temperatura;
    private boolean timbre = temperatura > 35 || temperatura < 10;

    public Alarma(double temperatura) {
        this.temperatura = temperatura;
        this.timbre = false;
    }

    public void comprueba() {
        if (temperatura > 35 || temperatura < 10) {
            this.timbre = true;
            System.out.println("La temperatura es: " + getTemperatura());
            System.out.println("Timbre encendido? " + isTimbre());
            normaliza();
        }
    }

    public void normaliza() {
        this.temperatura = 25;
        this.timbre = false;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public boolean isTimbre() {
        return timbre;
    }

}
