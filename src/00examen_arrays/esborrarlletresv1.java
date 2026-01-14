import java.util.Locale;
import java.util.Scanner;
//Borrar las letras (v1)
//Dadas dos secuencias (una de palabras, y la otra de números enteros positivos),
// se pide mostrar por pantalla las palabras de la primera secuencia, pero borrando
// la letra que aparece en la posición indicada por la segunda secuencia.
public class esborrarlletresv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        int m = sc.hasNextInt() ? sc.nextInt() : 0;
        int[] pos = new int[m];
        for (int i = 0; i < m; i++) {
            pos[i] = sc.nextInt();
        }

        StringBuilder out = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String w = words[i];
            if (i < m) {
                int p = pos[i]; // posición 0-based (como en los ejemplos)
                if (p >= 0 && p < w.length()) {
                    w = w.substring(0, p) + w.substring(p + 1);
                }
            }
            if (i > 0) out.append(' ');
            out.append(w);
        }

        System.out.print(out.toString());
    }
}