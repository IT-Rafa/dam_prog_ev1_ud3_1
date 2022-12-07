package es.itrafa.c_ejercicios_masDificiles.ej1;

/**
 * [fuente: aceptaelreto.com (166)]
 * [cat: bucles simples]
 * <p>
 * ZAPPING
 * Mi tele tiene 99 canales correlativos que van desde el canal número 1 al 99.
 * Hace algún tiempo se me estropeó el mando a distancia, y no me funcionan los
 * números, por lo que no puedo acceder a mi canal favorito con ellos. Al menos,
 * todavía funcionan los botones de pasar al siguiente canal y al anterior.
 * <p>
 * No quiero que también estos botones se me rompan, de modo que siempre intento
 * pulsarlos el menor número de veces.
 * <p>
 * Sabiendo que al pasar al siguiente canal desde el 99 la tele me salta al 1,
 * y viceversa, ¿cuántas veces tengo que avanzar o retroceder de canal para pasar
 * de un canal "A" a un canal "B" de forma óptima?
 * <p>
 * Entrada
 * <p>
 * La entrada consta de una serie de casos de prueba consistentes en dos valores
 * entre 1 y 99, el primero correspondiente al canal en el que me encuentro y el
 * segundo al canal al que quiero llegar. La entrada termina cuando los dos números
 * son 0.
 * <p>
 * Salida
 * <p>
 * Para cada caso de prueba se escribirá una línea en la que aparecerá el número de
 * veces que tengo que saltar de canal para conseguir mi objetivo de forma óptima.
 * <p>
 * Por ejemplo:
 * <p>
 * Entrada
 * <p>
 * 2 5
 * 2 99
 * 5 63
 * 63 5
 * 0 0
 * <p>
 * Resultado
 * <p>
 * 3
 * 2
 * 41
 * 41
 *
 * <p>
 * Entrada
 * <p>
 * 49 1
 * 1 49
 * 1 50
 * 50 1
 * 51 1
 * 1 51
 * 48 1
 * 1 48
 * 99 1
 * 1 99
 * 99 2
 * 2 99
 * 0 0
 *
 * Resultado
 *
 * 48
 * 48
 * 49
 * 49
 * 49
 * 49
 * 47
 * 47
 * 1
 * 1
 * 2
 * 2

 */

import java.util.Scanner;

public class Prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int primero = sc.nextInt();
        int segundo = sc.nextInt();


        while (primero != 0 || segundo != 0) {
            // Controla secuencia de ambos
            int ruta = 0;

            // ini es indice para la cuenta hacia atrás
            int ini = primero;
            // i controla la cuenta adelante. internamente la cuenta atrás
            // el bloqueo normal se hace al llegar al número hacia adelante;
            // El bloqueo se hace como "no es igual" porque puede estar más atrás.
            for (int i = primero; i != segundo; i++){
                // Si cuenta atrás lo encuentra antes sale
                if(ini == segundo){
                    break;
                }

                // controlamos i al llegar al 100 (vueltas todo el rato, hasta encontrar número
                if(i == 99) {
                    i = 0;
                }
                // controlamos índice cuenta atrás hasta el 0.
                if(ini == 1){
                    ini = 100;
                }
                // bajamos 1 el índice cuenta atrás
                ini--;
                // contamos cada paso
                ruta++;

            }
            // Mostramos salida
            System.out.println(ruta);

            // Repetimos hasta 0 0
            primero = sc.nextInt();
            segundo = sc.nextInt();
        }
    }
}
