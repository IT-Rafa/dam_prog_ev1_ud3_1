package es.itrafa.ej1;

/**
 * Perímetro de un rectángulo
 * Tiempo máximo: 1,000-2,000 s Memoria máxima: 4096 KiB
 * <p>
 * El perímetro de un polígono es la suma de la longitud de todos sus lados.
 * ¿Eres capaz de calcular el perímetro de un rectángulo?
 * Entrada
 * <p>
 * La entrada consta de una serie de casos de prueba. Cada uno contiene, en
 * una sola línea, la definición de un rectángulo. Un rectángulo se especifica
 * proporcionando las coordenadas de la esquina superior derecha.
 * Se debe considerar que la esquina inferior izquierda está siempre en el
 * origen de coordenadas, es decir en (0, 0). Se garantiza que la longitud
 * de un lado no superará 108.
 * <p>
 * Ejemplo de perímetro
 * <p>
 * El último caso de prueba, que no debe procesarse, contendrá un valor
 * negativo en alguno de los ejes.
 * <p>
 * Salida
 * <p>
 * Para cada caso de prueba se escribirá, en una línea independiente, el perímetro del rectángulo.
 * <p>
 * Entrada de ejemplo
 * <p>
 * 3 2
 * 5 4
 * -9 3
 * <p>
 * Salida de ejemplo
 * <p>
 * 10
 * 18
 */

import java.util.Scanner;

public class Prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largo = sc.nextInt();
        int alto = sc.nextInt();

        while (largo >= 0 && alto >= 0) {

            System.out.println((largo * 2) + (alto * 2));

            largo = sc.nextInt();
            alto = sc.nextInt();
        }
    }
}