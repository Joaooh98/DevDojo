package academy.devdojo.maratonajava.javacore.Class50Colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Class50Colecoes.domain.Manga;

public class A06Mangas {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(5L,"Hellsing Ultimate",25));
        mangas.add(new Manga(3L, "Attack on titan",23));
        mangas.add(new Manga(1L, "Berserk",21));
        mangas.add(new Manga(2L, "Pokemon",22));
        mangas.add(new Manga(4L, "Dragon Ball Z",24));
        
        mangas.stream()
            .forEach(e->System.out.println(e));

            Collections.sort(mangas);
            System.out.println("-------------------");
        mangas.stream()
        .forEach(e->System.out.println(e));

        for (Manga a01Sort : mangas) {
            System.out.println(a01Sort);
        }
    }
}
