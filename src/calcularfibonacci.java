import java.util.Locale;
import java.util.Scanner;

public class calcularfibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int n = 99;
        int cont = 0;
        if (n > 0) {
            while (n == cont) {
                n = sc.nextInt();
                System.out.println(cont);
                cont++;
            }
            System.out.print(1);
        }
    }
}