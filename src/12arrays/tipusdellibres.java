import java.util.Locale;
import java.util.Scanner;

public class tipusdellibres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int tam = sc.nextInt();
        String[] libros = new String[tam];
        int[] cantidad = new int[tam];

        //Llenar:
        for (int i = 0; i < tam; i++) {
            libros[i] = sc.next();
        }
        for (int j = 0; j < tam; j++){
            cantidad[j] = sc.nextInt();
        }

        int menor = cantidad[0];
        //el programa
        for (int k = 1; k < tam; k++) {
            if (cantidad[k] < menor) {
                menor = cantidad[k];
            }
        }
        System.out.println("el llistat de llibres que menys tenim són:");
        for (int m = 0; m < tam; m++) {
            if (cantidad[m] == menor) {
                System.out.println(libros[m] + " " + cantidad[m]);
            }
        }
    }
}