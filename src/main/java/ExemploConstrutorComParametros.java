import models.Carro;

public class ExemploConstrutorComParametros {
    public static void main(String[] args) {
        Carro fusca = new Carro("Volkswagen", "Fusca", 1970);

        System.out.println(fusca.toString());
    }
}
