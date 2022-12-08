/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio2;

/**
 *
 * @author hugoc
 */
public class Numero {
    private int numA;

    public Numero() {
        numA = 0;
    }

    public Numero(int numA) {
        this.numA = numA;
    }
    
    public void suma(int numB){
        numA+=numB;
    }
    
    public void resta(int numB){
        numA-=numB;
    }

    public int getNumA() {
        return numA;
    }
    
    public int doble(){
        return numA*2;
    }
    
    public int triple(){
        return numA*3;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }
    
}
