package academy.devdojo.maratonajava.javacore.Class50Colecoes.test;

import java.util.HashMap;
import java.util.Map;

import academy.devdojo.maratonajava.javacore.Class50Colecoes.domain.Consumer;
import academy.devdojo.maratonajava.javacore.Class50Colecoes.domain.Manga;

public class A16Map {
    public static void main(String[] args) {
        var consumer = new Consumer("Joao Carlos de Paiva");
        var consumer2 = new Consumer("Mayety Alves Ferreira de Paiva");

        System.out.println(consumer);
        System.out.println(consumer2);

        var manga1 = new Manga(5L, "Hellsing Ultimate", 25);
        // var manga2 = new Manga(3L, "Attack on titan", 23);
        // var manga3 = new Manga(1L, "Berserk", 21);
        // var manga4 = new Manga(2L, "Pokemon", 22);
        var manga5 = new Manga(4L, "Dragon Ball Z", 24);

        Map<Consumer, Manga> consumerMangas = new HashMap<>();

        consumerMangas.put(consumer, manga1);
        consumerMangas.put(consumer2, manga5);

        for (Map.Entry<Consumer, Manga> entry : consumerMangas.entrySet()) {
            System.out.println(entry.getKey().getName() + " - " + entry.getValue().getName());
        }
    }
}
