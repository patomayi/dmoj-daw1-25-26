import java.util.Locale;
import java.util.Scanner;

public class posiciondeunaletr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String palabra = sc.nextLine();
        char letra = sc.nextLine().charAt(0);
        char[] array = palabra.toCharArray();

        int pos = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == letra) {
                pos = i + 1; // posición empezando en 1
                break;
            }
        }

        if (pos != -1) {
            System.out.println(pos);
        } else {
            System.out.println("NO");
        }
    }
}