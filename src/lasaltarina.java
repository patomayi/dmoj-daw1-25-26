import java.util.Locale;
import java.util.Scanner;

public class lasaltarina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int longitud = sc.nextInt();
        int energia = sc.nextInt();
        int[] camino = new int[longitud];
        int pasosI = 0;
        int pasosD = 0;
        int energiaI = 0;
        int energiaD = 0;

        //Llenado:
        for(int i = 0; i < longitud; i++){
            camino[i] = sc.nextInt();
        }

        for(int j = 0; j <longitud / 2; j++){
            if (camino[j] == -1){
                pasosI++;
                break;
            }else if (camino[j] > 0){
                energiaI+=camino[j]*2;
            }
            pasosI++;
        }

        for(int k = longitud-1; k >= (longitud / 2)+1; k--){
            if (camino[k] == -1){
                pasosD++;
                break;
            }else if (camino[k] > 0){
                energiaD+=camino[k]*2;
            }
            pasosD++;
        }
        System.out.println("Pel cantó dret, s'arriba al tresor en "+ pasosD +" passos consumint "+energiaD+" unitats d'energia.");
        System.out.println("Pel cantó esquerra, s'arriba al tresor en "+ pasosI +" passos consumint "+energiaI+" unitats d'energia.");
    }
}