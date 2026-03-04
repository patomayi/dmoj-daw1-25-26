import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class inputmissmatchexcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui

        try{
            int a = sc.nextInt();
            System.out.println(a);
            }
        catch(InputMismatchException error){
            System.out.println("Cal introduïr un nombre enter!");
        }
    }
}