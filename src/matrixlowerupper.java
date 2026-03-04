import java.util.Locale;
import java.util.Scanner;

public class matrixlowerupper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int tam = sc.nextInt();
        String[][] matrizPalabras = new String[tam][tam];

        // Leer matriz de palabras
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                matrizPalabras[i][j] = sc.next();
            }
        }

        // Leer 1 entero por palabra y transformar
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                int k = sc.nextInt();          // SOLO uno por palabra
                int pos = (k >= 0) ? k : -k;

                char[] caracter = matrizPalabras[i][j].toCharArray();
                if (pos >= 0 && pos < caracter.length) {
                    if (k >= 0) caracter[pos] = Character.toUpperCase(caracter[pos]);
                    else caracter[pos] = Character.toLowerCase(caracter[pos]);
                }
                matrizPalabras[i][j] = new String(caracter);
            }
        }
        // Imprimir resultado
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print(matrizPalabras[i][j] + " ");
            }
            System.out.println();
        }
    }
}