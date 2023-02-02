/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja02.ejercicio3;

/**
 *
 * @author DAW102
 */
public abstract class Forma {
    
    protected String id;
    
    
    public void identidad() {
        System.out.println("ID: " + id);
    }

    @Override
    public abstract String toString();
    
}
