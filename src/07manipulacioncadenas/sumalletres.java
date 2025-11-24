    import java.util.Locale;
    import java.util.Scanner;

    public class sumalletres {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            sc.useLocale(Locale.ENGLISH);
            //El teu codi aqui
            String palabra = sc.nextLine();
            char a = palabra.charAt(0);
            char b = palabra.charAt(1);
            char c = palabra.charAt(2);
            char d = palabra.charAt(3);
            char e = palabra.charAt(4);

            System.out.println(a+b+c+d+e);
        }
    }