package academy.devdojo.maratonajava.javacore.Class30Association.test;

import java.util.Scanner;

public class KeyboardReading05 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("digite seu nome abaixo");
            String Name = input.nextLine();

            System.out.println("Digite a sua idade");
            int idade = input.nextInt();

            System.out.println("Qual o seu genero? ");
            char sexo = input.next().charAt(0);

                if(sexo == 'M' || sexo == 'm') {
                    System.out.println("Nome: " + Name + "\n idade: " + idade + "\n com o genero MACULINO");
                } else if 
                    (sexo == 'F' || sexo == 'f') {
                     System.out.println("Nome: " + Name + "\n idade: " + idade + "\n com o genero FEMININO");
                } else {
                     System.out.println("infome um genero que seja masculino ou feminino");
            }
        }
    }
}