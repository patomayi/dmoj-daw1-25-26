import java.util.Locale;
import java.util.Scanner;

public class reaccioencadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        int[] alcances = new int[n];
        
        for (int i = 0; i < n; i++) {
            alcances[i] = sc.nextInt();
        }
        
        // La bomba 0 siempre explota
        int alcanceMaximo = alcances[0];
        int ultimaBomba = 0;
        
        // Recorremos todas las bombas para ver cuáles explotan
        for (int i = 1; i < n; i++) {
            if (i <= alcanceMaximo) {
                ultimaBomba = i;
                alcanceMaximo = Math.max(alcanceMaximo, i + alcances[i]);
            }
        }
        
        System.out.println(ultimaBomba);
    }
}