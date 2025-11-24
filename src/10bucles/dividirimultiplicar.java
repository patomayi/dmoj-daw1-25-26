import java.util.Locale;
import java.util.Scanner;

public class dividirimultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int n = sc.nextInt();
        int m = sc.nextInt();
        float resultado = n;
        System.out.print(resultado+" ");

        for(int i = n+1; i <= m; i++){

            if(i == 0){
                System.out.print(resultado+" ");
                continue;
            }
            if(i % 2 == 0){
                resultado /= i;
            } else {
                resultado *= i;
            }
            System.out.print(resultado+" ");
        }
        System.out.println();
    }
}