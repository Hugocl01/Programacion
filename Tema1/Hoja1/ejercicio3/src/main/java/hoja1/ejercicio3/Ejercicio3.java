/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja1.ejercicio3;

/**
 *
 * @author hugoc
 */

/*
Ejercicio3.java
Programa que muestra el uso de los operadores aritméticos
*/
/*
public class Ejercicio3 {
    public static main(String[] args)                                           Falta el "void" y la llave de inicio del metodo main "{"
        short x = 7;                                                            
        int y = 5;
        float f1 = 13.5;                                                        Falta la "f" al final del valor que hemos asignado a la variable f1
        float f2 = 8f;
        System.out.println("El valor de x es ", x, " y el valor de y es ", y);  No podemos usar las comas "," si usamos un println debemos usar los signos "+" 
        System.out.println("El resultado de x + y es " + (x + y))               Falta ";" al final de la orden
        System.out.println("El resultado de x - y es " + (x - y));
        System.out.printf("\n%s%s\n","División entera:","x / y = ",(x/y));      En este caso debemos quitar "\n" ya que no queremos que salte de linea, ademas tenemos que añadir "%d" para que los escriba en pantalla la division de los entereos
        System.out.println("Resto de la división entera: x % y = " + (x % y));
        System.out.printf("El valor de f1 es %f y el de f2 es %f\n",f1,f2);
        System.out.println("El resultado de f1 / f2 es " + (f1 / f2))           Falta ";" al final de la orden
}
*/

/*Correcion del codigo*/
/*
Ejercicio3.java
Programa que muestra el uso de los operadores aritméticos
*/
public class Ejercicio3 {
    public static void main(String[] args){
        short x = 7;
        int y = 5;
        float f1 = 13.5f;
        float f2 = 8f;
        System.out.println("El valor de x es "+ x + " y el valor de y es "+ y); 
        System.out.println("El resultado de x + y es " + (x + y));
        System.out.println("El resultado de x - y es " + (x - y));
        System.out.printf("%s%s%d\n","División entera:","x / y = ",(x/y));
        System.out.println("Resto de la división entera: x % y = " + (x % y));
        System.out.printf("El valor de f1 es %f y el de f2 es %f\n",f1,f2);
        System.out.println("El resultado de f1 / f2 es " + (f1 / f2));
    }           
}

