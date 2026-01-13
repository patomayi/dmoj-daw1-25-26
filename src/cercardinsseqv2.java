import java.util.Locale;
import java.util.Scanner;
//**************************************//
//        pregunta de examen            //
//          de arrays                   //
// Buscar dentro de la secuencia (v2)   //
//**************************************//
public class cercardinsseqv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        
        int tam = sc.nextInt();
        String[] array = new String[tam];

        for (int i = 0; i < tam; i++) {
            array[i] = sc.next();
        }
        sc.nextLine();
        String palabra = sc.nextLine();
        for (int i = 0; i < tam; i++) {
            int contador = 0;
            for (int j = 0; j < palabra.length(); j++) {
                if (palabra.charAt(j) == array[i].charAt(0)){
                    contador++;
                }
            }
            System.out.println(array[i]+" "+contador);
        }
    }
}
