/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Circulo {

    private double radio;   //atributo donde se almacena el valor del radio

    public Circulo() {      //Constructor por defecto

    }

    public Circulo(double radio) {      //Constructor con variable inicializada
        this.radio = radio;
    }

    public double getRadio() {          //Metodo para devolver el radio
        return radio;
    }

    public void setRadio(double radio) {        //Metodo para definir el valor del radio
        this.radio = radio;
    }

    public double area() {
        return Math.PI * Math.pow(radio, 2);    //Metodo para devolver el area a partir de la funcion definida en el return
    }

    public double longitud() {
        return 2 * Math.PI * radio;         //Metodo para devolver la longitud a partir de la funcion definida en el return
    }
}
