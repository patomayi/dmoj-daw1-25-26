import java.util.Locale;
import java.util.Scanner;

public class kebabcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        //El teu codi aqui
        String nom = sc.nextLine().toLowerCase().replace(" ","-");
        System.out.println(nom);
    }
}
