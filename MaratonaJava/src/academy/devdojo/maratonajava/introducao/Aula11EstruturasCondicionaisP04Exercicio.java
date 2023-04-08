package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula11EstruturasCondicionaisP04Exercicio {
    public static void main(String[] args) {
        try (Scanner t = new Scanner (System.in)) {
            double salariomensal;
            double salarioAnual;
            double primeirafaixa = 9.70/100;
            double segundafaixa = 37.35/100;
            double terceirafaixa = 49.50/100;
            double valorimposto;
            float salarioPfaixa = 34712;
            float salarioSfaixa = 34713;
            float salarioTfaixa = 68507;

            System.out.println("What is your salary currently?\n Qual é o seu salário atualmente?");
            salariomensal = t.nextFloat();
            salarioAnual = salariomensal*12;

            if (salarioAnual<=salarioPfaixa) {
                valorimposto = salarioAnual *primeirafaixa;
            } else if (salarioAnual >= salarioSfaixa && salarioAnual <= salarioTfaixa) {
                valorimposto = salarioAnual * segundafaixa;
            } else {
                valorimposto = salarioAnual * terceirafaixa;
            }
            System.out.println(valorimposto);
        }         
     }
}
