import java.util.Locale;
import java.util.Scanner;

public class bomberman2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer tamaño del tablero
        int filas = sc.nextInt();
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];

        // llenar
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                matriz[f][c] = sc.nextInt();
            }
        }
    }
}

