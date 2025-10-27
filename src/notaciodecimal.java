import java.util.Locale;
import java.util.Scanner;

public class notaciodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        //El teu codi aqui
        String n1 = sc.nextLine();
        String n2 = sc.nextLine();

        n1.replaceAll("'",".");
        n2.replaceAll("'",".");
        System.out.println(n1+"   "+n2);

    }
}