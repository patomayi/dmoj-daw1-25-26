import java.util.Locale;
import java.util.Scanner;

public class elspetitsdavant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        // Leer tres números enteros
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Comprobar si están ordenados de menor a mayor
        if (a <= b && b <= c) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}
