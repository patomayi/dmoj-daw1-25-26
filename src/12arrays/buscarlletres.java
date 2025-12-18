import java.util.Locale;
import java.util.Scanner;

public class buscarlletres   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        String cadena = sc.nextLine();
        String letra = sc.next();
        char[] array = cadena.toCharArray();
        int contenedor = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == letra.charAt(0)) {
                contenedor++;
            }
        }System.out.println(contenedor);
    }
}