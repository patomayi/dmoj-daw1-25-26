import java.util.Locale;
import java.util.Scanner;
//**********************************//
//        pregunta de examen        //
//          de arrays               //
//**********************************//
public class intercalarseqs {
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
        int limite = (tam1 > tam2) ? tam1 : tam2;

        for (int i = 0; i < limite; i++) {
            if (i < tam1) {
                System.out.print(array1[i] + " ");
            }
            if (i < tam2) {
                System.out.print(array2[i] + " ");
            }
        }
    }
}
