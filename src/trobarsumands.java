    import java.util.Locale;
    import java.util.Scanner;


    public class trobarsumands {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            sc.useLocale(Locale.ENGLISH);

            //El teu codi aqui
            int res = sc.nextInt();
            int tam = sc.nextInt();
            int[] array = new int[tam];

            for (int i = 0; i < tam; i++){
                array[i] = sc.nextInt();
            }
            boolean encontrado = false;
            for (int j = 0; j < tam; j++){
                int n1 = array[j];
                for (int k = j + 1; k < tam; k++){  // Empezar desde j+1 para evitar repeticiones
                    if(n1+array[k] == res){
                        System.out.println(n1+" "+array[k]);
                        encontrado = true;
                        break;
                    }
                }
                if(encontrado){
                    break;
                }
            }
            if(!encontrado){
                System.out.println("-1 -1");
            }
        }
    }