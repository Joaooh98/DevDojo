package academy.devdojo.maratonajava.javacore.Class50Colecoes.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import academy.devdojo.maratonajava.javacore.Class50Colecoes.domain.Manga;

public class A12SeteHashSet {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();

        // Vai ser organizado pelo hash.
        // Nao e possivel bscar pelo indice porque o set nao e indexado
        // vai ser levado em cosideracao com base no hash code criado no objeto

        mangas.add(new Manga(5L, "Hellsing Ultimate", 25, 0));
        mangas.add(new Manga(3L, "Attack on titan", 23, 5));
        mangas.add(new Manga(1L, "Berserk", 21, 4));
        mangas.add(new Manga(2L, "Pokemon", 22, 2));
        mangas.add(new Manga(4L, "Dragon Ball Z", 24, 1));
        mangas.add(new Manga(4L, "Dragon Ball Z", 24, 1)); /// nao e exibido o elemento dublicado devido a equals
                                                           /// inserido no objeto

        mangas.stream()
                .forEach(e -> System.out.println(e));

        Set<Manga> manga = new LinkedHashSet<>(); // dessa forma e mantido a ordem de insercao. 

        manga.add(new Manga(3L, "Attack on titan", 23, 5));
        manga.add(new Manga(1L, "Berserk", 21, 4));
        manga.add(new Manga(2L, "Pokemon", 22, 2));
        manga.add(new Manga(4L, "Dragon Ball Z", 24, 1));
        manga.add(new Manga(4L, "Dragon Ball Z", 24, 1));
        manga.add(new Manga(5L, "Hellsing Ultimate", 25, 0));

    }
}
