import java.util.Locale;
import java.util.Scanner;

public class sumarcolumnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int filas = sc.nextInt();
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];

        // Leer la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int cols = 0; cols < columnas; cols++) {
            int valor = matriz[0][cols];
            for (int fils = 1; fils < filas; fils++) {
                valor += matriz[fils][cols];
            }
            System.out.print(valor+" ");
        }
    }
}