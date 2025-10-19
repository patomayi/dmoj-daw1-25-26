import java.util.Locale;
import java.util.Scanner;

public class arxiusdecodifont {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        String file1 = scan.next();
        String file2 = scan.next();
        String file3 = scan.nextLine();

        String file4 = scan.next();
        String file5 = scan.next();
        String file6 = scan.nextLine();

        String file7 = scan.next();
        String file8 = scan.next();
        String file9 = scan.nextLine();

        String file10 = scan.next();
        String file11 = scan.next();
        String file12 = scan.nextLine();

        System.out.println(file11+" "+file12+" "+file10);
        System.out.println(file8+" "+file9+" "+file7);
        System.out.println(file5+" "+file6+" "+file4);
        System.out.println(file2+" "+file3+" "+file1);
    }
}