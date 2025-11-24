import java.util.Locale;
import java.util.Scanner;

public class c3l08showlinenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int cont = 1;
        String linea = sc.nextLine();
        do{
            System.out.println((cont < 10 ? " ":"") + cont + " | " + linea);
            linea = sc.nextLine();
            cont++;
        }
        while(!linea.equals("END"));
    }
}


