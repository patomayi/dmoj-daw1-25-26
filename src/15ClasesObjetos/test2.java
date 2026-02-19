import java.util.Locale;
import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //Lectura de la 1a matriu
        int f= leerFila(sc);
        int c= leerCol(sc);
        int m1[][] = llenarMatriz(sc);

        //Lectura de la 2a matriu
        int f1 = leerFila(sc);
        int f2 = leerCol(sc);
        int m2[][] = llenarMatriz(sc);

        //Cerca d'elements i prints
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                int n = m2[i][j];
                int count = 0;

                for (int k = 0; k < m1.length; k++) {
                    for (int l = 0; l < m1[k].length; l++) {
                        if(m1[k][l] == n) count++;
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
    public static int[][] llenarMatriz(Scanner sc) {
        int f = sc.nextInt();
        int c = sc.nextInt();
        int[][] matriz = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = sc.nextInt();
                matriz[i][j] = sc.nextInt();
            }

        }
        return matriz;
    }
}
