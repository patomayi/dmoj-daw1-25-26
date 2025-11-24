import java.util.Locale;
import java.util.Scanner;

public class contractarunxef {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        /*System.out.println("Escriba 5 palabras: ");*/
        String nom = scan.nextLine();
        scan.nextLine();
        scan.nextLine();
        scan.nextLine();
        String tipus = scan.nextLine();
        /*System.out.println("Las palabras son: ");*/
        System.out.print("El formulari de ");
        System.out.print(nom);
        System.out.print(" s'ha completat. Et contactarem si necessitem un xef de cuina ");
        System.out.print(tipus);
        System.out.println(".");
    }
}
