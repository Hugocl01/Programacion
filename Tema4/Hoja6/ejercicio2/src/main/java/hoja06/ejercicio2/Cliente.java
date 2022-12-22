/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja06.ejercicio2;

/**
 *
 * @author DAW102
 */
public class Cliente {
    
    private int codigo;
    private String nombre;
    private String apellidos;
    private int telefono;
    private int saldo;

    public Cliente(int codigo, String nombre, String apellidos, int telefono, int saldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.saldo = saldo;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
}
