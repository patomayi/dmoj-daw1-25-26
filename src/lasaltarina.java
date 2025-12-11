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
        int caminarI = 0;
        int caminarD = 0;
        int j = 0;
        //Llenado:
        for(int i = 0; i < longitud; i++){
            camino[i] = sc.nextInt();
        }

        while(camino[j]!=-1){
            if(camino[j]==0){
                caminarI++;
            }else{
                caminarI += camino[j]*2;
            }
        }
        for(int elem : camino) System.out.println(elem);
    }
}