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
 * 0 0
 * <p>
 * Resultado
 * <p>
 * 0
 * 3
 * 1
 */
import java.util.Scanner;
public class Prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");

        while (!line[0].equals("0") || !line[1].equals("0")) {
            int resto = 0;
            int max = line[0].length();
            if (max < line[1].length()) {
                max = line[1].length();
            }

            long a = Long.parseLong(line[0]);
            long b = Long.parseLong(line[1]);

            for (int i = 0; i < max; i++) {
                long a1 = a % 10;
                long b1 = b % 10;

                if(a1 + b1 >= 10){
                    resto++;
                }

                a = (a - a1) / 10;
                b = (b - b1) / 10;

            }

            System.out.println(resto);
            line = sc.nextLine().split(" ");
        }

    }
}
