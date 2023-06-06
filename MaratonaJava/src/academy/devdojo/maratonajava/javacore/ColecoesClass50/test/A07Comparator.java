package academy.devdojo.maratonajava.javacore.ColecoesClass50.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import academy.devdojo.maratonajava.javacore.ColecoesClass50.domain.Manga;

class MangasById implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }

}

public class A07Comparator {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(5L, "Hellsing Ultimate", 25));
        mangas.add(new Manga(3L, "Attack on titan", 23));
        mangas.add(new Manga(1L, "Berserk", 21));
        mangas.add(new Manga(2L, "Pokemon", 22));
        mangas.add(new Manga(4L, "Dragon Ball Z", 24));

        mangas.stream()
                .forEach(e -> System.out.println(e));

        Collections.sort(mangas, new MangasById());
        System.out.println("-----------------------------");

        mangas.stream()
                .forEach(e -> System.out.println(e));
    }
}
