
import java.util.Locale;
import java.util.Scanner;

public class eliminarrepetits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int tam = sc.nextInt();
        String[] array= new String[tam];
        //llenado
        for(int i = 0; i < tam; i++){
            array[i] = sc.next();
        }

        //imprimir solo elementos únicos (primera aparición)
        boolean primero = true;
        for(int i = 0; i < tam; i++){
            boolean repetido = false;
            //verificar si ya apareció antes
            for(int j = 0; j < i; j++){
                if(array[i].equals(array[j])){
                    repetido = true;
                    break;
                }
            }
            //imprimir si no está repetido
            if(!repetido){
                if(!primero){
                    System.out.print(" ");
                }
                System.out.print(array[i]);
                primero = false;
            }
        }
    }
}