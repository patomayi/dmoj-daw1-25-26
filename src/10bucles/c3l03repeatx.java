import java.util.Locale;
import java.util.Scanner;

public class c3l03repeatx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int repetir = sc.nextInt();
        for (int i = 0; i < repetir; i++) {
            System.out.print(repetir);
        }
    }
}