package es.itrafa.ej2;

/**
 *
 * ¡Hola mundo!
 * Tiempo máximo: 1,000 s Memoria máxima: 2048 KiB
 *
 * Dicen los viejos que en este país el latín era una asignatura obligatoria por la que todos los estudiantes de
 * bachillerato tenían que pasar.
 * Dicen los viejos que el primer día de clase de latín cualquiera esperaba que los alumnos salieran sabiendo el
 * rosa rosae".
 * Dicen los viejos que esa era la primera declinación.
 *
 * Quizá, dentro de muchos años, nosotros seamos los viejos que contemos batallitas de cómo se enseñaba informática.
 * Y quizá entonces, digamos que en la primera clase de cualquier curso en el que se explicara un lenguaje de
 * programación, se tenía que salir habiendo escrito "un hola mundo".
 * Y eso es lo que vamos a hacer. Escribir un programa que escriba tantos "hola mundo" como nos pidan.
 *
 * Entrada
 * La entrada consta de una única línea que contiene un número n, 05, que indica cuántos mensajes hay que emitir.
 * Salida
 *
 * Cada mensaje a escribir aparecerá en una única línea y será la cadena "Hola mundo.".
 * Entrada de ejemplo
 *
 * 3
 *
 * Salida de ejemplo
 *
 * Hola mundo.
 * Hola mundo.
 * Hola mundo.
 */

import java.util.Scanner;

public class Prog {
    public static void main(String[] args) {
        String st = "Hola mundo.";
        Scanner sc = new Scanner(System.in);
        int rep = sc.nextInt();
        for(int i = 0; i< rep; i++){
            System.out.println(st);
        }
    }
}