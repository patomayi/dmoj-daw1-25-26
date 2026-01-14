import java.util.Scanner;
import java.util.Locale;
//**********************************
//        pregunta de examen
//          de arrays
// Longitudes múltiples (v1)
//**********************************
public class logmultiplev1 {
    public class logmultiplev1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            String[] palabras = new String[n];
            for (int i = 0; i < n; i++) {
                palabras[i] = sc.next();
            }

            int m = sc.nextInt();
            int[] nums = new int[m];
            for (int i = 0; i < m; i++) {
                nums[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                String w = palabras[i];

                // Solo transformamos si existe un número para esta posición
                if (i < m) {
                    int k = nums[i];

                    // Si k == 0, no se puede hacer módulo: se deja tal cual
                    if (k != 0) {
                        if (w.length() % k == 0) {
                            w = w.toUpperCase();
                        } else {
                            w = w.toLowerCase();
                        }
                    }
                }

                if (i > 0) System.out.print(" ");
                System.out.print(w);
            }
        }
}
