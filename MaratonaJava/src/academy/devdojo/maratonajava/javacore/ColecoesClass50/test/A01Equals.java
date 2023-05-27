package academy.devdojo.maratonajava.javacore.ColecoesClass50.test;

import academy.devdojo.maratonajava.javacore.ColecoesClass50.domain.A00Smartphone;

public class A01Equals {
    public static void main(String[] args) {
        // modos de realizar comparação do valor armazenado 
        String nome = "Joao Carlos de Paiva";
        String nomeOb =  new String("Joao Carlos de Paiva");
        System.out.println(nome.equals(nomeOb));

        // utilizando o a clase criada, para fazer comparação de string 
        var s1 = new A00Smartphone("1ABC1", "IPHONE");
        var s2 = new A00Smartphone("1ABC1", "IPHONE");
        
        System.out.println(s1.equals(s2));

        
        // forma errada de realizar comparação de string
        String nome0 = "Joao Carlos de Paiva";
        String nome1 = new String("Joao Carlos de Paiva");
        System.out.println(nome0 == nome1);

    }
}
