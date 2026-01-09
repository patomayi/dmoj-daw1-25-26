import java.util.Locale;
import java.util.Scanner;

public class verticalsiguals {
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

        int columnaEncontrada = -1;

        // Revisar columna por columna
        for (int j = 0; j < columnas; j++) {
            boolean iguales = true;
            int valor = matriz[0][j];

            for (int i = 1; i < filas; i++) {
                if (matriz[i][j] != valor) {
                    iguales = false;
                    break;
                }
            }
            if (iguales) {
                columnaEncontrada = j;
                break; // solo queremos la primera
            }
        }
        // Mostrar resultado
        if (columnaEncontrada != -1) {
            System.out.println("La columna " + columnaEncontrada + " té tots els números iguals.");
        } else {
            System.out.println("No hi ha cap columna amb els números iguals.");
        }
    }
}