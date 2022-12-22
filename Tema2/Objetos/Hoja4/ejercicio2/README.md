# Tema2-Objetos-Hoja04-ej2

Diseñar una clase llamada ‘coche’ con los atributos privados: matricula y velocidad y los métodos:
+ Un constructor que permita declarar objetos de tipo coche inicializado con la matricula y la velocidad pasados como argumentos.
+ Otro constructor que permita declarar objetos de tipo coche con la matricula, pasada como argumento y ponga la velocidad a 0.
+ Un método llamado acelera que incrementa la velocidad en el valor que pasamos como argumento, otro llamado frena idéntico pero que disminuye la velocidad, controlando siempre que la velocidad no puede ser menor de 0 ni mayor de 120.
+ Un método que permita mostrar las letras de la matrícula.
+ Un método que permita mostrar la matricula y velocidad del coche.


Ejemplo de ejecución:
```
creo un coche con matricula y velocidad
Coche [matricula=1234RET, velocidad=20]
creo otro coche solo con matricula
Coche [matricula=4567KKK, velocidad=0]
el coche 2 despues de frenar 10 es
Coche [matricula=4567KKK, velocidad=0]
el coche 1 despues de acelerar 80 es
Coche [matricula=1234RET, velocidad=100]
Las letras que tiene la matricula del coche Coche [matricula=1234RET, velocidad=100] son RET
```
