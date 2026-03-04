import java.util.Locale;
import java.util.Scanner;

public class matrixlowerupper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        String[][] matrizPalabras = new String[n][n];

        // Leer matriz n x n de palabras
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizPalabras[i][j] = sc.next();
            }
        }

        // Consumir el salto de línea pendiente
        sc.nextLine();

        // Leer n^2 líneas (una por palabra) y aplicar transformaciones
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                char[] caracter = matrizPalabras[i][j].toCharArray();

                String linea = sc.nextLine().trim();   // puede estar vacía
                if (linea.length() > 0) {
                    String[] nums = linea.split("\\s+"); // separados por espacios

                    for (int t = 0; t < nums.length; t++) {
                        int k = Integer.parseInt(nums[t]); // se asume input válido
                        int pos = k >= 0 ? k : -k;          // abs sin Math.abs

                        // posiciones 0-based, si no existe se ignora
                        if (pos >= 0 && pos < caracter.length) {
                            if (k >= 0) caracter[pos] = Character.toUpperCase(caracter[pos]);
                            else caracter[pos] = Character.toLowerCase(caracter[pos]);
                        }
                    }
                }

                matrizPalabras[i][j] = new String(caracter);
            }
        }

        // Imprimir matriz resultante
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrizPalabras[i][j] + " ");
            }
            System.out.println();
        }
    }
}
