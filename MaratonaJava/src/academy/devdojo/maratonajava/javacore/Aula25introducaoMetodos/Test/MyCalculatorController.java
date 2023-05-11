package academy.devdojo.maratonajava.javacore.Aula25introducaoMetodos.Test;

import java.util.Scanner;

import academy.devdojo.maratonajava.javacore.Aula25introducaoMetodos.Dominio.MyCalculator;

public class MyCalculatorController {
    public static void main(String[] args) {
        var calc = new MyCalculator();
        try (Scanner t = new Scanner(System.in)) {
            System.out.println("digite um numero:");
            double num1 = t.nextDouble();
            System.out.println("digite outro numero:");
            double num2 = t.nextDouble();
            calc.somar(num1, num2);
            System.out.println(calc.getResultado());
        }
    }
}
