import java.util.Locale;
import java.util.Scanner;

public class sumarparells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int n = sc.nextInt();
        int sumatoria = 0;
        for (int i = 0; i <= n; i++) {
            int secuencia = sc.nextInt();
            if(n%2==0){
                if(secuencia % 2 == 0){
                    sumatoria += secuencia;

                }
            }
            System.out.println(sumatoria);
            else{
                if(secuencia % 2 == 0){
                    sumatoria += secuencia;
                }
            }
            System.out.println(sumatoria);

        }
        System.out.println();
    }
}