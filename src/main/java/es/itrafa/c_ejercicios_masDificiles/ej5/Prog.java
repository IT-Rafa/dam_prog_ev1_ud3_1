package es.itrafa.c_ejercicios_masDificiles.ej5;



/**
 * [fuente: aceptaelreto.com (371)]
 * [cat: bucles simples]
 * Aburrimiento en las sobremesas
 * <p>
 * Los palillos y las cerillas son elementos típicos de gran cantidad de
 * figuras, juegos y entretenimientos para la sobremesa. Todo el mundo,
 * alguna vez, cuando la conversación desvaría e invade el tedio, hemos
 * matado el tiempo haciendo formas geométricas, de mayor o menor tamaño
 * dependiendo de cuanto material de construcción tengamos a mano.
 * <p>
 * Por ejemplo, con 18 cerillas podemos formar la siguiente figura:
 * <p>
 * /\
 * /__\
 * /\  /\
 * /__\/__\
 * /\  /\  /\  *   /\                  / \
 * /__\/__\/__\ *  /__\ Son 3 cerillas /   \  __
 * <p>
 * <p>
 * Si la conversación es especialmente aburrida, se puede ir haciendo más
 * y más grande, hasta que se acaben las cerillas, el espacio en la mesa…
 * ¡o la conversación!
 * <p>
 * Entrada
 * <p>
 * La entrada estará compuesta de una sucesión de números positivos menores
 * que 20.000. El último, que no deberá procesarse, será un 0.
 * <p>
 * Salida
 * <p>
 * Por cada número de la entrada el programa deberá escribir cuántas cerillas
 * son necesarias para formar un triángulo con ese número de cerillas en cada
 * lado siguiendo el esquema de la figura.
 * <p>
 * Por ejemplo:
 * Entrada
 * <p>
 * 3  - 3*3=9 + (9/2)=4 + 4/2 + 2/1
 * 2  - 2*3=6 + 6/2=3
 * 1  - 1*3=3 + 3/2=1
 * 0
 * <p>
 * Resultado
 * <p>
 * 18
 * 9
 * 3
 */
import java.util.Scanner;
public class Prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado = sc.nextInt();

        while (lado > 0) {
            int cerillas = 0;
            for (int i = 1; i <= lado; i++) {
                cerillas += i * 3;
            }
            System.out.println(cerillas);

            lado = sc.nextInt();
        }
    }
}
