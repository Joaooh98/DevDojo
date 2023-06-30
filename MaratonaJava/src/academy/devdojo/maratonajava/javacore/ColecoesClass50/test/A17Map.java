package academy.devdojo.maratonajava.javacore.ColecoesClass50.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import academy.devdojo.maratonajava.javacore.ColecoesClass50.domain.Consumer;
import academy.devdojo.maratonajava.javacore.ColecoesClass50.domain.Manga;

public class A17Map {
    public static void main(String[] args) {
        var consumer1 = new Consumer("Joao Carlos de Paiva");
        var consumer2 = new Consumer("Mayety Alves Ferreira de Paiva");

        var manga1 = new Manga(5L, "Hellsing Ultimate", 25);
        var manga2 = new Manga(3L, "Attack on titan", 23);
        var manga3 = new Manga(1L, "Berserk", 21);
        var manga4 = new Manga(2L, "Pokemon", 22);
        var manga5 = new Manga(4L, "Dragon Ball Z", 24);

        List<Manga> mangaConsumerList = List.of(manga2, manga3, manga4);
        Map<Consumer, List<Manga>> consumerManga1Map = new HashMap<>();

        consumerManga1Map.put(consumer1, mangaConsumerList);


        for (Map.Entry<Consumer, List<Manga>> entry: consumerManga1Map.entrySet()) {
            System.out.println("------consumer-----"+entry.getKey().getName());
                for (Manga manga : entry.getValue()) {
                    System.out.println("-----------"+manga.getName());
                }
        }

        System.out.println("\n");

        Map<Consumer, Manga> consumerMangas = new HashMap<>();

        consumerMangas.put(consumer1, manga1);
        consumerMangas.put(consumer2, manga5);

        for (Map.Entry<Consumer, Manga> entry : consumerMangas.entrySet()) {
            System.out.println(entry.getKey().getName() + " - " + entry.getValue().getName());
        }


    }
}
