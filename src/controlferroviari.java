import java.util.Locale;
import java.util.Scanner;

public class controlferroviari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);


        String semafor = sc.nextLine();
        boolean estado = sc.nextBoolean();
        int control = sc.nextInt();

        // Anidamos las condiciones
        if (semafor.equals("verd") || semafor.equals("àmbar") || semafor.equals("ambar")) {
            if (!estado) {
                if (control == 0) {

                    System.out.println("Estat del semàfor (vermell, ambar, verd):");
                    System.out.println("Fre d'emergència? (true, false):");
                    System.out.println("Ordres del centre de control (0, 1, 2):");
                    System.out.println("El tren pot continuar");
                } else {
                    System.out.println("Estat del semàfor (vermell, ambar, verd):");
                    System.out.println("Fre d'emergència? (true, false):");
                    System.out.println("Ordres del centre de control (0, 1, 2):");
                    System.out.println("El tren s'ha d'aturar!!");
                }
            } else {
                System.out.println("Estat del semàfor (vermell, ambar, verd):");
                System.out.println("Fre d'emergència? (true, false):");
                System.out.println("Ordres del centre de control (0, 1, 2):");
                System.out.println("El tren s'ha d'aturar!!");
            }
        } else {
            System.out.println("Estat del semàfor (vermell, ambar, verd):");
            System.out.println("Fre d'emergència? (true, false):");
            System.out.println("Ordres del centre de control (0, 1, 2):");
            System.out.println("El tren s'ha d'aturar!!");
        }
    }
}
