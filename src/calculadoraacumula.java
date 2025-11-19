import java.util.Locale;
import java.util.Scanner;

public class calculadoraacumula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        /*Tengo que preguntar por que no se acaba el bucle;
*/
        String linea;
        float n = 0;
        do{
            linea = sc.nextLine();
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
        } while(!linea.equals("END"));;



    }
}