import java.util.Locale;
import java.util.Scanner;

public class notaciodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        //El teu codi aqui
        String n1 = sc.nextLine().replace("'",".");
        String n2 = sc.nextLine().replace("'",".");

        float num1 = Float.parseFloat(n1);
        float num2 = Float.parseFloat(n2);

        System.out.println(num1+num2);

    }
}