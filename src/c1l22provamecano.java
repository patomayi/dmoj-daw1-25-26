    import java.util.Locale;
    import java.util.Scanner;

    public class c1l22provamecano {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            sc.useLocale(Locale.ENGLISH);
            //El teu codi aqui
            int caracter = sc.nextInt();
            int error = sc.nextInt();
            int tiempo = sc.nextInt();

            float erroresTotales = 100-((error * 100f) /caracter);
            int porcentaje = (int)erroresTotales;
            float ppm = ((caracter / 5f) * 60) /tiempo;
            int nuevoPPM = (int)ppm;;

            System.out.println(porcentaje);
            System.out.println(nuevoPPM);
        }
    }
