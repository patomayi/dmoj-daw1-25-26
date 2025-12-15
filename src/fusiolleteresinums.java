import java.util.Scanner;
import java.util.Locale;

public class fusiolleteresinums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        // Leer tamaño de las listas
        int nt1 = sc.nextInt();
        char[] lista1 = new char[nt1];
        for (int i = 0; i < nt1; i++) {
            lista1[i] = sc.next().charAt(0);
        }

        int nt2 = sc.nextInt();
        char[] lista2 = new char[nt2];
        for (int i = 0; i < nt2; i++) {
            lista2[i] = sc.next().charAt(0);
        }

        // Separar números y letras en orden de llegada
        char[] numeros = new char[nt1 + nt2];
        char[] letras = new char[nt1 + nt2];
        int posNum = 0;
        int posLet = 0;

        int max = nt1 > nt2 ? nt1 : nt2;
        for (int i = 0; i < max; i++) {
            if (i < nt1) {
                if (lista1[i] >= '0' && lista1[i] <= '9') {
                    numeros[posNum] = lista1[i];
                    posNum++;
                } else {
                    letras[posLet] = lista1[i];
                    posLet++;
                }
            }
            if (i < nt2) {
                if (lista2[i] >= '0' && lista2[i] <= '9') {
                    numeros[posNum] = lista2[i];
                    posNum++;
                } else {
                    letras[posLet] = lista2[i];
                    posLet++;
                }
            }
        }

        // Fusionar intercalando
        char[] resultado = new char[posNum + posLet];
        int i = 0, j = 0, k = 0;
        while (i < posNum || j < posLet) {
            if (i < posNum) {
                resultado[k] = numeros[i];
                i++;
                k++;
            }
            if (j < posLet) {
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