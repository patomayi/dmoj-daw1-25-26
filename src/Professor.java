import java.util.*;
public class Professor extends Persona {
    private float sou;
    private final ArrayList<Aula> aules;
    public float getSou(){
        return sou;
    }
    public void setSou(float sou){
        this.sou = sou;
    }
    public llist<Aula> getAules(){
        return Collection.unmodifiableList(this.aules);
    }
    public void assignaAula(Aula a){
        this.aules.add(a);
    }

    public Professor(String nom, String cognoms, int edat, float sou) {
        super(nom,cognoms,edat);
        this.sou = sou;
        this.aules = ArrayList<>();
    }
}
