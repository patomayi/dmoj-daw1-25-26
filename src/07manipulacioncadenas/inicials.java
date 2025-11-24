import java.util.Locale;
import java.util.Scanner;

public class inicials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        //El teu codi aqui
        String nom1 = sc.next().toUpperCase();
        String nom2 = sc.next().toUpperCase();
        char a = nom1.charAt(0);
        char b = nom2.charAt(0);

        System.out.println(""+a+b);
    }
}