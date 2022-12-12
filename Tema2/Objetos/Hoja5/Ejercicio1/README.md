# Tema2-Objetos-Hoja05-ej1

En un restaurante especializado en huevos fritos con chorizo necesitan un programa que les calcule cuántos platos de huevos con chorizo pueden preparar con la cantidad de existencias disponibles en la cámara frigorífica.

Diseña una clase denominada Restaurante con los siguientes métodos:
+ constructor( int, double): recibirá el número de docenas de huevos y de kilos de chorizo disponible en el frigorífico.
+ addHuevos( int): incrementa el número de docenas de huevos.
+ addChorizos( double): incrementa el número de kilos de chorizo.
+ getNumPlatos(): devuelve el número de platos de huevos con chorizo que se pueden ofrecer con las existencias actuales, teniendo en cuenta que cada plato necesita una media de 2 huevos y 200 gramos de chorizo.
+ sirvePlato(): disminuye el número de huevos y de kilos de chorizo porque se ha servido un plato (2 huevos menos y 200 gramos de chorizo menos)
+ getHuevos(): devuelve el número de huevos (no de docenas) que quedan en la cámara.
+ getChorizo(): devuelve el número de kilos de chorizo que quedan en la cámara.

> Realiza en el programa principal la definición de un Restaurante, de modo que se puedan probar todos los métodos para un objeto de tipo Restaurante.
