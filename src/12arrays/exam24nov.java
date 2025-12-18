
import java.util.Locale;
import java.util.Scanner;

public class exam24nov {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        /*Se introduce una secuencia de numeros el primer indice indica la cantidad de numeros
        mientras que luego se introduce una secuenca de numeros creciente,
        decreciente o completamente desordenada, hay que leer los numeros
        e indicar si la secuencia es creciente, decreciente o completamente desordenada.
        hay que recordar que se acaba la secuencia cuando se introduce -1
        * */

        // ===== TU CÓDIGO ORIGINAL (COMENTADO) =====

        int n = sc.nextInt();
        int i = sc.nextInt();

        while (i != -1) {
            if(n > i){
                System.out.println("decreciente");
                n = sc.nextInt();
                i = sc.nextInt();
            } else if (n < i) {
                System.out.println("creciente");
                n = sc.nextInt();
                i = sc.nextInt();
            }else{
                System.out.println("desordenada");
            }
        }

    }
}