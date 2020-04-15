# TDD_Uniovi_2020
MasterClass TDD

## Ejercicios

### FizzBuzz

Escribe un programa que imprima los números del 1 al 100, pero aplicando las siguientes normas:
- Devuelve Fizz si el número es divisible por 3.
- Devuelve Buzz si el número es divisible por 5.
- Devuelve FizzBuzz si el número es divisible por 3 y por 5.

### Tennis

- Un juego es ganado por el primer jugador que haya conseguido al menos cuatro puntos en total y al menos dos puntos más que el oponente.
-  La puntuación de cada juego se describe de una manera peculiar del tenis: las puntuaciones de cero a tres puntos se describen como "nada", "quince", "treinta" y "cuarenta" respectivamente.
-  Si cada jugador ha obtenido al menos tres puntos y las puntuaciones son iguales, la puntuación es "iguales".
-  Si al menos tres puntos han sido anotados por cada lado y un jugador tiene un punto más que su oponente, la puntuación del juego es "ventaja" para el jugador en cabeza.

### String Calculator

-  Crear una calculadora con un método con la siguiente signatura: Sumar(string numeros)
-  El método puede tomar 0,1 o 2 números y retornar la suma de los mismos (para una cadena vacía debe devolver 0). Por ejemplo: "", "1" y "1,2"
-  Permitir que el método gestione una cantidad desconocida de números
-  Permitir que el método admita números separados por saltos de línea
	"1,\n2,3" debe devolver 6
	"1,\n" no es una entrada válida
- Permitir diferentes delimitadores entre números
-  Para cambiar el delimitador por defecto debe usarse el siguiente formato: “//[delimitador]\n[números…]” por ejemplo “//;\n1;2” debe retornar 3 donde el delimitador es ‘;’ .
-  Si se llama al método con un número negativo debe producir una excepción con el mensaje: "No se admiten números negativos"
-  Ignorar números mayores que 1000, de manera que "2,1001" retorna 2
