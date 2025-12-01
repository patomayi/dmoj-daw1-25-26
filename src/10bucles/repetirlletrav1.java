import java.util.Locale;
import java.util.Scanner;

public class repetirlletrav1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        String letra = sc.next();
        int n = sc.nextInt();
        boolean b = sc.nextBoolean();
        for(int i = 0; i <   n; i++){
            if(b){
                System.out.print(letra.toUpperCase());
            }else{
                System.out.print(letra.toLowerCase());
            }
        }
    }
}