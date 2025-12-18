import java.util.Locale;
import java.util.Scanner;

public class examen15_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        //inicializar y llenar array1
        int tam1 = sc.nextInt();
        int[] array1 = new int[tam1];
        for (int i = 0; i < tam1; i++) {
            array1[i] = sc.nextInt();
        }
        //inicializar y llenar array2
        int tam2 = sc.nextInt();
        int[] array2 = new int[tam2];
        for (int j = 0; j < tam2; j++) {
            array2[j] = sc.nextInt();
        }

        boolean bandera = false;
        for (int i = 0; i < tam1; i++) {
            int contador = 0;
            for (int j = 0; j <tam2; j++) {
                if (array1[i] == array2[j]){
                    bandera = true;
                    contador++;
                }
            }
            if(bandera && contador > 0)//condicion para hacer que no se imprima si no encuentra ninguna ocurrencia igual
                System.out.println(array1[i]+" "+contador);
        }
    }
}
