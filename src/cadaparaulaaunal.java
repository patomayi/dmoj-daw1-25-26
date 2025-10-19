import java.util.Locale;
import java.util.Scanner;

public class cadaparaulaaunal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        /*System.out.println("Escriba 5 palabras: ");*/
        String nom1 = scan.next();
        String nom2 = scan.next();
        String nom3 = scan.next();
        String nom4 = scan.next();
        String nom5 = scan.next();
        /*System.out.println("Las palabras son: ");*/
        System.out.println(nom1);
        System.out.println(nom2);
        System.out.println(nom3);
        System.out.println(nom4);
        System.out.println(nom5);
    }
}
