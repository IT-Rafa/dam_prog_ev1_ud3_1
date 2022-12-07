package es.itrafa.c_ejercicios_masDificiles.ej2;

import java.util.Scanner;

/**
 * [fuente: aceptaelreto.com (124)]
 * [cat: bucles simples]
 * CUANTAS ME LLEVO
 * <p>
 * Cuando aprendemos a sumar números pronto nos cuentan aquello de
 * "llevarse una": cuando los dos dígitos que sumamos llegan a la
 * decena tenemos "acarreo" que debemos sumar a los siguientes
 * dígitos (de la izquierda).
 * <p>
 * Cuando nuestros maestros nos ponían ejercicios, antes tenían que
 * contar cuántas veces tendríamos que "llevarnos una" y, con base en
 * eso, medían la dificultad del ejercicio.
 * <p>
 * ¿Puedes hacer un programa que automatice esa tarea?
 * <p>
 * Entrada
 * <p>
 * La entrada estará compuesta de numerosos casos de prueba, cada uno
 * de ellos en una línea. En cada línea aparecerían dos números positivos
 * separados por un espacio. Se garantiza que los números no tendrán más
 * de 1000 dígitos.
 * <p>
 * Los casos de prueba terminan con el caso especial 0 0, que no
 * provocará salida.
 * <p>
 * Salida
 * <p>
 * Para cada caso de prueba hay que escribir en una línea el número de
 * veces que hay "acarreo" en la suma.
 * <p>
 * Por ejemplo:
 * Entrada
 * <p>
 * 123 456
 * 555 555
 * 123 594
 * 0 0
 * <p>
 * Resultado
 * <p>
 * 0
 * 3
 * 1
 */
public class Prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbs = sc.nextLine().split(" ");

        while (!numbs[0].equals("0") || !numbs[1].equals("0")) {
            int a = Integer.parseInt(numbs[0]);
            int b = Integer.parseInt(numbs[1]);
            for (int i= 0; i < numbs[0].length(); i++){
                System.out.println(a%10);
                a = a - (a%10) - 10;
            }

            numbs = sc.nextLine().split(" ");
        }
    }
}
