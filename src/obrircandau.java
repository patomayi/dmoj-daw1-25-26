import java.util.Locale;
import java.util.Scanner;

public class obrircandau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int clave = sc.nextInt();
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int numero3 = sc.nextInt();
        int op = 0;

        while(numero3!=-1){
            op = (numero1 + numero2) * numero3;
            if(op == clave){
                System.out.println("true");
                break;
            }
            numero1 = numero2;
            numero2 = numero3;
            numero3 = sc.nextInt();
        }
        if(op != clave) {
         System.out.println("false");
        }
    }
}