import java.util.Locale;
import java.util.Scanner;

public class c1l19sobrenous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        //El teu codi aqui
        int huevos = sc.nextInt();
        if (huevos % 24 == 0) {
            huevos /= 24;
            System.out.print(huevos);
            System.out.println(" "+0);
        } else {
            int hueveras = (int)huevos / 24;
            System.out.print(1+hueveras);
            System.out.print(" ");
            System.out.println(24 - (huevos % 24));
        }
    }
}