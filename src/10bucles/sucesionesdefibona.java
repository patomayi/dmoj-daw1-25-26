import java.util.Locale;
import java.util.Scanner;

public class sucesionesdefibona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int secuencias = sc.nextInt();

        for (int i = 0; i < secuencias; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            boolean esFibo = true;
            //el comparador funciona el error esta en el resto
            while(c != -1){
                if(c != a+b){
                    esFibo = false;
                }
                a = b;
                b = c;
                c = sc.nextInt();
            }

            if(esFibo){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }
        System.out.println();
    }
}