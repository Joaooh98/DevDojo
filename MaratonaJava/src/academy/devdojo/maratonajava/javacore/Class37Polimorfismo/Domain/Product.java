package academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Domain;

public abstract class Product implements Taxable {
    protected String name;
    protected double valor;
    
    public Product(String name, double valor) {
        this.name = name;
        this.valor = valor;
    }

    public String getName() {
        return name;
    }

    public double getValor() {
        return valor;
    }
    
    
}
