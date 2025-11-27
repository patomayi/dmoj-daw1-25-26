import java.util.Locale;
import java.util.Scanner;

public class elultimoquesume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int c = sc.nextInt();
        int[] n = new int[c];

        for(int i = 0; i < c; i++){
            int num = sc.nextInt();
            n[i] = num;
        }
        for(int j : n){
            System.out.print(j+n[c-1]+" ");
        }
    }
}