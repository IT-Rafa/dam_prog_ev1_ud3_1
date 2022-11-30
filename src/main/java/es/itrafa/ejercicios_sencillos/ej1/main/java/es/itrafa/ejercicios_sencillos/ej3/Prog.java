package es.itrafa.ejercicios_sencillos.ej1.main.java.es.itrafa.ejercicios_sencillos.ej3;


/**
 * [fuente: aceptaelreto.com (313)]
 * [cat: bucles simples]
 *
 * A mí no me asusta el fin del mundo; me asusta el fin de mes, porque no siempre consigo que mis ingresos lleguen
 * conmigo. Los gastos se acumulan, y no sé qué más hacer para estirar mi triste sueldo.
 * Creo que el primer paso para mejorar mi situación es hacer una estimación de lo bien o lo mal que me va a ir un mes,
 * en función de los ingresos y los gastos previstos. Sé cuánto dinero tengo en el banco al principio, y sé cuánto va a
 * variar. ¿Me ayudas a saber si llegaré a fin de mes con dinero en el banco?
 *
 * Entrada
 *
 * La entrada comienza con un número que indica cuántos casos de prueba vendrán a continuación. Cada caso contiene dos
 * números, −10.000 ≤ s,c ≤ 10.000 indicando, respectivamente, el saldo en mi cuenta bancaria el primer día
 * del mes, y el cambio estimado (ingresos menos gastos) durante el mes.
 *
 * Salida
 *
 * Para cada caso de prueba, se escribirá "SI" si llego a fin de mes con saldo mayor o igual que cero, y NO en otro
 * caso.
 *
 * Por ejemplo:
 * Entrada
 *
 * 4
 * 100 -10
 * -10 -100
 * -10 100
 * 100 -1000
 *
 * Resultado
 *
 * SI
 * NO
 * SI
 * NO
 */
import java.util.Scanner;

public class Prog {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int casos = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < casos; i++){
            int saldo = sc.nextInt();
            int cambio = sc.nextInt();
            if(cambio + saldo >= 0){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }
    }
}