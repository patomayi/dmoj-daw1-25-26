import java.util.Locale;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int a = sc.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < a; i++) {
            array[i] = sc.nextInt();
        }
        int i = sc.nextInt();

        try {
            System.out.println(array[i]);
        } catch (IndexOutOfBoundsException error) {
            System.out.println("Aquesta posició no existeix dins l'array.");
        }

    }
}