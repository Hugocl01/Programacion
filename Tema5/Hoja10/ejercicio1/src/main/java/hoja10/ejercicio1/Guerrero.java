/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja10.ejercicio1;

/**
 *
 * @author DAW102
 */
public abstract class Guerrero {

    //Atributos
    private String nombre;
    private int edad;
    private int fuerza;
    private boolean herido;
    private boolean muerto;

    //Constructores
    public Guerrero(String nombre, int edad, int fuerza) {
        this.nombre = nombre;
        if (comprobarEdad(edad)) {
            this.edad = edad;
        } else {
            this.edad = 25;
        }
        if (comprobarFuerza(fuerza)) {
            this.fuerza = fuerza;
        } else {
            this.fuerza = 5;
        }
        this.herido = false;
        this.muerto = false;
    }

    public Guerrero() {
        this("GuerreroX", 15, 1);
    }
    
    public Guerrero(Guerrero a) {
        this.nombre = a.nombre;
        this.edad = a.edad;
        this.fuerza = a.fuerza;
        this.herido = a.herido;
        this.muerto = a.muerto;
    }
    
    //Metodo abstracto
    public abstract boolean retirarse();
    
    //Metodos set y get
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public boolean isHerido() {
        return herido;
    }

    public void setHerido(boolean herido) {
        this.herido = herido;
    }

    public boolean isMuerto() {
        return muerto;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    //Metodos estaticos
    public static boolean comprobarEdad(int e) {
        boolean comprobar = (e >= 15 && e <= 60);
        try {
            if (!comprobar) {
                throw new Exception("Fuera de rango");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return comprobar;
    }

    public static boolean comprobarFuerza(int f) {
        boolean comprobar = (f >= 1 && f <= 10);
        try {
            if (!comprobar) {
                throw new Exception("Fuera de rango");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return comprobar;
    }
    
}
