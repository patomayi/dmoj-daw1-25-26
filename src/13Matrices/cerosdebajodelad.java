import java.util.Locale;
import java.util.Scanner;

public class cerosdebajodelad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        // Leer
        int tam = sc.nextInt();

        int[][] matriz = new int[tam][tam];

        // llenar
        for (int f = 0; f < tam; f++) {
            for (int c = 0; c < tam; c++) {
                matriz[f][c] = sc.nextInt();
            }
        }
        boolean bandera = true;
        for (int f = 0; f < tam; f++) {
            for (int c = 0; c < f; c++) {
                if(matriz[f][c]!=0) bandera = false;
            }
        }
        System.out.println(bandera? "SI" : "NO");
    }
}
