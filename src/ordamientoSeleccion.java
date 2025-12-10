import java.util.Locale;
import java.util.Scanner;

public class ordamientoSeleccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int t = sc.nextInt();
        int[] A = new int[t];
        //Llenar array
        int i, j, menor, pos, tmp;
        for(int k = 0; k < t; k++){
            A[k] = sc.nextInt();
        }
        //Ordenamiento por Selección:
        for (i = 0; i < t-1; i++) {      // tomamos como menor el primero
            menor = A[i];                  // de los elementos que quedan por ordenar
            pos = i;                       // y guardamos su posición
            for (j = i+1; j < t; j++){   // buscamos en el resto
                if (A[j] < menor) {        // del array algún elemento
                    menor = A[j];          // menor que el actual
                    pos = j;
                }
            }
            if (pos != i){                  // si hay alguno menor se intercambia
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }

        }
        for(int w : A){
            System.out.print(w+" ");
        }
    }
}
