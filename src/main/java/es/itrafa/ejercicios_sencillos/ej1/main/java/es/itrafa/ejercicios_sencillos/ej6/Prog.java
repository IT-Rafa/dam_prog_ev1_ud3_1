package es.itrafa.ejercicios_sencillos.ej1.main.java.es.itrafa.ejercicios_sencillos.ej6;

import java.util.Scanner;

/**
 * [fuente: aceptaelreto.com (368)]
 * [cat: bucles simples]
 * <p>
 * Cuando Enrique salió de su pueblecito camino a la gran ciudad para incorporarse a
 * la universidad como estudiante de informática, entró en un colegio mayor.
 * <p>
 * Así el cambio de vida no fue tan drástico; al menos no tuvo que prepararse la comida.
 * Una vez que empezó segundo, la cosa cambió.
 * <p>
 * Su hermano, un año menor, empezaba también los estudios superiores, así que les salía
 * más rentable alquilar un pequeño pisito que pagar dos habitaciones.
 * Y eso añadió la necesidad de aprender a cocinar.
 * <p>
 * La cantidad de horas que pasaron al teléfono con sus padres al otro lado dictándoles
 * recetas es inconfesable.
 * <p>
 * Ahora, muchos años después, aún recuerdan entre risas una de aquellas conversaciones.
 * Pedro, el hermano de Enrique, al teléfono; a su lado, Enrique; al otro lado de la línea,
 * su madre:
 * <p>
 * Pedro: 	Mamá, tenemos que cocer tres huevos. ¿Cómo era?
 * Madre: 	Ponlos en una olla con agua hirviendo.
 * Pedro: 	Ya, ya, eso ya. Pero no sé durante cuánto tiempo.
 * Madre: 	Dejadlos unos 10 minutos.
 * Enrique: 	Pero espera, que venían los de tu clase, tendremos que cocer al menos cinco.
 * Pedro: 	Oye mamá, ¿y si en lugar de tres son cinco?
 * Madre: 	Pues lo mismo, 10 minutos.
 * Enrique: 	¡Ostras! ¡Entonces cocer huevos es OO(1)!
 * Pedro: 	No, porque en la olla no entran infinitos huevos.
 * Enrique: 	Ah, claro…
 * Madre: 	¿¿¡¡Qué!!??
 * <p>
 * Y, como siempre, le tocó a Pedro explicar a su madre de qué hablaban.
 * <p>
 * La respuesta de la madre había hecho pensar inicialmente a Enrique que el tiempo de
 * cocción es el mismo, independientemente del número de huevos. Pero, como bien vio
 * Pedro, no es exactamente así porque la capacidad de la olla es finita, por lo que no
 * se puede cocer cualquier cantidad de huevos al mismo tiempo.
 * <p>
 * Como demostración de que el tiempo necesario para conseguir h huevos cocidos es en
 * realidad proporcional a ese h, vamos a calcularlo para distintos h y tamaños de ollas.
 * <p>
 * Entrada
 * <p>
 * La entrada estará compuesta por distintos casos de prueba, cada uno en una línea.
 * <p>
 * Cada caso de prueba consiste en dos números, h (1 ≤ h ≤10.000) y c (1 ≤ c ≤1.000) que
 * indican el número de huevos que queremos cocer y la capacidad (en huevos) de la olla.
 * <p>
 * La entrada termina con una línea con dos ceros que no debe procesarse.
 * <p>
 * Salida
 * <p>
 * Para cada caso de prueba se escribirá una línea con el número mínimo de minutos de
 * cocción necesarios para conseguir los huevos indicados si tenemos una olla con la
 * capacidad dada. Ten en cuenta que, según la madre de Enrique y Pedro, estos necesitan
 * un tiempo de cocción de 10 minutos.
 * <p>
 * Entrada de ejemplo
 * <p>
 * 3 5
 * 5 5
 * 6 5
 * 0 0
 * <p>
 * Salida de ejemplo
 * <p>
 * 10
 * 10
 * 20
 */
public class Prog {
    public static void main(String[] args) {
        final int MINUTOSOLLA = 10;
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int c = sc.nextInt();


        while (h != 0 || c != 0) {
            double hDouble = (double) h;

            int min = MINUTOSOLLA;
            while (hDouble / c > 1) {
                min += MINUTOSOLLA;
                hDouble -= c;
            }
            System.out.println(min);

            h = sc.nextInt();
            c = sc.nextInt();

        }
    }
}
