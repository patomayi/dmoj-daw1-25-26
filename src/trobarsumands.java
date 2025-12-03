import java.util.Locale;
import java.util.Scanner;


public class trobarsumands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int suma = sc.nextInt();
        int tam = sc.nextInt();
        int[] array = new int[tam];
        int sumatoria = 0;
        for (int i = 0; i < tam; i++){
            array[i] = sc.nextInt();
        }
    }
}