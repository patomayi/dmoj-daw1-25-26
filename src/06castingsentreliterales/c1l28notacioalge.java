import java.util.Locale;
import java.util.Scanner;

public class c1l28notacioalge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        //El teu codi aqui
        int col = sc.nextInt()+96;
        System.out.print((char)(col));
        System.out.println(sc.next());
    }
}

