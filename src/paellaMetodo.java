/*
Paella
Suponiendo que una paellaMetodo se puede cocinar exclusivamente con arroz y gambas (que es mucho suponer),
y que por cada 4 personas se utiliza medio kilo de arroz y un cuarto de kilo de gambas,
escribe un programa que lea el número de comensales, el precio por kilo de arroz y el precio por kilo de kilo gambas,
y muestre las cantidades necesarias y el coste de cada ingrediente, y el coste total de la paellaMetodo.

cada 4 personas 0.5 kilo de arroz 0.25 k de gambas
leer comensales,
leer 1k arroz y
leer 1k gambas

leer:
8
1.5
15

mostrar:
1.0 kg arros
0.5 kg gambes
1.5 euros arros
7.5 euros gambes
TOTAL: 9.0 euros
 */
import java.util.Locale;
import java.util.Scanner;

public class paellaMetodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        //El teu codi aqui
        int personas = sc.nextInt();
        int arroz = sc.nextInt();
        int gambas = sc.nextInt();
    }
}