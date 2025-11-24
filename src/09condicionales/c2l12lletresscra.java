import java.util.Locale;
import java.util.Scanner;

public class c2l12lletresscra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        char c = sc.next().charAt(0);
        int punts;
        switch (c) {
            case 'A': case 'E': case 'I': case 'O': case 'U': case 'L': case 'N': case 'S': case 'T': case 'R':
                punts = 1;
                break;
            case 'D': case 'G':
                punts = 2;
                break;
            case 'B': case 'C': case 'M': case 'P':
                punts = 3;
                break;
            case 'F': case 'H': case 'V': case 'W': case 'Y':
                punts = 4;
                break;
            case 'K':
                punts = 5;
                break;
            case 'J': case 'X':
                punts = 8;
                break;
            case 'Q': case 'Z':
                punts = 10;
                break;
            default:
                punts = 0;
                break;
        }
        System.out.println(punts);
    }
}