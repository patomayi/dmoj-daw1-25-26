import java.util.Locale;
import java.util.Scanner;

public class piedrapapeltijera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String linea;
        int puntosJugador1 = 0;
        int puntosJugador2 = 0;

        while (true) {
            linea = sc.nextLine();

            if (linea.equals("END")) {
                break;
            }
            char jugador1 = linea.charAt(0);
            char jugador2 = linea.charAt(1);
            if (jugador1 == '@') {
                if (jugador2 == '%') {
                    puntosJugador1++;
                } else if (jugador2 == '#') {
                    puntosJugador2++;
                }
            }

            else if (jugador1 == '#') {
                if (jugador2 == '@') {
                    puntosJugador1++;
                } else if (jugador2 == '%') {
                    puntosJugador2++;
                }
            }
            else if (jugador1 == '%') {
                if (jugador2 == '#') {
                    puntosJugador1++;
                } else if (jugador2 == '@') {
                    puntosJugador2++;
                }
            }
        }
        if (puntosJugador1 > puntosJugador2) {
            System.out.println("1");
        } else if (puntosJugador2 > puntosJugador1) {
            System.out.println("2");
        } else {
            System.out.println("-");
        }
    }
}