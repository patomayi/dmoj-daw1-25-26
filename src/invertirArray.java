import java.util.Locale;
import java.util.Scanner;

public class invertirArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            sc.useLocale(Locale.ENGLISH);

            int array[] = {1, 2, 3, 4, 5};

            int invertido[] = new int[array.length];

            for (int i = invertido.length - 1, j = 0; i >= 0; i--, j++) {
                invertido[i] = array[j];
            }

            for (int i = 0; i < invertido.length; i++) {
                System.out.println(invertido[i]);
            }
        }

}
