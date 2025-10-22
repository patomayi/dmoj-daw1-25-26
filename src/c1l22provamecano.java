import java.util.Locale;
import java.util.Scanner;

public class c1l22provamecano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        //El teu codi aqui
        int caracter = sc.nextInt();
        int error = sc.nextInt();
        int tiempo = sc.nextInt();
        int a = caracter-error;
        int b = (caracter+error)/2;
        float porcentaje = (a/b)*100;
        System.out.println(porcentaje);
    }
}
