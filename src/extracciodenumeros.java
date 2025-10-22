import java.util.Locale;
import java.util.Scanner;

public class extracciodenumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        String palabra = sc.nextLine();

//        char a = palabra.charAt(1);
//        char b = palabra.charAt(3);
//        char c = palabra.charAt(5);
//        char d = palabra.charAt(7);

        System.out.println(Character.getNumericValue(palabra.charAt(1))+Character.getNumericValue(palabra.charAt(3))+Character.getNumericValue(palabra.charAt(5))+Character.getNumericValue(palabra.charAt(7)));

    }
}