package academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Domain;

public class Tomate extends Product {
    public static final double IMPOSTO_POR_CENTO = 0.21;
    public Tomate(String name, double valor) {
        super(name, valor);
    }
    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
