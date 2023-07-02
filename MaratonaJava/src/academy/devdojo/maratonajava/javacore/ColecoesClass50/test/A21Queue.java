package academy.devdojo.maratonajava.javacore.ColecoesClass50.test;

import java.util.PriorityQueue;
import java.util.Queue;

import academy.devdojo.maratonajava.javacore.ColecoesClass50.domain.Manga;

public class A21Queue { // 182
    public static void main(String[] args) {
        Queue<Manga> manga = new PriorityQueue<>(new MangaPrecoComparator().reversed()); // com o reversed ele traz o
                                                                                         // resultado por quem te o
                                                                                         // maior preco com base no que
                                                                                         // esta implementado no
                                                                                         // MangaPrecoComparator

        manga.add(new Manga(3L, "Attack on titan", 23, 5));
        manga.add(new Manga(1L, "Berserk", 26, 4));
        manga.add(new Manga(2L, "Pokemon", 22, 2));
        manga.add(new Manga(4L, "Dragon Ball Z", 24, 1));
        manga.add(new Manga(4L, "Dragon Ball Z", 24, 1));
        manga.add(new Manga(5L, "Hellsing Ultimate", 25, 0));

        while (!manga.isEmpty()) {
            System.out.println(manga.poll());
        }
    }
}
