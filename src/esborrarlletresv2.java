import java.util.Locale;
import java.util.Scanner;
//**********************************
//        pregunta de examen
//          de arrays
// Borrar las letras (v2)
//**********************************
public class esborrarlletresv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        String[] palabras = new String[n];
        for (int i = 0; i < n; i++) {
            palabras[i] = sc.next();
        }

        int m = sc.nextInt();
        String[] borrar = new String[m];
        for (int i = 0; i < m; i++) {
            borrar[i] = sc.next(); // cada letra viene separada por espacio
        }

        for (int i = 0; i < n; i++) {
            String palabra = palabras[i];
            String resultado = "";

            for (int j = 0; j < palabra.length(); j++) {
                String letra = String.valueOf(palabra.charAt(j));

                boolean encontrada = false;
                for (int k = 0; k < m; k++) {
                    if (letra.equals(borrar[k])) {
                        encontrada = true;
                    }
                }

                if (!encontrada) {
                    resultado = resultado + letra;
                }
            }

            if (i > 0) System.out.print(" ");
            System.out.print(resultado);
        }
    }
}