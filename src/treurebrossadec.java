import java.util.Locale;
import java.util.Scanner;

public class treurebrossadec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        String p1 = sc.nextLine();
        String p2 = sc.nextLine();

        p1 = p1.substring(1);

        int l = p2.length();
        p2 = p2.substring(0,l-2);
        float n1 = Float.valueOf(p1);
        float n2 = Float.valueOf(p2);
        System.out.println(n1+n2);
    }
}