import java.util.Locale;
import java.util.Scanner;

public class delreves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int c = sc.nextInt();
        int[] n = new int[c];
        int contador = c;
        for(int i = 0; i < c; i++){
            int num = sc.nextInt();
            n[i] = num;
        }
        contador--;
        for(int j : n){
            System.out.print(n[contador] + " ");
            contador--;
        }

    }
}