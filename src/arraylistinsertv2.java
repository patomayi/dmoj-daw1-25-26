import java.util.*;

public class arraylistinsertv2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        List<Integer> llista = new LinkedList<>();
        //posibles preguntas de examen escoger entre ArrayList o LinkedList

        while(true){
            int num = sc.nextByte();
            if(num == -1)break;

            int pos = sc.nextInt();
            if(pos>0) llista.addLast(num);//llista.add(num)
            else llista.addFirst(num);//llista.add(0,num)
        }
        llista.stream().forEach(Integer x -> System.out.print(x+" "));
    }
}
