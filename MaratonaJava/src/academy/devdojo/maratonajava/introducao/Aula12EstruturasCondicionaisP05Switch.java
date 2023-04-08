package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula12EstruturasCondicionaisP05Switch {
    public static void main(String[] args) {
        try (// tipos permitido para uso no switch
                // char,  int, byte, short, enum, String
        Scanner t = new Scanner (System.in)) {
            byte dia;   

            System.out.println("digite um numero de 1 a 7 que sera informado um dia da semana");
            dia = t.nextByte();
            
            switch (dia) {
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Segunda");
                    break;
                case 3:
                    System.out.println("Terça");
                    break;
                case 4:
                    System.out.println("Quarta");
                    break;
                case 5:
                    System.out.println("Quinta");
                    break;
                case 6:
                    System.out.println("Sexta");
                    break;
                case 7:
                    System.out.println("Sabado");
                    break;
                      default:
                      System.out.println("Opção invalida digite um numero de 1 a 7");
                    break;
            }
        }
    }
}
