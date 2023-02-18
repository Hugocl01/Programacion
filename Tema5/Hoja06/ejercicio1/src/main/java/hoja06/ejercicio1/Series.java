/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hoja06.ejercicio1;

/**
 *
 * @author DAW102
 */
public interface Series {
    
    int inicio =0;
    int getSiguiente();
    void reiniciar();
    void setComenzar(int x);
    
    default void mostrarInicio(){
        System.out.println("Mostar inicio: " + inicio);
    }
    
    default void nombreInterfaz(){
        System.out.println("Nombre de la interfaz: Series");
    }
}
