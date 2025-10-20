import java.util.Locale;
import java.util.Scanner;

public class treurebrossa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        String p1 = sc.nextLine();
        String p2 = sc.nextLine();
        //substring(1)
        //String.length
        //length-2
        p1 = p1.substring(1);

        int l = p2.length();
        p2 = p2.substring(0,l-2);
        int n1 = Integer.valueOf(p1);
        int n2 = Integer.valueOf(p2);
        System.out.println(n1+n2);
    }
}