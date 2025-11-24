import java.util.Locale;
import java.util.Scanner;

public class liniapunts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int punto = sc.nextInt();
        int i = 0;
        /*
        for (int i = 0; i < punto; i++) {
            System.out.print(".");
        }*/
        while (i<punto){
            System.out.print(".");
            i++;
        }

    }
}