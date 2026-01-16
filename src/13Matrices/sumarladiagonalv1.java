import java.util.Locale;
import java.util.Scanner;

public class sumarladiagonalv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        // Leer
        int tam = sc.nextInt();
        int[][] matriz = new int[tam][tam];

        // llenar
        for (int f = 0; f < tam; f++) {
            for (int c = 0; c < tam; c++) {
                matriz[f][c] = sc.nextInt();
            }
        }
        int suma = 0;
        for (int f = 0; f < tam; f++) {
            suma += matriz[f][f];
        }
        System.out.println(suma);
    }
}