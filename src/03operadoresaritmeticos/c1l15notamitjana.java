import java.util.Locale;
import java.util.Scanner;

public class c1l15notamitjana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();

        System.out.println((n1 + n2 + n3) / 3.0f);

    }
}