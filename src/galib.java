import java.util.Locale;
import java.util.Scanner;

public class galib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui

        float h = sc.nextFloat();
        int n = sc.nextInt();
        float alturaPonts = 0;

        for (int i = 1; i <= n ; i++){
            alturaPonts = sc.nextFloat();
            if(h > alturaPonts){
                System.out.println("xoca amb el pont "+i);
                break;
            }
        }
    }
}