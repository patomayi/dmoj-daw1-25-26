import java.util.Locale;
import java.util.Scanner;

public class primerdecimalparell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        //El teu codi aqui
        float num = sc.nextFloat();
        num *= 10;

        int numInt = (int)num;
        numInt %= 10;
        System.out.println( numInt % 2 == 0);
    }
}
