/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja05.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Restaurante {
    private int huevos;
    private double kilosChorizo;

    public Restaurante(int nDocenas, double kilosChorizo) {
        this.huevos = nDocenas*12;
        this.kilosChorizo = kilosChorizo;
    }
    
    public void addHuevos(int docenasHuevos){
        this.huevos += docenasHuevos*12;
    }
    
    public void addChorizos(double kilosChorizo){
        this.kilosChorizo+= kilosChorizo;
    }
    
    public int getNumPlatos(){
        if ((this.huevos/2)>=(this.kilosChorizo*1000/200)){
            return (int)kilosChorizo*1000/200;
        }
        return this.huevos/2;
    }
    
    public void sirvePlato(){
        if (this.huevos>=2 && this.kilosChorizo>=0.2){
            this.huevos-=2;
            this.kilosChorizo-=0.2;
        }else{
            System.out.println("No podemos servir un plato");
        }
    }
    
    public int getHuevos(){
        return this.huevos;
    }
    
    public double getChorizo(){
        return this.kilosChorizo;
    }
}
