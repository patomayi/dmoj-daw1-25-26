import java.util.Locale;
import java.util.Scanner;

public class majordedat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int edad = sc.nextInt();
        boolean major = edad >= 18;
        System.out.println(major);

    }
}