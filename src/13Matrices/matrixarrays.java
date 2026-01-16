import java.util.Locale;
import java.util.Scanner;

public class matrixarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int fila = sc.nextInt();
        int col = sc.nextInt();
        int[][] matriz = new int[fila][col];

        for(int i = 0; i < fila; i++){
            for (int j = 0; j < col; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        int contador0 = 0;
        int contador1 = 0;
        for(int i = 0; i < fila; i++){
            for (int j = 0; j < col; j++) {
                if(matriz[i][j] == 0) contador0++;
                else if (matriz[i][j]==1) contador1++;
                else break;
            }
        }
        System.out.println(contador0+" "+contador1);
    }
}