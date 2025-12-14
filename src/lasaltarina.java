import java.util.Locale;
import java.util.Scanner;

public class lasaltarina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        //FALTA ACABAR
        //CASO 7:
        //27 20
        //2 1 3 0 2 9 0 0 0 1 0 0 2 0 1 -1 0 0 0 0 2 0 2 0 3 3 3
        //Pel cantó dret, no es pot arribar al tresor perquè s'acaba l'energia.
        //Pel cantó esquerra, no es pot arribar al tresor perquè s'acaba l'energia.
        //El teu codi aqui
        int longitud = sc.nextInt();
        int energia = sc.nextInt();
        int[] camino = new int[longitud];
        int pasosI = 0;
        int pasosD = 0;
        int energiaI = 0;
        int energiaD = 0;
        boolean banderaI = false;
        boolean banderaD = false;

        //Llenado:
        for(int i = 0; i < longitud; i++){
            camino[i] = sc.nextInt();
        }
        //Izquierda:
        for(int j = 0; j < longitud; j++){
            if(camino[j]==4) {
                banderaI = true;
                break;
            }else if (camino[j] == -1){
                pasosI++;
                break;
            }else if (camino[j] > 0){
                energiaI+=camino[j]*2;
            }
            pasosI++;
        }
        //Derecha:
        for(int k = longitud-1; k >= 0; k--){
            if(camino[k] == 4) {
                banderaD = true;
                break;
            }else if (camino[k] == -1){
                pasosD++;
                break;
            }else if (camino[k] > 0){
                energiaD+=camino[k]*2;
            }
            pasosD++;
        }

        if (energiaD>energia){
            System.out.println("Pel cantó dret, no es pot arribar al tresor perquè s'acaba l'energia.");
        }else if(banderaD){
            System.out.println("Pel cantó dret, no es pot arribar al tresor perquè hi ha un forat massa gran.");
        }else{
            System.out.println("Pel cantó dret, s'arriba al tresor en "+ pasosD +" passos consumint "+energiaD+" unitats d'energia.");
        }
        if(energiaI>energia){
            System.out.println("Pel cantó esquerra, no es pot arribar al tresor perquè s'acaba l'energia.");
        }else  if (banderaI){
            System.out.println("Pel cantó esquerra, no es pot arribar al tresor perquè hi ha un forat massa gran.");
        }else {
            System.out.println("Pel cantó esquerra, s'arriba al tresor en "+ pasosI +" passos consumint "+energiaI+" unitats d'energia.");
        }


    }
}