/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja04.ejercicio2;

/**
 *
 * @author DAW102
 */
public class Coche {

    private String matricula;
    private int velocidad;

    public Coche(String matricula, int velocidad) {
        this.matricula = matricula;
        this.velocidad = velocidad;
    }
    
    public Coche(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
    }
    
    public int acelera(int velocidad){
        this.velocidad+=velocidad;
        if (this.velocidad >= 120){
            this.velocidad =120;
        }
        return this.velocidad;
    }
    
    public int frena(int velocidad){
        this.velocidad-=velocidad;
        if (this.velocidad <= 0){
            this.velocidad =0;
        }
        return this.velocidad;
    }
    
    public void letrasMatricula(){
        System.out.println("Las letras de la matricula son: " 
                + matricula.substring(4));
    }
    
    public void mostrarVelMat(){
        System.out.println("La matricula es: " + matricula + 
                " La velocicad es: " + velocidad);
     
    }
}
