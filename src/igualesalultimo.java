import java.util.Locale;
import java.util.Scanner;

public class igualesalultimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int c = sc.nextInt();
        int[] n = new int[c];
        int contador = 0;
        for(int i = 0; i < c; i++){
            int num = sc.nextInt();
            n[i] = num;
        }
        c--;
        for(int j : n){
            if(j == n[c]){
                contador++;
            }
        }
        contador--;
        System.out.println(contador);
    }
}
