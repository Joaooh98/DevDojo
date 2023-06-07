package academy.devdojo.maratonajava.javacore.ColecoesClass50.test;

import java.util.LinkedList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.ColecoesClass50.domain.Manga;

public class A12SeteHashSet {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();

        mangas.add(new Manga(5L, "Hellsing Ultimate", 25, 0));
        mangas.add(new Manga(3L, "Attack on titan", 23, 5));
        mangas.add(new Manga(1L, "Berserk", 21, 4));
        mangas.add(new Manga(2L, "Pokemon", 22, 2));
        mangas.add(new Manga(4L, "Dragon Ball Z", 24, 1));

        mangas.stream()
                .forEach(e -> System.out.println(e));
            
    }
}
