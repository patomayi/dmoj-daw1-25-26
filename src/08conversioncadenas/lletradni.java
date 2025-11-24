import java.util.Locale;
import java.util.Scanner;

public class lletradni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        String dni = sc.nextLine();
        String norma = "TRWAGMYFPDXBNJZSQVHLCKE";
        //int digitos =;
        //int numLetra = digitos % 23;
        System.out.println(dni);
    }
}
