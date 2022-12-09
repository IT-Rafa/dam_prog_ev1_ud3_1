package es.itrafa.c_ejercicios_masDificiles.ej4;

/**
 * [fuente: aceptaelreto.com (441)]
 * [cat: bucles simples]
 * CONTAR HASTA EL FINAL
 * <p>
 * El día que, con cuatro años, Clara averiguó que los números son infinitos
 * no le gustó nada. Le había costado mucho tiempo aprender a contar hasta 100,
 * estaba empezando a entender cómo llegar hasta 1.000, y de repente se había
 * enterado de que siempre tendría más y más números que aprender.
 * <p>
 * Le gustó tan poco ese descubrimiento que no pudo aceptarlo. A cualquier adulto
 * que veía le preguntaba, sin previo aviso, por qué los números nunca se acaban.
 * Aunque la respuesta era invariablemente la misma (un inquietante "porque siempre
 * se puede sumar uno más a cualquier número"), ella no perdía la esperanza de que
 * finalmente se rindieran y confesaran que todo había sido una broma de mal gusto.
 * <p>
 * Un año después, en clase de religión, encontró la incongruencia que estaba buscando.
 * Esta tarde, en cuanto llegara a su casa pillaría a su padre en un renuncio y le
 * obligaría a reconocer que, efectivamente, había un último número. La pregunta que le
 * haría resonaba en su mente...
 * <p>
 * — Papá, ¿Dios puede contar hasta el final?
 * <p>
 * Entrada
 * <p>
 * La entrada está compuesta por distintos casos de prueba cada uno en una línea.
 * <p>
 * Cada línea, de como mucho 1.000 caracteres, contiene un número entero utilizando el
 * punto para separar los millares.
 * <p>
 * Salida
 * <p>
 * Por cada caso de prueba se escribirá el resultado de sumar uno al número leído usando
 * el mismo formato que en la entrada.
 * <p>
 * nota del profe: del  enunciado original se desprende que podrían mandar números
 * negativos, pero no lo hacen. Para simplificar puedes hacer una solución sólo para
 * positivos y ver que también te daría un aceptado en aceptaelreto.com (sí está bien
 * por supuesto)
 * <p>
 * Por ejemplo:
 * Entrada
 * <p>
 * 1
 * 9
 * 1.345
 * 1.234.567
 * <p>
 * Resultado
 * <p>
 * 2
 * 10
 * 1.346
 * 1.234.568
 */
import java.util.Scanner;
public class Prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder line = new StringBuilder(sc.nextLine());
        // 1.234.568
        // 012345678
        while (!line.isEmpty()) {
            int add = 0;
            int j = 0;
            for (int i = line.length() - 1; i >= 0; i--) {
                // Añade el punto cuando hace falta
                if (j++ == 3 && i > 0) {
                    j = 0;
                    line.setCharAt(i, '.');

                } else {
                    // Sumamos 1 número al último del string
                    if (i == line.length() - 1) {

                        if (line.charAt(i) == '9') {
                            line.setCharAt(i, '0');
                            if (i == 0) {
                                if(j == 3){
                                    line = new StringBuilder("1." + line);
                                }else{
                                    line = new StringBuilder("1" + line);
                                }
                                i--;
                            }
                            add++;
                        } else {
                            line.setCharAt(i, (char) (line.charAt(i) + 1));
                        }


                    } else { // Resto String
                        if (add > 0) {
                            if (line.charAt(i) == '9') {
                                line.setCharAt(i, '0');
                                if (i == 0) {
                                    if(j == 3){
                                        line = new StringBuilder("1." + line);
                                    }else{
                                        line = new StringBuilder("1" + line);
                                    }
                                    i--;
                                }


                            } else {
                                line.setCharAt(i, (char) (line.charAt(i) + 1));
                                add = 0;
                            }
                        }

                    }
                }
            }
            System.out.println(line);
            line = new StringBuilder(sc.nextLine());
        }
    }
}
