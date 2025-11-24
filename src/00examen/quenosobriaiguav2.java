import java.util.Locale;
import java.util.Scanner;

public class quenosobriaiguav2 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            sc.useLocale(Locale.ENGLISH);
            //El teu codi aqui
            float litresPersona = sc.nextFloat();
            int persones = sc.nextInt();

            float totalLitres = litresPersona * persones;
            int total = (int)totalLitres;

            if (total < totalLitres){
                total++;
            }
            System.out.println(total);

    }
}