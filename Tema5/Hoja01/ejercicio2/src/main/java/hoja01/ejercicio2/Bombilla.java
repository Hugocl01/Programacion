/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja01.ejercicio2;

/**
 *
 * @author DAW102
 */
public class Bombilla {
  
    private Interruptor interruptor;
    private static Interruptor general=Interruptor.OFF;
    
    public Bombilla(){
        interruptor=Interruptor.OFF;
    }
    
    public void cambiarEstado() {
        if(interruptor==Interruptor.ON){
        interruptor= Interruptor.OFF;
        } else {
            interruptor= Interruptor.ON;
        }
    }
    
    public static void cambiarEstadoGeneral() {
        if(general==Interruptor.ON){
        general= Interruptor.OFF;
        } else {
            general= Interruptor.ON;
        }
    }

    public boolean estadoBombilla() {
        return (interruptor == Interruptor.ON)&& (general== Interruptor.ON);
    }
    
    
}
