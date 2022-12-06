package es.itrafa.b_ejercicios_sencillos.ej7;

/**
 * problema 252 de acepta el reto
 *
 * https://www.aceptaelreto.com/problem/statement.php?id=252
 *
 * Juan Filloy, un escritor argentino nacido en 1894, se autoproclamó el
 * "recordman mundial de palindromía" pues gracias a él hoy conocemos más
 * de 8.000 palíndromos españoles.
 *
 * En justicia, sin embargo, debemos decir que ese título hoy día debería
 * llevárselo Victor Carbajo, un músico y compositor español que en su web1
 * mantiene una colección de más de 100.001 palíndromos que amplía regularmente.
 *
 * Un palíndromo es una palabra o frase que, tras unificar mayúsculas y
 * quitarle tildes, espacios y signos de puntuación, se lee igual de izquierda
 * a derecha que de derecha a izquierda. Un ejemplo es el título de este problema,
 * uno de los palíndromos más famosos de Juan Filloy.
 *
 * Asociada a los palíndromos, existe la pregunta casi filosófica de si éstos
 * se inventan o se descubren. Nosotros nos quedaremos con la segunda opción e
 * intentaremos descubrir, dada una frase, si es o no palíndroma.
 *
 * Entrada
 * La entrada estará compuesta por múltiples casos de prueba. Cada caso de prueba
 * es una única línea con una palabra o frase de no más de 100 caracteres.
 * En ella puede haber tanto letras mayúsculas como minúsculas del alfabeto inglés
 * y uno o varios espacios separando palabras (eso sí, las líneas empezarán y
 * terminarán siempre con letra, nunca con espacios). A riesgo de comprometer la
 * ortografía y la semántica, las palabras no contendrán tildes y los signos de
 * puntuación se omiten.
 *
 * El último caso de prueba va seguido de una línea con XXX que marca el final y
 * no debe ser procesada.
 *
 * Salida
 * Por cada caso de prueba se escribirá SI si la palabra o frase es palíndroma y
 * NO en caso contrario.
 *
 * Por ejemplo:
 * Entrada 	Resultado
 *
 * Acaso hubo buhos aca
 * Querido muerto esta tarde llegamos
 * Radar
 * XXX
 *
 *
 *
 * SI
 * NO
 * SI
 */
import java.util.Scanner;

public class Prog {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        while (!line.equals("XXX")){

            String format = line.toLowerCase().
                    replace(" ", "").
                    replace("\t", "");

            int end = format.length() -1 ;

            int i;
            for( i = 0; i < (format.length() /2) + 1; i++){
                if(format.charAt(i) == format.charAt(end)){
                    end--;
                }else{
                    break;
                }

            }

            if(i == (format.length() /2) + 1){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }

            line = sc.nextLine();
        }
    }
}