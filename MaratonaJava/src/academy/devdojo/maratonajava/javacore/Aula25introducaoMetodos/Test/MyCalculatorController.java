package academy.devdojo.maratonajava.javacore.Aula25introducaoMetodos.Test;

import java.util.Scanner;

import academy.devdojo.maratonajava.javacore.Aula25introducaoMetodos.Dominio.MyCalculator;

public class MyCalculatorController {
    public static void main(String[] args) {
        var calc = new MyCalculator();
        try (Scanner t = new Scanner(System.in)) {
            System.out.println("você quer executar calculo raiz ou o PI de algum numero");
            String d = t.next();
            if (d.equalsIgnoreCase("sim")) {
                System.out.println("digite um numero:");
                double num = t.nextDouble();
                System.out.println("valor de PI do numero informado:");
                calc.pi(num);
                System.out.println("valor da Raiz do numero informado:");
                calc.squareRoot(num);
                    } else {
                            System.out.println("digite um numero:");
                            double num1 = t.nextDouble();
                            System.out.println("digite outro numero:");
                            double num2 = t.nextDouble();
                            calc.add(num1, num2);
                            calc.toDecrease(num1, num2);
                            calc.multiply(num1, num2);
                            calc.power(num1, num2);
                            calc.division(num1, num2);
                            calc.percentage(num1, num2);
            }
        }
    }
}
