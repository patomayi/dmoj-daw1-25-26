import java.util.Locale;
import java.util.Scanner;

public class calcularfibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int n = sc.nextInt();
        int fibo = 0;
        int num = 1;
        int siguiente;

        int i = 0;
        while (i < n){
            siguiente = fibo + num;
            fibo = num;
            num = siguiente;
            System.out.print(fibo + " ");
            i++;
        }
    }
}