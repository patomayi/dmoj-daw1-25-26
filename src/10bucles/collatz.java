import java.util.Locale;
import java.util.Scanner;

public class collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int n = sc.nextInt();
        int contador = 0;
        while (n != 1){
            if (n % 2 == 0){
                n = n / 2;
            }else{
                n = n * 3 + 1;
            }
            contador++;
        }
        System.out.println(contador);
    }
}