# Tema2-Objetos-Hoja06-ej1

En el taller de coches DAW hay precios especiales para cambiar el aceite y las ruedas a los coches. Este taller tiene en el almacén el aceite y las ruedas para
realizar dichos cambios.


En el taller se necesita saber en un momento dado cuantos coches será capaz de atender en función de las existencias de ruedas y aceite que tiene en el taller.


Además, se quiere llevar el registro de los ingresos producidos en el taller por haber realizado los cambios de ruedas y aceite.


Para ello hay que crear una clase Taller con los atributos aceite, ruedas, contadorCambiosTotales, contadorCambiosParciales.


Como métodos tiene:
1. Constructor(int, int): recibirá el número de bidones de aceite y el número de ruedas que hay en el almacén. Los bidones de aceite son de 5 litros cada uno. Los contadores se inicializan a 0.
2. addAceite(int): incrementa los litros nuevos de aceite en función de los bidones que se pasan como parámetro.
3. addRuedas(int): incrementa el número de ruedas indicado para el almacén.
4. getCambioCompletos(): devuelve el número de coches al que se puede hacer un cambio completo con las existencias que tenemos en el almacén. Se utilizan 3 litros de aceite por coche y se cambian las cuatro ruedas del coche.
5. getCambioParcial(): devuelve el número de coches al que se puede hacer un cambio parcial con las existencias que tenemos en el almacén. Se utilizan 3 litros de aceite por coche y se cambian solo dos ruedas del coche.
6. cambioCompleto(): disminuye el número de litros de aceite y de ruedas del almacén porque se ha hecho el cambio completo a un coche en el taller e incrementa el contador correspondiente.
7. cambioParcial(): disminuye el número de litros de aceite y de ruedas del almacén porque se ha hecho el cambio parcial a un coche en el taller, e incrementa el contador correspondiente.
8. getRuedas(): devuelve el número de ruedas que hay en el taller.
9. getAceite(): devuelve el número de litros de aceite que hay en el taller.
10. toString(): devuelve un string con la siguiente información y con el siguiente


Formato:
```
TALLER
EXISTENCIAS:
  Ruedas: 50 unidades.
  Aceite: 230 litros.
INGRESOS: Total: 245,45 €
```
> Los ingresos se calculan de la siguiente manera: los cambios parciales se facturan a 5 euros el litro de aceite y 60 euros por rueda, y los cambios completos se facturan a 4,5 euros el litro de aceite y 50 euros por rueda. En el programa principal crea un taller y prueba todos sus métodos. 
Modifica la clase Taller para que tenga un constructor copia. En el programa principal crea un segundo objeto de tipo Taller haciendo uso de ese constructor.
Comprueba que los datos de ambos talleres son iguales.
