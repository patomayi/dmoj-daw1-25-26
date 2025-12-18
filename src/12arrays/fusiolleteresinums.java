import java.util.Scanner;
import java.util.Locale;

public class fusiolleteresinums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        // Leer tamaño de las listas
        int tam1 = sc.nextInt();
        char[] lista1 = new char[tam1];
        //Aqui lee caracter por caracter y lo acomoda en el array
        for (int i = 0; i < tam1; i++) {
            lista1[i] = sc.next().charAt(0);
        }

        int tam2 = sc.nextInt();
        char[] lista2 = new char[tam2];
        for (int i = 0; i < tam2; i++) {
            lista2[i] = sc.next().charAt(0);
        }

        // Separar números y letras en orden de llegada
        char[] numeros = new char[tam1 + tam2];
        char[] letras = new char[tam1 + tam2];
        int posicionNumero = 0;
        int posicionLetra = 0;

        int max = tam1 > tam2 ? tam1 : tam2;
        for (int i = 0; i < max; i++) {
            if (i < tam1) {
                if (lista1[i] >= '0' && lista1[i] <= '9') {
                    numeros[posicionNumero] = lista1[i];
                    posicionNumero++;
                } else {
                    letras[posicionLetra] = lista1[i];
                    posicionLetra++;
                }
            }
            if (i < tam2) {
                if (lista2[i] >= '0' && lista2[i] <= '9') {
                    numeros[posicionNumero] = lista2[i];
                    posicionNumero++;
                } else {
                    letras[posicionLetra] = lista2[i];
                    posicionLetra++;
                }
            }
        }

        // Fusionar intercalando
        char[] resultado = new char[posicionNumero + posicionLetra];
        int i = 0, j = 0, k = 0;
        while (i < posicionNumero || j < posicionLetra) {
            if (i < posicionNumero) {
                resultado[k] = numeros[i];
                i++;
                k++;
            }
            if (j < posicionLetra) {
                resultado[k] = letras[j];
                j++;
                k++;
            }
        }

        // Mostrar resultado
        for (int m = 0; m < k; m++) {
            System.out.print(resultado[m] + " ");
        }
    }
}