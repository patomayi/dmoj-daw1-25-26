import java.util.Locale;
import java.util.Scanner;

public class e9bedgeneradordec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        while(num1!=0 && num2!=0){
            if(num1<num2){
                num1 = sc.nextInt();
                if(num1<num2){
                    num2 = sc.nextInt();
                    continue;
                }
            }else{
                System.out.println("INCORRECTE");
                break;
            }

        }
        if(num1 == 0 || num2 == 0) {
            System.out.println("CORRECTE");
        }
    }
}