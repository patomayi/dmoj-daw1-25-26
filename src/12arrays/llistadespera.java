import java.util.Locale;
import java.util.Scanner;

public class llistadespera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        //El teu codi aqui
        int tam = sc.nextInt();   // número de aspirantes

        String[] centros = new String[tam];
        for (int i = 0; i < tam; i++) {
            centros[i] = sc.next();   // leer cada centro
        }

        // Array para guardar los resultados
        int[] resultado = new int[tam];

        // Para cada aspirante, contamos los anteriores
        for (int i = 0; i < tam; i++) {
            int contador = 0;
            for (int j = 0; j < i; j++) {
                if (centros[j].equals(centros[i])) {
                    contador++;
                }
            }
            resultado[i] = contador;
        }
        // Imprimir resultado
        for (int i = 0; i < tam; i++) {
            System.out.print(resultado[i] + " ");
        }
    }
}