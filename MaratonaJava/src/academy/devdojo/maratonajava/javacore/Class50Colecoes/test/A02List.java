package academy.devdojo.maratonajava.javacore.Class50Colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class A02List {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>(16);
        nomes.add("Jao");
        nomes.add("May");

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
    }
}
