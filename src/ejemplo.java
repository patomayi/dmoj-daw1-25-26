public class ejemplo {
    public static void main(String[] args){
        Aula a = new Aula(1, "Torvalds", "Planta baixa");
        Professor p = new Professor("Fer","Porrino",38,43000);

        p.assignaAula(a);
        System.out.println(p.getAules().get(0).geNom());
        p.getAules().add(a);
    }
}
