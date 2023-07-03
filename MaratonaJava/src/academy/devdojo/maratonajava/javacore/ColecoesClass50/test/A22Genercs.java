package academy.devdojo.maratonajava.javacore.ColecoesClass50.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.ColecoesClass50.domain.Consumer;

public class A22Genercs {
    public static void main(String[] args) {
        // como era feito
        List lista = new ArrayList();

        lista.add("Joao");
        lista.add(123);
        lista.add(new Consumer("Joao Carlos"));

        for (Object o : lista) {
            if (o instanceof String) {
                System.out.println(o);
            }
            if (o instanceof Consumer) {
                System.out.println(o);
            }
            if (o instanceof Integer) {
                System.out.println(o);
            }
        }
        System.out.println(
                "\n Com a atualizacao do java, foi mantido a compatibilidade mais temos agora a opcao de passar o tipo da lista que estamos criado \n"
                        +
                        " type erasure");

        List<String> row = new ArrayList<>();

        row.add("Joao carlos de paiva");
        row.add("Joao carlos");

        row.stream().forEach(e -> System.out.println(e));

        System.out.println("\nexemplo com metodo\n");
        
        add(row, new Consumer("jao"));

        for (Object string : row) {
            System.out.println(string);
        }

    }

    private static void add(List lista, Consumer consumer) {
        lista.add(consumer);
    }
}
