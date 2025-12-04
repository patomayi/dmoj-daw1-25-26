import java.util.Locale;
import java.util.Scanner;

public class ordenarsecuencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int tam = sc.nextInt();
        int[] array = new int[tam];
        int[] orden = new int[tam];

        for(int i = 0; i < tam; i++){
            array[i] = sc.nextInt();
        }

        for(int j = 0; j < tam; j++){
            //ordenamiento burbuja!!!
            for (int k = 0; k < tam-j-1; k++) {
                if(array[k] > array[k + 1]){
                    int temp =  array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }
        }
        for(int elem : array) System.out.print(elem+" ");
    }
}