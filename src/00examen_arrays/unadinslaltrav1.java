import java.util.Locale;
import java.util.Scanner;
//Una dentro de la otra (v1)
//Dadas dos secuencias (las dos con palabras),
// se pide mostrar por pantalla cuántas palabras
// de la segunda lista aparecen dentro de cada
// palabra de la primera lista.
public class unadinslaltrav1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n1 = sc.hasNextInt() ? sc.nextInt() : 0;
        String[] a = new String[n1];
        for (int i = 0; i < n1; i++) a[i] = sc.next();

        int n2 = sc.hasNextInt() ? sc.nextInt() : 0;
        String[] b = new String[n2];
        for (int i = 0; i < n2; i++) b[i] = sc.next();

        for (int i = 0; i < n1; i++) {
            String word = a[i];
            StringBuilder line = new StringBuilder();
            line.append(word).append(": ");

            for (int j = 0; j < n2; j++) {
                if (word.contains(b[j])) {
                    line.append(b[j]).append(' ');
                }
            }
            System.out.println(line.toString());
        }
    }
}