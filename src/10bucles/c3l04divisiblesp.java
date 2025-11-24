import java.util.Locale;
import java.util.Scanner;

public class c3l04divisiblesp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}