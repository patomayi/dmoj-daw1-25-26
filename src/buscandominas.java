import java.util.Locale;
import java.util.Scanner;

public class buscandominas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer tamaño del tablero
        int filas = sc.nextInt();
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];

        // Leer el tablero de minas (0 = no hay mina, 1 = hay mina)
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                matriz[f][c] = sc.nextInt();
            }
        }

        // Leer primera posición
        int x = sc.nextInt();
        int y = sc.nextInt();

        // Procesar posiciones hasta que llegue 0 0
        while (x != 0 || y != 0) {

            // Operador ternario para imprimir SI o NO
            System.out.println(matriz[x - 1][y - 1] == 1 ? "SI" : "NO");

            // Leer siguiente posición
            x = sc.nextInt();
            y = sc.nextInt();
        }
    }
}

