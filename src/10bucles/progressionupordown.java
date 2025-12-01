import java.util.Locale;
import java.util.Scanner;

public class progressionupordown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int n = sc.nextInt();
        int i = 0;

        while(i!=-1){
            i = sc.nextInt();
            if(i<n){
                System.out.println("menor");
            } else if (i>n) {
                System.out.println("mayor");
            }
            n=i;
        }

    }
}