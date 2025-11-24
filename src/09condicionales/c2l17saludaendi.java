import java.util.Locale;
import java.util.Scanner;

public class c2l17saludaendi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        //El teu codi aqui
        String idioma = sc.nextLine().toLowerCase();

        if(idioma.equals("french")) {
            System.out.println("Bonjour");
        }else if (idioma.equals("spanish")) {
            System.out.println("Hola");
        }else if (idioma.equals("russian")) {
            System.out.println("Zdravstvuyte");
        }else if (idioma.equals("chinese")) {
            System.out.println("Nin hao");
        }else if (idioma.equals("japanese")) {
            System.out.println( "Konnichiwa");
        }else if (idioma.equals("german")) {
            System.out.println( "Guten Tag");
        }else if (idioma.equals("portuguese")) {
            System.out.println("Ola");
        }else if (idioma.equals("arabic")) {
            System.out.println("Asalaam alaikum");
        }else if (idioma.equals("hindi")) {
            System.out.println( "Namaste");
        }else if (idioma.equals("romanian")) {
            System.out.println( "Buna ziua");
        }
        else {
            System.out.println("No conec el teu idioma, com es diu hola?");
            if (sc.hasNextLine()) {
                String saludo = sc.nextLine();
                System.out.println(saludo);
            }
        }
    }
}
