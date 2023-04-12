package academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Service;

import academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Domain.Product;
import academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Domain.Tomate;

public class CalculateTax02 {
    
    public static void calcularImposto(Product product){
        System.out.println("Relatori de imposto ");
        double tax = product.calcularImposto();
        System.out.println("Nome do produto: " + product.getName());
        System.out.println("Valor do produto: "+product.getValor());
        System.out.println("Imposto a ser paga do produto: " + tax);

        if (product instanceof Tomate) {
            String dataValidade = ((Tomate)product).getDatadevalidade();
            System.out.println("1º opção de imprimir data de validade: "+dataValidade);
        }

        if (product instanceof Tomate) {
            Tomate tomate = (Tomate) product;
            System.out.println("2º opção de imprimir data de validade: "+tomate.getDatadevalidade());
        }
    }
}
