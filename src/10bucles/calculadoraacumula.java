import java.util.Locale;
import java.util.Scanner;

public class calculadoraacumula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui

        /*tengo problemas con este y debo continuar despues*/
        float acum = 0;
        String c = "";

        while (!c.equals("END"))
        {
            c = sc.next();
            float n = sc.nextFloat();
            
            if (c.equals('+')) {
                acum += n;
            } else if (c.equals('-')) {
                acum -= n;
            } else if (c.equals('*')) {
                acum *= n;
            } else if (c.equals('/')) {
                acum /= n;
            }
            System.out.println(acum);
            c = sc.next();
        }
        
        if (c.equals("END") && acum == 0) {
            System.out.println(acum);
        }

    }
}