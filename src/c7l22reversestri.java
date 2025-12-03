import java.util.Locale;
import java.util.Scanner;

public class c7l22reversestri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        String cadena = sc.nextLine();
        char[] array = cadena.toCharArray();
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i]);
        }
        System.out.println();




    }
}