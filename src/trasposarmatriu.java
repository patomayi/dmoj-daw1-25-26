import java.util.Locale;
import java.util.Scanner;

public class trasposarmatriu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        // Leer
        int filas = sc.nextInt();
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];
        int[][] mat2 = new int[columnas][filas];

        // llenar
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                matriz[f][c] = sc.nextInt();
            }
        }

        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                mat2[c][f] = matriz[f][c];
            }
        }
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(mat2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
