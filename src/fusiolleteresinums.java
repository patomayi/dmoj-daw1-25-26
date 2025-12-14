import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class fusiolleteresinums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int tam1 = sc.nextInt();
        String[] a1 = new String[tam1];
        for (int i = 0; i < tam1; i++) {
            a1[i] = sc.next();
        }

        int tam2 = sc.nextInt();
        String[] a2 = new String[tam2];
        for (int j = 0; j < tam2; j++) {
            a2[j] = sc.next();
        }

        int suma = tam1+tam2;
        String[] unido = new String[suma];
        for (int k = 0; k < suma; k++) {
            if(a1[k].charAt(0) >= '0' && a1[k].charAt(0) <= '9'){
                unido[k] = a1[k];
                System.out.println(a1[k]);
            }
        }

    }
}