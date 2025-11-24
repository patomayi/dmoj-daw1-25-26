import java.util.Locale;
import java.util.Scanner;

public class eslalom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui BANDERÍ META
        String esqui = sc.nextLine();
        int i = 1;
        while (!esqui.equals("META")) {
            System.out.println(esqui+" "+i);
            esqui = sc.nextLine();
            i++;
        }
        System.out.println();
    }
}