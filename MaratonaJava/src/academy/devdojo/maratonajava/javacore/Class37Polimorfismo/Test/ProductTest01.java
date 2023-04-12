package academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Test;

import academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Domain.Computer;
import academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Domain.Tomate;
import academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Service.CalculateTax;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("Dell g15", 7000);
        Tomate tomate = new Tomate("Tomate Carmem", 20);
        
        CalculateTax.CalculateTaxComputer(computer);
        System.out.println("----------------------------");
        CalculateTax.CalculateTaxComputer(tomate);
    }
}
