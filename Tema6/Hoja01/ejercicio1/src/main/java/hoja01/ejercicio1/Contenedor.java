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
        if (objeto.length >= 0) {
            objeto = Arrays.copyOf(objeto, objeto.length+1);
            System.arraycopy(objeto, 0, objeto, 1, objeto.length-1);
            objeto[0] = nuevo;
            for (int i = 0; i < objeto.length; i++) {
                System.out.println(objeto[i].toString());
            }
        }
    }
    
    public void insertarAlFinal(T nuevo) {
        if (objeto.length >= 0) {
            
        }
    }
    
    public T extraerDelPrincipio() {
       T aux = objeto[0];
       return aux;
    } 
    
    public void ordenar() {
        Arrays.sort(objeto);
    }
    
    @Override
    public String toString() {
        return "Contenedor{" + "objeto=" + objeto + '}';
    }
    
}
