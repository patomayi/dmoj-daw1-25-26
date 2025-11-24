import java.util.Locale;
import java.util.Scanner;

public class notaciodecimalv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        //El teu codi aqui
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();

        String floatNum1 = num1.replace("'",".");
        String floatNum2 = num2.replace("'",".");

        float fNum1 = Float.parseFloat(floatNum1);
        float fNum2 = Float.parseFloat(floatNum2);
        float suma = fNum1 + fNum2;
        if (suma>0){
            System.out.println("Superior a cero");
        } else if (suma<0) {
            System.out.println("Inferior a cero");
        } else {
            System.out.println("es igual a cero");
        }

    }
}
