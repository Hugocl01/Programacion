/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja05.ejercicio2;

/**
 *
 * @author hugoc
 */
public class Mamifero {
    
    private String raza;
    private int nPatas;
    private String alimento;

    public Mamifero(String raza, int nPatas, String alimento) {
        this.raza = raza;
        this.nPatas = nPatas;
        this.alimento = alimento;
    }
    
    @Override
    public String toString() {
        return "Mamifero{" + "raza=" + raza + ", nPatas=" + nPatas + ", alimento=" + alimento + '}';
    }
    
}
