package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula10EstruturasCondicionaisP03 {
        public static void main(String[] args) {
            try (Scanner t = new Scanner (System.in)) {
                int salario;
                String mensagem;
                int condicao = 5000;

                System.out.println("\nWhat is your salary currently?\n Qual é o seu salário atualmente");
                salario = t.nextInt();
                

                if (salario>condicao) {
                    mensagem = "\nCongratulations you are already a java developer!!\n Parabéns você já é um desenvolvedor java!!";
                } else {
                    mensagem = "\nAnd you need study more!/\n É necessário que você estude mais";
                }
                System.out.println(mensagem);
            }

            // utlizando o operador tenarnario
            // mensagem = salario>condicao? "\nCongratulations you are already a java developer!!\n Parabéns você já é um desenvolvedor java!!": "\nAnd you need study more!/\n É necessário que você estude mais";
    }   
}
 