package academy.devdojo.maratonajava.javacore.ColecoesClass50.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import academy.devdojo.maratonajava.javacore.ColecoesClass50.domain.Manga;

public class A11Iterator {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        
        mangas.add(new Manga(5L, "Hellsing Ultimate", 25, 0));
        mangas.add(new Manga(3L, "Attack on titan", 23, 5));
        mangas.add(new Manga(1L, "Berserk", 21, 4));
        mangas.add(new Manga(2L, "Pokemon", 22, 2));
        mangas.add(new Manga(4L, "Dragon Ball Z", 24, 1));
        
        Iterator<Manga> mangaIterator = mangas.iterator();
        while(mangaIterator.hasNext()){
            if (mangaIterator.next().getQuantidade() == 0) {
                mangaIterator.remove();
            }
        }
        System.out.println(mangas);

        System.out.println("\n--------------------\n");
        mangas.removeIf(man -> man.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
