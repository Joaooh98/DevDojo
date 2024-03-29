package academy.devdojo.maratonajava.javacore.Class50Colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Class50Colecoes.domain.Manga;
import academy.devdojo.maratonajava.javacore.Class50Colecoes.domain.MangaById;

public class A09BinarySearch {
    public static void main(String[] args) {
        
        var MangasById = new MangaById();

        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(5L, "Hellsing Ultimate", 25));
        mangas.add(new Manga(3L, "Attack on titan", 23));
        mangas.add(new Manga(1L, "Berserk", 21));
        mangas.add(new Manga(2L, "Pokemon", 22));
        mangas.add(new Manga(4L, "Dragon Ball Z", 24));

        // Collections.sort(mangas);
        mangas.sort(MangasById);
        
        mangas.stream()
                .forEach(e -> System.out.println(e));
            
        var mangaToSearch = new Manga(4L, "Dragon Ball Z", 24);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch, MangasById));
    }
}
