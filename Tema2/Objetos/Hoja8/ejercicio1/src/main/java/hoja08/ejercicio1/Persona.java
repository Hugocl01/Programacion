/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja08.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Persona {

    //Atributos
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;

    //Constructor
    public Persona(String nombre, String apellido1, String apellido2, String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
    }

    public String clave() {
        String contrasena = nombre.substring(0, 1).concat(apellido1.substring(0, 3))
                .concat(apellido2.substring(apellido2.length() - 1));
        return contrasena;
    }

    public boolean dniValido() {
        String letra = "TRWAGMYFPDXBNJZSQVHLCKE";
        //Calculo el resto en base al numero del dni
        int num = (Integer.parseInt(dni.substring(0, 9))) % 23;
        //Guardo en un String el caracter de la posicion del resto
        String letra2 = Character.toString(letra.charAt(num));
        //Compruebo la longitud del dni es 10 y que la letra es valida 
        boolean valido = dni.length() == 10 && (dni.substring(9).equalsIgnoreCase(letra2));
        return valido;
    }
    
}
