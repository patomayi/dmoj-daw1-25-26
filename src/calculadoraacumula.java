import java.util.Locale;
import java.util.Scanner;

public class calculadoraacumula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        String linea = "";
        float n = (float)0;
        while(!linea.equals("END")){
            linea = sc.nextLine();
            linea.charAt(0);
            switch (linea.charAt(0)){
                case '+':
                    n += Float.parseFloat(linea.substring(2));
                    System.out.println(n);
                    break;
                case '-':
                    n -= Float.parseFloat(linea.substring(2));
                    System.out.println(n);
                    break;
                case '*':
                    n *= Float.parseFloat(linea.substring(2));
                    System.out.println(n);
                    break;
                case '/':
                    n /= Float.parseFloat(linea.substring(2));
                    System.out.println(n);
                    break;
            }

        }



    }
}