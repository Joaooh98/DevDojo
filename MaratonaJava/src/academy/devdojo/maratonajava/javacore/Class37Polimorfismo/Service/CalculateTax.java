package academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Service;

import academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Domain.Computer;
import academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Domain.Tomate;

public class CalculateTax {
    public static void CalculateTaxComputer(Computer Computer) {
        
        System.out.println("Relatorio do imposto do computador(computer tax report)");
        double tax = Computer.calcularImposto();
        System.out.println("Nome computador : " + Computer.getName());
        System.out.println("Valor do computador(computer value): " + Computer.getValor());
        System.out.println("imposto a ser pago(Tax to be paid): " + tax);

     }

    public static void CalculateTaxComputer(Tomate tomate) {
     System.out.println("Relatorio do imposto do computador(computer tax report)");
        double tax = tomate.calcularImposto();
        System.out.println("Nome tomate: " + tomate.getName());
        System.out.println("Valor do tomate(tomate value): " + tomate.getValor());
        System.out.println("imposto a ser pago(Tax to be paid): " + tax);
    }
}
