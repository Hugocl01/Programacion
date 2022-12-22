# Tema2-Objetos-Hoja01-ej1

Suponemos una clase CajaAhorro que permite mantener el registro de depósitos y giros de una cuenta.
```
public class CajaAhorro {

    private int saldo;
    private int transacciones;

    public void depositar(int cantidad) {
        this.saldo += cantidad;
        transacciones++;
    }

    public void girar(int cantidad) {
        this.saldo -= cantidad;
        transacciones++;
    }

    public int obtenerSaldo() {
        return saldo;
    }

    public int obtenerTransacciones() {
        return transacciones;
    }
}
```
Tiene los siguientes atributos:
• private int saldo
• private int transacciones (El número de transacciones serán el número de depósitos y giros realizados)

Los métodos que tiene son:
+ depositar (int cantidad): permite depositar el valor de la cantidad a la cuenta.
+ girar (int cantidad): permite registrar un giro por el valor de cantidad
+ obtenerSaldo(): retorna el saldo de la cuenta (valor int)
+ obtenerTransacciones(): retorna la cantidad total de transacciones (giros y depósitos) que se han hecho sobre la cuenta (valor int)

Las acciones a realizar son:
- a) Define un constructor sin parámetros que inicialice el saldo y las transacciones a 0.
- b) Define un constructor que recibe el saldo inicial de la cuenta e inicialice las transacciones a 1.
- c) Crea un programa principal que cree un objeto de tipo CajaAhorro con el constructor sin parámetros y realice un depósito de dinero, nos muestre el saldo, realice un giro, vuelve a consultar el saldo, y por último nosdice cuántas transacciones hemos hecho.
- d) Crea un objeto en el programa principal que cree un objeto de tipo CajaAhorro con un saldo inicial de 200. Muestra el saldo y el número de transacciones.
