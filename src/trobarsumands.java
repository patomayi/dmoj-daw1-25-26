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
            for (int j = 0; j < tam; j++){
                int n1 = array[j];
                    for (int k = 0; k < tam; k++){
                         if(n1+array[k] == res){
                            System.out.println(n1+" "+array[k]);
                            break;
                        }
                    }
            }
        }
    }