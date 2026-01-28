import java.util.Locale;
import java.util.Scanner;
public class Examen_NF8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //Lectura de la 1a matriu
        int f = leerFila(sc);
        int c = leerCol(sc);
        int m1[][] = llenarMatriz(sc, f, c); // Cambio: pasar f y c como parámetros para no volver a leerlas dentro de llenarMatriz.
        // Motivo: evitar leer dos veces filas/columnas y asegurar que la matriz tenga el tamaño correcto.

        //Lectura de la 2a matriu
        int f2 = leerFila(sc); // Cambio de nombre de variable: antes había dos "f1" y "f2" mal usados.
        // Motivo: claridad y coherencia con filas/columnas de la segunda matriz.
        int c2 = leerCol(sc);  // Cambio de nombre a c2 (antes se leía en una variable llamada f2 por error).
        // Motivo: corregir confusión entre filas y columnas.
        int m2[][] = llenarMatriz(sc, f2, c2); // Cambio: igual que en m1, usar las dimensiones ya leídas.

        //Cerca d'elements i prints
        for (int i = 0; i < f2; i++) {     // Cambio: usar f2 y c2 para recorrer m2 (antes usaba f y c).
            for (int j = 0; j < c2; j++) { // Motivo: se debe iterar con las dimensiones de m2, no de m1.
                int n = m2[i][j];
                int count = 0;

                for (int k = 0; k < m1.length; k++) {
                    for (int l = 0; l < m1[k].length; l++) {
                        if (m1[k][l] == n) count++;
                    }
                }

                System.out.println(n + " " + count);
            }
        }
    }

    public static int leerFila(Scanner sc){
        int fila = sc.nextInt();
        return fila;
    }
    public static int leerCol(Scanner sc){
        int columna = sc.nextInt();
        return columna;
    }
    public static int[][] llenarMatriz(Scanner sc, int f, int c) { // Cambio de firma: añadir f y c como parámetros.
        int[][] matriz = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = sc.nextInt(); // Cambio: eliminar la segunda lectura duplicada.
                // Motivo: antes se hacía dos veces sc.nextInt() y la primera se perdía,
                // dejando valores incorrectos.
            }
        }
        return matriz;
    }
}