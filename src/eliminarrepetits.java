
import java.util.Locale;
import java.util.Scanner;

public class eliminarrepetits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //POSIBLE ERROR NO IMPRIME EL PRIMERO

        int tam = sc.nextInt();
        String[] array= new String[tam];
        //llenado
        for(int i = 0; i < tam; i++){
            array[i] = sc.next();
        }
        //comparar
        for(int j = 0; j < tam - 1; j++){
            if(!array[j].equals(array[j+1])) {
                System.out.print(array[j+1] + " ");
            }
        }
//        if (tam > 0) {
//            System.out.print(array[tam - 1]);
//        }
    }
}