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

        for(int i = 0; i < tam1; i++){
            for (int j = 0; j < tam2; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int contador0 = 0;
        int contador1 = 0;
        for(int i = 0; i < tam1; i++){
            for (int j = 0; j < tam2; j++) {
                if(array[i][j] == 0) contador0++;
                else if (array[i][j]==1) contador1++;
                else break;
            }
        }
        System.out.println(contador0+" "+contador1);
    }
}