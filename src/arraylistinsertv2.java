import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class arraylistinsertv2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        List<Integer> llista = new ArrayList<>();
        //posibles preguntas de examen escoger entre ArrayList o LinkedList

        while(true){
            int num = sc.nextByte();
            if(num == -1)break;
            int pos = sc.nextInt();
            if(pos>0){

            }
        }
    }
}
