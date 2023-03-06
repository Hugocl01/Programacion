/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja01.ejercicio1;

import java.util.Arrays;
import javax.imageio.plugins.tiff.TIFFDirectory;

/**
 *
 * @author DAW102
 */
public class Contenedor<T> {

    private T[] objeto;

    //Constructor
    public Contenedor(T[] array) {
        this.objeto = array;
    }

    public void insertarAlPrincipio(T nuevo) {
        objeto = Arrays.copyOf(objeto, objeto.length + 1);
        System.arraycopy(objeto, 0, objeto, 1, objeto.length - 1);
        objeto[0] = nuevo;
        for (int i = 0; i < objeto.length; i++) {
            System.out.println(objeto[i].toString());

        }
    }

    public void insertarAlFinal(T nuevo) {
        objeto = Arrays.copyOf(objeto, objeto.length + 1);
        System.arraycopy(objeto, 0, objeto, 0, objeto.length - 1);
        objeto[objeto.length-1] = nuevo;
        for (int i = 0; i < objeto.length; i++) {
            System.out.println(objeto[i].toString());

        }
    }

    public T extraerDelPrincipio() {
        T aux = objeto[0];
        return aux;
    }

    public void ordenar() {
        Arrays.sort(objeto);
        for (int i = 0; i < objeto.length; i++) {
            System.out.println(objeto[i]);
        }
    }

    @Override
    public String toString() {
        String cadena="";
        for (int i = 0; i < objeto.length; i++) {
            cadena += objeto[i]+ ", ";
        }
        return "Contenedor{" + "objeto=" + cadena + '}';
    }

}
