import java.util.Locale;
import java.util.Scanner;
//Centrar y sumar la secuencia (v1)
//Dadas dos secuencias de números (una con enteros positivos,
// y la otra con enteros negativos), se pide centrar las dos
// secuencias y proceder a sumar sus valores.
public class centrarisumarseqv1 {
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
        for (int i = 0; i < tam2; i++) {
            array2[i] = sc.nextInt();
        }

        // El resultado siempre tiene tamaño tam1 (según el enunciado: tam1 >= tam2)
        int inicio2 = (tam1 - tam2) / 2;

        for (int i = 0; i < tam1; i++) {
            int suma = array1[i];

            // Si en esta posición cae un elemento de la seq2 centrada, lo sumamos
            if (i >= inicio2 && i < inicio2 + tam2) {
                suma = suma + array2[i - inicio2];
            }

            if (i > 0) System.out.print(" ");
            System.out.print(suma);
        }
    }
}