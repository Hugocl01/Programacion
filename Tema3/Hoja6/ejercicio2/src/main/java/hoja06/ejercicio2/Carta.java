/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja06.ejercicio2;

import java.util.Random;

/**
 *
 * @author hugoc
 */
public class Carta {

    private int num;
    private Palos palo;

    public Carta() {
        Random numAleatorio = new Random();     //numero de la carta
        Random paloAleatorio = new Random();    //numero random 1-4 para asiganr un palo
        this.num = numAleatorio.nextInt(10) + 1;
        switch (paloAleatorio.nextInt(4) + 1) {
            case 1 ->
                this.palo = Palos.BASTOS;
            case 2 ->
                this.palo = Palos.COPAS;
            case 3 ->
                this.palo = Palos.ESPADAS;
            case 4 ->
                this.palo = Palos.OROS;
            default ->
                throw new AssertionError();
        }
    }

    public String mostrar() {
        return this.num + " de " + this.palo;
    }

    public int getNum() {
        return num;
    }

}
