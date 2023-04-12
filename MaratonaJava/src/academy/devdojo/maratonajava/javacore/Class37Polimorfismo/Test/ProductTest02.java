package academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Test;

import academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Domain.Computer;
import academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Domain.Tomate;
import academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Service.CalculateTax02;

public class ProductTest02 {
    public static void main(String[] args) {
        Computer computer = new Computer("Dell g15", 7000);
        Tomate tomate = new Tomate("Tomate Carmem", 20);
        
        CalculateTax02.calcularImposto(computer);
        System.out.println("----------------------------");
        CalculateTax02.calcularImposto(tomate);
    }
}