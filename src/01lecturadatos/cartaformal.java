import java.util.Locale;
import java.util.Scanner;

public class cartaformal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        String tractament = scan.nextLine();
        String nom = scan.nextLine();
        String cognom1 = scan.nextLine();
        String cognom2 = scan.nextLine();

        System.out.println(tractament+" "+cognom1+" "+cognom2+", "+nom);
        System.out.println("El principal objectiu de la present carta...");
    }
}