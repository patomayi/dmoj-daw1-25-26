import java.util.Locale;
import java.util.Scanner;

public class bomberman2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);


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
        int n = sc.nextInt();
        int auxFila = 0;
        int auxColumna = 0;
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                if (n == matriz[f][c]){
                    auxFila = f;
                    auxColumna = c;
                    //guardar los arrays
                }
            }
        }
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                if(f == auxFila || c == auxColumna){
                    System.out.print("@");
                }
                else System.out.print("#");
            }
            System.out.println();
        }
    }
}

