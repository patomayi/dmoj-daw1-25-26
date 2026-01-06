import java.util.Locale;
import java.util.Scanner;

public class verticalsiguals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int fila = sc.nextInt();
        int col = sc.nextInt();
        int[][] matriz = new int[fila][col];

        for(int i = 0; i < fila; i++){
            for (int j = 0; j < col; j++) {
                matriz [i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < fila; j++) {
                int aux;
                    if (matriz[j][i] == matriz[j + 1][i] && matriz[j+1][i]<col) {
                            aux = matriz[j + 1][i];
                            System.out.println("la columna" + i + "Son iguales");
                    } else System.out.println("0");
            }
        }
    }
}