package academy.devdojo.maratonajava.javacore.Class50Colecoes.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Class50Colecoes.domain.Manga;

public class A11Iterator {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();

        mangas.add(new Manga(5L, "Hellsing Ultimate", 25, 0));
        mangas.add(new Manga(3L, "Attack on titan", 23, 5));
        mangas.add(new Manga(1L, "Berserk", 21, 4));
        mangas.add(new Manga(2L, "Pokemon", 22, 2));
        mangas.add(new Manga(4L, "Dragon Ball Z", 24, 1));

        Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()) {
            if (mangaIterator.next().getQuantidade() == 0) {
                mangaIterator.remove();
            }
        }
        System.out.println(mangas);

        System.out.println("\n--------------------\n");
        mangas.removeIf(man -> man.getQuantidade() == 0);
        System.out.println(mangas);
        /////////////////////////////////////////////////////////////////////////////////////////

        List<Manga> mangasLinked = new LinkedList<>(); // possui uma performace melhor para remover elemento do array

        mangasLinked.add(new Manga(5L, "Hellsing Ultimate", 25, 0));
        mangasLinked.add(new Manga(3L, "Attack on titan", 23, 5));
        mangasLinked.add(new Manga(1L, "Berserk", 21, 4));
        mangasLinked.add(new Manga(2L, "Pokemon", 22, 2));
        mangasLinked.add(new Manga(4L, "Dragon Ball Z", 24, 1));

        mangasLinked.stream()
                .forEach(e -> System.out.println(e));
    }
}
