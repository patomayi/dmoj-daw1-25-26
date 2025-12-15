import java.util.Locale;
import java.util.Scanner;

public class subsecuencia1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui

        int tam1 = sc.nextInt();
        int[] secuencia1 = new int[tam1];
        for (int i = 0; i < tam1; i++) {
            secuencia1[i] = sc.nextInt();
        }

        int tam2 = sc.nextInt();
        int[] secuencia2 = new int[tam2];
        for (int i = 0; i < tam2; i++) {
            secuencia2[i] = sc.nextInt();
        }

        // Buscar subsecuencia
        boolean encontrado = false;
        for (int i = 0; i <= tam2 - tam1; i++) {
            boolean coincide = true;
            for (int j = 0; j < tam1; j++) {
                if (secuencia2[i + j] != secuencia1[j]) {
                    coincide = false;
                    break;
                }
            }
            if (coincide) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}