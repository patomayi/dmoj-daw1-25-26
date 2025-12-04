import java.util.Locale;
import java.util.Scanner;

public class eliminarrepetits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int tam = sc.nextInt();
        String[] array = new String[tam];

        for(int i = 0; i < tam; i++){
            array[i] = sc.next();
        }
        for(int j = 0; j < tam; j++){
            for(int k = 0; k < tam; k++){

                boolean saber = true;
                if(!array[k].equals(array[j])){
                    System.out.print(array[k]+" ");
                }
            }
        }
    }
}