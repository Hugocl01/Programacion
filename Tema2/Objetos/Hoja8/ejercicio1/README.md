# Tema2-Objetos-Hoja08-ej1

Diseñar una clase llamada Persona que tenga como atributos privados: el nombre, apellido1, apellido2 y dni y como métodos:
+ Un constructor que inicializa los atributos con los valores pasados como argumentos
+ Un método llamado clave que devuelve la contraseña de la persona (formada por la primera letra del nombre, las 3 primeras letras de apellido1 y la última letra de apellido2).
+ Un método llamado dniValido que devuelve verdadero si el dni es válido y falso en otro caso. (Controlar que tenga 9 caracteres y la letra correspondiente)

> NOTA: para calcular la letra se divide el número del dni entre 23 y el resto obtenido será la posición de la letra del dni en la siguiente cadena “TRWAGMYFPDXBNJZSQVHLCKE”
