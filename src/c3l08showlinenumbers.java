import java.util.Locale;
import java.util.Scanner;

public class c3l08showlinenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        String linea;
        int i = 1;
        while(!(linea = sc.nextLine()).equals("END")) {
            System.out.println(" " + i + " | " + linea);
            i++;
        }
    }
}


