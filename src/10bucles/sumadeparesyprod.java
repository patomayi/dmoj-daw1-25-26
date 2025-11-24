import java.util.Locale;
import java.util.Scanner;

public class sumadeparesyprod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int digito = 0;
        int i = 0;
        int n1 = 0;
        int n2 = 1;
        while (digito != -1){
            digito = sc.nextInt();
            if (digito != -1){
                if(digito % 2 == 0){
                    n1 = n1 + digito;
                } else {
                    n2 = n2 * digito;
                }
                i++;
            }

        }
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(i);
    }
}