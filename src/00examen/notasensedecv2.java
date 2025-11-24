import java.util.Locale;
import java.util.Scanner;

public class notasensedecv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        //El teu codi aqui
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();

        float res = num1 * 0.4f+ num2 * 0.6f;

        if(num1<5 || num2<5){
            System.out.println(0);
        }else {
            System.out.println((int)res);
        }
    }
}
