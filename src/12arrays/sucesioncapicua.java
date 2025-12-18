import java.util.Locale;
import java.util.Scanner;

public class sucesioncapicua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int tam = sc.nextInt();
        int[] array = new int[tam];
        for (int i = 0; i < tam; i++) {
            array[i] = sc.nextInt();
        }
        int comparador = tam-1;
        boolean bandera = true;
        for (int i = 0; i < tam/2; i++) {
            if (array[i] != array[comparador]) {
                bandera = false;
                break;
            }
            comparador--;
        }
        if(bandera) System.out.println("SI");
        else System.out.println("NO");
    }
}