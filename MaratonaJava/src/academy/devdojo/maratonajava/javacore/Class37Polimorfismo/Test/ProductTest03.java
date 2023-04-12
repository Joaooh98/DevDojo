package academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Test;

import academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Domain.Computer;
import academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Domain.Product;
import academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Domain.Tomate;
import academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Service.CalculateTax02;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product = new Computer("Dell g15 ", 3000);
        
        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDatadevalidade("30-04-2023");

        CalculateTax02.calcularImposto(tomate);
        System.out.println("---------------------------");
        CalculateTax02.calcularImposto(product);
    }
}
