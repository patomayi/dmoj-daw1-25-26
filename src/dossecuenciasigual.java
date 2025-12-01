import java.util.Locale;
import java.util.Scanner;

public class dossecuenciasigual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int n = sc.nextInt();
        int[] sec1 = new int[n];
        for(int i = 0; i < n; i++) {
            sec1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] sec2 = new int[m];
        for(int j = 0; j < m; j++){
            sec2[j] = sc.nextInt();
        }
        if(n == m){
            System.out.println(sec1 == sec2);
        }else{
            System.out.println(false);
        }
    }
}