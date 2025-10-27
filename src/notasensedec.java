import java.util.Locale;
import java.util.Scanner;

public class notasensedec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        //El teu codi aqui
        float prac = sc.nextFloat()*0.4f;
        float exam = sc.nextFloat()*0.6f;

        int nota = (int) (prac+exam);

        System.out.println(nota);
    }
}