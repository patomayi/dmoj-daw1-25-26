import java.util.Locale;
import java.util.Scanner;

public class mutiplicaciov2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        //El teu codi aqui
        String multiplicacion = sc.nextLine();

        int posX = multiplicacion.indexOf("x");
        String num1 = multiplicacion.substring(0,posX);
        String num2 = multiplicacion.substring(posX+1);

        float fnum1 = Float.parseFloat(num1);
        float fnum2 = Float.parseFloat(num2);

        float res = fnum1 * fnum2;
        System.out.println(res);
        if (fnum1>=0 && fnum2>=0){
            System.out.println("+ * + = +");
        } else if (fnum1<0 && fnum2<0) {
            System.out.println("- * - = +");
        } else if (fnum1>=0 && fnum2<0) {
            System.out.println(" + * - = -");
        }else {
            System.out.println("- * + = -");
        }

    }
}

