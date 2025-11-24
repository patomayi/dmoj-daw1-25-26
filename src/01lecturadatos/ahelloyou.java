import java.util.Locale;
import java.util.Scanner;

public class ahelloyou {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String nom = sc.nextLine();
        System.out.print("Hola ");
        System.out.print(nom);
        System.out.print("!");
    }
}
