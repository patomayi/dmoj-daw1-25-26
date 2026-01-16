import java.util.Locale;
import java.util.Scanner;

public class longitudmultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int tam1 = sc.nextInt();
        String[] palabras = new String[tam1];
        for (int i = 0; i < tam1; i++) {
            palabras[i]=sc.next();
        }
        int tam2 = sc.nextInt();
        for (int i = 0; i < tam2; i++) {
            int numero = sc.nextInt();
            if(palabras[i].length()%numero==0){
                System.out.print(palabras[i].toUpperCase()+" ");
            }else System.out.print(palabras[i].toLowerCase()+" ");
        }
    }
}