package es.itrafa.a_enviosRetos.ej3.ejercicios_sencillos.ej4;

/**
 * Nochevieja (148)
 * [fuente: aceptaelreto.com (148)]
 * [cat: bucles simples]
 * <p>
 * Ramón se pasa el día de Nochevieja contando los minutos que faltan para que den las uvas.
 * ¿Puedes ayudarle?
 * <p>
 * Entrada
 * La entrada consiste en una serie de horas, cada una en una línea. Cada hora está formada
 * por las horas y los minutos separados por: y utilizando siempre dos dígitos.
 * Se utiliza una representación en formato 24 horas (es decir, desde 00:00 a 23:59).
 * La entrada termina cuando la hora es la medianoche (00:00), que no debe procesarse.
 *
 * Salida
 *
 * Para cada caso de prueba se mostrará una línea con el número de minutos que faltan para medianoche.
 *
 * Por ejemplo:
 * Entrada
 *
 * 23:45
 * 21:30
 * 00:01
 * 1
 *
 * Resultado
 *
 * 15
 * 150
 * 1439
 */

import java.util.Scanner;

public class Prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        while (!input.equals("00:00")) {

            int hora = Integer.parseInt(input.substring(0, input.indexOf(":")));
            int min = Integer.parseInt(input.substring(input.indexOf(":") + 1));

            if ((hora >= 0 || hora < 24) && (min >= 0 || min < 60)) {
                int hResult = (23 - hora) * 60;
                int mResult = 60 - min;
                System.out.println(hResult + mResult);
            }
            input = sc.nextLine();
        }
    }
}