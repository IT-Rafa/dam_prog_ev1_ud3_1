package es.itrafa.ejercicios_sencillos.ej1;

/**
 * [fuente: aceptaelreto.com (362)]
 * [cat: bucles simples]
 *
 * La Navidad es una de las fiestas más esperadas. Cada uno tiene sus motivos (religiosos, fiestas en el colegio y
 * trabajo, villancicos…). Sobre todo los más pequeños de la casa, están impacientes de que sea Navidad y preguntan
 * insistentemente a sus padres: "¿Ya es Navidad?", "¿Ya es Navidad?", "¿Ya es Navidad?".
 * Nuestra tarea es hacer un programa que permita a nuestros niños saber si es Navidad o no.
 *
 * Entrada
 *
 * La entrada comenzará con un número N indicando cuántas fechas se consultarán. A continuación vendrán esas N
 * fechas, con dos números enteros, día y mes en el formato DD MM indicando el día y el mes a consultar.
 * Todas las fechas serán correctas.
 *
 * Salida
 *
 * Por cada fecha de la entrada, el programa deberá escribir SI si la fecha es la del día de Navidad, 25 de
 * diciembre, y NO en otro caso.
 *
 * Por ejemplo:
 * Entrada
 *
 * 2
 * 25 12
 * 03 05
 *
 * Resultado
 *
 * SI
 * NO
 */
import java.util.Scanner;

public class Prog {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cantFechas = sc.nextInt();
        for (int i = 0; i < cantFechas; i++){
            int dia = sc.nextInt();
            int mes = sc.nextInt();

            if (dia == 25 && mes == 12){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }

    }
}
