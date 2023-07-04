package academy.devdojo.maratonajava.javacore.Class50Colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class A03List {
    public static void main(String[] args) {
        List<String> nomes0 = new ArrayList<>(16);

        List<String> nomes = new ArrayList<>(16);
        
        nomes.add("Jao");
        nomes.add("May");
        nomes.remove(0); // assim ele retira da lista o primeiro index
        nomes.remove("Jao");
        
        nomes.add("Jao");
        System.out.println(nomes.remove("jao")); // retorna um booleano devido utilizar o equals para combarar deve ser passado o valor conforme esta declarado.
        System.out.println(nomes.remove("Jao"));
        nomes.add("Jao");

        // adionando todos os valors de uma lista em outra 
        // nomes0.addAll(nomes);

        System.out.println("\n utilizando foreach");

        for (String name : nomes) {
            System.out.println(name);
        }

        System.out.println("\n utilizando for");

        nomes.add("Joao");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println("\n utilizando stream");
        
        nomes.add("Mayety");
        nomes.stream()
                .forEach(e -> System.out.println(e));
        
                nomes0.addAll(nomes);
                System.out.println("\n nomes0.addAll(nomes);");
        nomes0.stream()
                .forEach(e-> System.out.println(e));
    }
}
