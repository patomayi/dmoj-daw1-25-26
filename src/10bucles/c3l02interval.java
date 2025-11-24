import java.util.Locale;
import java.util.Scanner;

public class c3l02interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int mum1 = sc.nextInt();
        int num2 = sc.nextInt();

        for (int i = mum1; i < num2; i++) {
            System.out.print(i);
        }
    }
}