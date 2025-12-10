import java.util.Locale;
import java.util.Scanner;

public class endrecareliminarrepe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int tam = sc.nextInt();
        int[] array = new int[tam];

        //Llenar array
        for(int i = 0; i < tam; i++){
            array[i] = sc.nextInt();
        }

        for(int j = 0; j < tam; j++) {
            //ordenamiento burbuja!!!
            for (int k = 0; k < tam - j - 1; k++) {
                if (array[k] > array[k + 1]) {
                    int temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }
        }
        boolean primero = true;
        for(int l = 0; l < tam; l++){
            boolean repetido = false;
            //verificar si ya apareció antes
            for(int m = 0; m < l; m++){
                if(array[l] == array[m]){
                    repetido = true;
                    break;
                }
            }
            //imprimir si no está repetido
            if(!repetido){
                if(!primero){
                    System.out.print(" ");
                }
                System.out.print(array[l]);
                primero = false;
            }
        }
    }

}