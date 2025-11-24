    import java.util.Locale;
    import java.util.Scanner;

    public class fizzbuzzfor {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            sc.useLocale(Locale.ENGLISH);

            //El teu codi aqui
            int a = sc.nextInt();
            int b = sc.nextInt();
    //revisar como invertir la cadena
            for (int i = a; i >= b; i--){
                if (i % 3 == 0 && i % 5 == 0){
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0){
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
    }