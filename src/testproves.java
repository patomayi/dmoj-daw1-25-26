import java.util.Locale;
import java.util.Scanner;

public class testproves{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        mostrarErrorPerPantalla(404,"server not found","unable");
    }
    public static float caluclarPotencia(float base, int exp){
        if(exp == 0) return 1;

        float res = base;
        for(int i = 1; i < exp; i++){
            res *= base;
        }
        return res;
    }
    public static void mostrarErrorPerPantalla(int codi, String nom, String detalls){
        System.out.println("sha produit un error");
        System.out.println(detalls);
    }
}