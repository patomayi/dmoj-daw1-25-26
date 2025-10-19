import java.util.Locale;
import java.util.Scanner;

public class c1l16llumsapagad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        boolean lum1 = sc.nextBoolean();
        boolean lum2 = sc.nextBoolean();
        boolean lum3 = sc.nextBoolean();
        boolean lum4 = sc.nextBoolean();

        System.out.println(lum1 && lum2 && lum3 && lum4);


    }
}