import java.util.Locale;
import java.util.Scanner;

public class alturaminima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int cantidad = sc.nextInt();
        float[] altura = new float[cantidad];
        for (int i = 0; i < cantidad; i++ ){
            float n = sc.nextFloat();
            altura[i] = n;
        }
        float limiteAltura = sc.nextFloat();

        for(float alturaNen : altura){
            if (alturaNen >= limiteAltura){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }

    }
}