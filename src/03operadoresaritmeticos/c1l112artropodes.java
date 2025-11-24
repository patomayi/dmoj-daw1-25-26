import java.util.Locale;
import java.util.Scanner;

public class c1l112artropodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int insectes = sc.nextInt();
        int aracnids = sc.nextInt();
        int crustacis = sc.nextInt();
        int miriapodes2p = sc.nextInt();
        int segment1 = sc.nextInt();
        int miriapodes4p = sc.nextInt();
        int segment2 = sc.nextInt();

        System.out.println(insectes*6 + aracnids*8 + crustacis*10 + (miriapodes2p*segment1)*2 + (miriapodes4p*segment2)*4);
    }
}
