# Tema2-Objetos-Hoja02-ej1
1. Dada la siguiente clase:
```
public class Circulo {
    private double radio;   

    public Circulo() {   

    }

    public Circulo(double radio) {    
        this.radio = radio;
    }

    public double getRadio() {          
        return radio;
    }

    public void setRadio(double radio) {       
        this.radio = radio;
    }

    public double area() {
        return Math.PI * Math.pow(radio, 2);    
    }

    public double longitud() {
        return 2 * Math.PI * radio;        
    }
}
```
Realiza las siguientes acciones:
+ Documenta la clase indicando que hace cada método y atributo
+ Crear un objeto de la clase Circulo que se llame c1 utilizando el constructor por defecto
+ Crear un objeto de la clase Circulo que se llame c2 inicializando el radio a 10
+ Crear un objeto de la clase Circulo que se llame c3 inicializando el radio a un valor que hayamos solicitado al usuario por teclado.
+ Cambia el valor del radio del objeto c1 a 5
+ Muestra por pantalla el nuevo valor del radio de c1
+ Muestra por pantalla el valor del radio de c3
+ Muestra por pantalla el área dec2
+ Muestra por pantalla el área y longitud de c3
