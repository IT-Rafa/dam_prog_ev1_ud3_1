package es.itrafa.ejercicios_sencillos.ej5;

import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * [fuente: aceptaelreto.com (467)]
 * [cat: bucles simples]
 *
 * La palabra "polisílaba" es polisílaba, ya que tiene más de tres sílabas.
 * Este curioso fenómeno de una palabra describiéndose a sí misma también
 * se da en otros vocablos que describen propiedades de las palabras.
 *
 * Por ejemplo, tenemos que "esdrújula" es esdrújula y que "llana" es llana.
 * Si vamos a palabras con más de un significado, el mismo esquema de frase
 * aparentemente tautológica podemos tenerlo por ejemplo al afirmar que la
 * naranja es naranja.
 * Sea como sea, si alguien no sabe el significado de polisílaba o de esdrújula
 * las frases anteriores serán, efectivamente, simples tautologías vacías de
 * contenido.
 *
 * Entrada
 *
 * La entrada comienza con una línea con un número indicando cuántos casos hay
 * que procesar.
 * Cada caso tiene una frase con el esquema "X es Y" en la que tanto X como y
 * son palabras sin espacios con hasta 20 caracteres del alfabeto inglés.
 *
 * Salida
 *
 * Por cada caso de prueba se escribirá "TAUTOLOGIA" si la frase es una tautología
 * (sin distinguir entre mayúsculas y minúsculas) y "NO TAUTOLOGIA" en caso contrario.
 *
 * Por ejemplo:
 * Entrada
 *
 * 3
 * Polisilaba es polisilaba
 * NARANJA es naranja
 * Mandarina es naranja
 *
 * Resultado
 *
 * TAUTOLOGIA
 * TAUTOLOGIA
 * NO TAUTOLOGIA
 */
public class Prog {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int casos = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < casos; i++){
            String line = sc.nextLine();
            if(line.substring(0,line.indexOf(" es ")).toLowerCase().equals(
                    line.substring(line.indexOf(" es " )+4).toLowerCase()
            )){
                System.out.println("TAUTOLOGIA");
            }else{
                System.out.println("NO TAUTOLOGIA");
            }

        }
    }
}