/*
Para aprobar el módulo de programación, un alumno debe aprobar las 3 Unidades Formativas.

Para aprobar la UF1, un alumno debe entregar como mínimo el 75% de las solicitudes
prácticas y sacar como mínimo un 4 al examen. También puede aprobar esta UF si entrega el 50% de las prácticas
y saca mínimo un 5 al examen. Finalmente, también aprueba si saca más de un 7 al examen
(independientemente de las prácticas que haya entregado).

Para aprobar la UF2, debe entregar como mínimo el 75% de las prácticas y sacar como mínimo un 4 en el examen.
También puede aprobar si entrega todas las prácticas o si entrega mínimo el 50% de las prácticas y
saca como mínimo un 5 al examen.

Para aprobar la UF3, un alumno debe entregar todas las prácticas y sacar como mínimo un 5 al examen.

uf1 caso1:  pl >= 0.75  ne >= 4
    caso2:  pl >= 0.5  ne >= 5
    caso3:  ne > 7
uf2 caso1:  pl >= 0.75  ne >= 4
    caso2:  pl >= 0.5  ne >= 5
uf3 caso1:  pl >= 1  ne >= 5
 */
import java.util.Locale;
import java.util.Scanner;

public class c1l24aprovarelm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        //El teu codi aqui

        boolean uf1caso = apruebaUF1(sc.nextInt(),sc.nextInt(),sc.nextInt());
        boolean uf2caso = apruebaUF2(sc.nextInt(),sc.nextInt(),sc.nextInt());
        boolean uf3caso = apruebaUF3(sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println(uf1caso&&uf2caso&&uf3caso);
    }
    public static boolean apruebaUF1(int pt,int pl,int ne){
        return (pl / (float) pt >= 0.75f && ne >= 4)||(pl / (float) pt >= 0.5f && ne >= 5)||(ne > 7);
    }
    public static boolean apruebaUF2(int pt,int pl,int ne){
        return (pl / (float) pt>= 0.75f && ne >= 4)||(pl==pt)||(pl / (float) pt >= 0.5f && ne >= 5);
    }
    public static boolean apruebaUF3(int pt,int pl,int ne){
        return (pl==pt && ne >= 5);
    }
}