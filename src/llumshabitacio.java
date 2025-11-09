import java.util.Scanner;

class Llums {
    private boolean llum1;
    private boolean llum2;
    private boolean llum3;

    // Constructor
    public Llums(boolean llum1, boolean llum2, boolean llum3) {
        this.llum1 = llum1;
        this.llum2 = llum2;
        this.llum3 = llum3;
    }

    // Mètode que retorna el nombre de llums enceses
    public int comptarLlumsEnceses() {
        int comptador = 0;
        if (llum1) comptador++;
        if (llum2) comptador++;
        if (llum3) comptador++;
        return comptador;
    }
}

public class llumshabitacio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Llegim tres booleans separats per espai
        boolean l1 = sc.nextBoolean();
        boolean l2 = sc.nextBoolean();
        boolean l3 = sc.nextBoolean();

        Llums habitacio = new Llums(l1, l2, l3);
        int enceses = habitacio.comptarLlumsEnceses();

        // Output Format
        if (enceses == 0) {
            System.out.println("No s'ha encès cap llum.");
        } else if (enceses == 1) {
            System.out.println("Només hi ha un llum encès.");
        } else if (enceses == 2) {
            System.out.println("S'han encès dues llums.");
        } else {
            System.out.println("S'han encès totes les llums.");
        }
    }
}
