import java.util.Locale;
import java.util.Scanner;

public class c2lo2preudelfer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        float distancia = sc.nextFloat();
        int destino = sc.nextInt();

        double precioPorKilometro = 0.35;
        double descuento = 0.30;

        double precio = distancia * precioPorKilometro;

        if (destino > 7 && distancia > 800) {
            precio -= precio * descuento;
            precio = Math.round(precio * 1000.0) / 1000.0;
            System.out.println(precio);
        }
        else {
            precio = Math.round(precio * 1000.0) / 1000.0;
            System.out.println(precio);
        }
    }
}