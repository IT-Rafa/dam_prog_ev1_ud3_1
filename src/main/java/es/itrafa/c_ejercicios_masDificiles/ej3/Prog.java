package es.itrafa.c_ejercicios_masDificiles.ej3;

import java.util.Scanner;

/**
 * EL ASCENSOR
 * Problema número 156
 * http://www.aceptaelreto.com/problem/statement.php?id=156
 * <p>
 * Las máquinas son incansables; una vez puestas en marcha, estarán funcionando
 * sin quejarse por muchas veces que les pidas hacer lo mismo.
 * <p>
 * Pensemos en un ascensor, por ejemplo. Empieza el día en el bajo; el del
 * primero le llama y le hace subir al quinto. Justo después le llaman en el
 * segundo y le toca bajar a la planta baja. Luego el del tercero quiere ir a
 * ver al del noveno... Al final del día ha hecho un largo recorrido de arriba
 * a abajo, y de abajo a arriba. ¿Cuál es la longitud de ese recorrido?
 * Entrada
 * <p>
 * La entrada contiene distintos casos de prueba, cada uno en una línea. En cada
 * una de ellas hay una secuencia de enteros. El primero marca el piso inicial
 * en el que empieza el ascensor (el 0 marca la planta baja; no hay plantas por
 * debajo de ella). A continuación aparecen parejas de enteros, cada uno de ellos
 * representando el uso del ascensor por parte de un vecino, con el piso desde el
 * que llama al ascensor y con el piso destino. La lista termina con un -1.
 * <p>
 * La entrada acaba con una línea en la que el ascensor comienza por debajo de la
 * planta baja.
 * <p>
 * Salida
 * <p>
 * Para cada caso de prueba se mostrará una línea en la que aparecerá la longitud
 * (en número de pisos) del recorrido completo del ascensor a lo largo del día.
 * <p>
 * <p>
 * Por ejemplo:
 * Entrada
 * <p>
 * 0 1 5 2 0 3 9 -1
 * 5 5 4 -1
 * 1 2 3 4 5 -1
 * -1
 * <p>
 * Resultado
 * <p>
 * 19
 * 1
 * 4
 */
public class Prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");

        while (Integer.parseInt(line[0]) >= 0) {
            int ruta = 0;
            int[] pisos = new int[line.length];

            for (int i = 0; i < line.length - 2; i++) {
                pisos[i] = Integer.parseInt(line[i]);
                pisos[i+1] = Integer.parseInt(line[i+1]);

                if (pisos[i] < pisos[i + 1]) {
                    ruta += pisos[i + 1] - pisos[i];

                } else {
                    ruta += pisos[i] - pisos[i + 1];
                }
                System.out.println("ruta = " + ruta);
            }
            System.out.println(ruta);
            line = sc.nextLine().split(" ");
        }

    }
}
