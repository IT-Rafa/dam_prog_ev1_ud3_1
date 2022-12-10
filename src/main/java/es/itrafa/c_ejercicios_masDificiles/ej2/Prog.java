package es.itrafa.c_ejercicios_masDificiles.ej2;


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
 * 99999999999999999999999999999999999 1
 * 0 0
 * <p>
 * Resultado
 * <p>
 * 0
 * 3
 * 1
 * 35
 */

import java.util.Scanner;

public class Prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cogemos entrada (primer input)
        String[] line = sc.nextLine().split(" ");

        // Repetimos hasta que ambos valores sean 0
        while (!line[0].equals("0") || !line[1].equals("0")) {
            // Variables a aumentar si hay resto
            int resto = 0;
            int add = 0;

            // Hallamos linea con más longitud
            int max = line[0].length();
            if (line[0].length() < line[1].length()) {
                max = line[1].length();
            }

            // Recorremos string largo
            for (int i = 0; i < max; i++) {
                // números a comparar
                int numA = 0;
                int numB = 0;

                // Si existe, cogemos el dígito de 1º número (fin String hacia 0)
                if (line[0].length() - 1 - i >= 0) {
                    numA = Integer.parseInt(String.valueOf(line[0].charAt(line[0].length() - 1 - i)));
                }
                // Si existe, cogemos el dígito de 2º número (fin String hacia 0)
                if (line[1].length() - 1 - i >= 0) {
                    numB = Integer.parseInt(String.valueOf(line[1].charAt(line[1].length() - 1 - i)));
                }

                // Mostramos cálculo (solo pruebas)
                // System.out.println("line " + i + ": " + numA + " + " + numB + " + " + add + " = " + (numA + numB + add));

                // Sumamos valor ambos números + resto y vemos si resto continua
                if (numA + numB + add > 9) {
                    // System.out.println("añade resto");
                    resto++;
                    add = 1;

                } else {
                    // Resto no continua
                    add = 0;

                    // Comprobamos que si es el primer número de algún valor, ya no se seguirá restando
                    if (line[0].length() - i <= 0 || line[1].length() - i <= 0) {
                        break;
                    }
                }

            }
            // Mostramos valor
            System.out.println(resto);

            // Cogemos entrada
            line = sc.nextLine().split(" ");
        }

    }
}
