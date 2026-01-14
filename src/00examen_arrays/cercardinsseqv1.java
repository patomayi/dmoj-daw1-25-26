import java.util.Locale;
import java.util.Scanner;
//Buscar dentro de la secuencia (v1)
//Dadas dos secuencias de números enteros, se pide mostrar
// por pantalla cuántas veces aparecen los números de la
// segunda secuencia dentro de la primera.
public class cercardinsseqv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int tam1 = sc.nextInt();
        int[] array1 = new int[tam1];

        for (int i = 0; i < tam1; i++) {
            array1[i] = sc.nextInt();
        }
        int tam2 = sc.nextInt();
        int[] array2 = new int[tam2];
        for (int i = 0; i <tam2; i++) {
            array2[i] = sc.nextInt();
        }
        for (int i = 0; i < tam2; i++) {
            int contador = 0;
            for (int j = 0; j < tam1; j++) {
                if (array1[j] == array2[i]) {
                    contador++;
                }
            }
            System.out.println(array2[i] + " " + contador);
        }
    }
}
