import java.util.Locale;
import java.util.Scanner;

public class matrixarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int tam1 = sc.nextInt();
        int tam2 = sc.nextInt();
        int[][] array = new int[tam1][tam2];
        int[] sumasFilas = new int[array.length];

        for(int i = 0; i < tam1; i++){
            for (int j = 0; j < tam2; j++) {
                array[i][j] = sc.nextInt();
            }
        }
    }
}