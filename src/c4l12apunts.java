import java.util.Locale;
import java.util.Scanner;

public class c4l12apunts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //LLENA LOS DATOS BIEN
        int tam = sc.nextInt();
        String[] cadena = new String[tam];
        for (int i = 0; i < tam; i++) {
            int n = sc.nextInt();
            cadena[n-1] = sc.nextLine();
        }
        for (int i = 0; i < tam; i++) {
            System.out.print(i+1+" ");
            System.out.println(cadena[i]);
        }


    }
}