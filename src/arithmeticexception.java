import java.util.Locale;
import java.util.Scanner;

public class arithmeticexception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int a = sc.nextInt();

        try {
            int res = 10 / a;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("No es pot dividir entre zero!");
        }

    }
}