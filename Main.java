import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Massa> massas = new ArrayList<>();
        massas.add(new Pizza("Marguerita", "Grande", 39.9f, "Catupiry"));
        massas.add(new Pizza("Calabresa", "Média", 29.9f, "Catupiry"));
        massas.add(new Macarronada("Carbonara", "Grande", 37.9f, "Penne"));
        massas.add(new Macarronada("Bolonhesa", "Média", 45.9f, "Penne"));
        massas.add(new Lasanha("Quatro Queijos", "Grande", 79.9f));
        massas.add(new Lasanha("Bolonhesa", "Média", 69.9f));

        System.out.println("CARDÁPIO");
        for (Massa massa: massas) {
            // Se a massa atual for uma pizza
            // For uma instância de Pizza
            if(massa instanceof Pizza) {
                System.out.println("PIZZAS");
            } else if (massa instanceof Macarronada) {
                System.out.println("MACARRONADAS");
            } else {
                System.out.println("LASANHAS");
            }
            System.out.println(massa.getSabor());
            System.out.println(massa.getTamanho());
            System.out.println(massa.getPreco());
            System.out.println();
        }
        System.out.println("----------------------");
    }
}