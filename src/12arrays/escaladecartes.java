import java.util.Locale;
import java.util.Scanner;

public class escaladecartes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int tam = sc.nextInt();
        int[] array = new int[tam];
        int elemento = tam / 2;

        //Llenar array
        for(int i = 0; i < tam; i++){
            array[i] = sc.nextInt();
        }
        //Insertion Sort, ordenamiento sencillo:
        for (int i = 1; i < tam; i++) {
            int actual = array[i];
            int j = i - 1;
            // Mover elementos menores que actual hacia la derecha
            //array[j] < actual: descendente se mueven hacia la derecha
            //array[j] > actual: ascendente se mueven hacia la izquierda
            while (j >= 0 && array[j] < actual) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = actual;
        }

        //Imprimir numeros en orden:
        for(int k = 0; k < tam; k++){
            System.out.print(array[k]+" ");
        }

        System.out.println();//Salto de linea obligatorio
        System.out.println("La carta més gran és: "+ array[0]);
        System.out.println("La carta més petita és: "+ array[tam-1]);
        System.out.println("La carta del mig és: "+ array[elemento]);
        
        // Verificar si es escala
        boolean esEscala = (array[0] - array[tam - 1]) == (tam - 1);
        System.out.println("Es tracta d'una escala: " + (esEscala ? "SI" : "NO"));

    }
}