package academy.devdojo.maratonajava.javacore.ColecoesClass50.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import academy.devdojo.maratonajava.javacore.ColecoesClass50.domain.A01Sort;

class MangasById implements Comparator<A01Sort> {

    @Override
    public int compare(A01Sort manga1, A01Sort manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }

}

public class A09BinarySearch {
    public static void main(String[] args) {
        List<A01Sort> mangas = new ArrayList<>(6);

        mangas.add(new A01Sort(5L, "Hellsing Ultimate", 25));
        mangas.add(new A01Sort(3L, "Attack on titan", 23));
        mangas.add(new A01Sort(1L, "Berserk", 21));
        mangas.add(new A01Sort(2L, "Pokemon", 22));
        mangas.add(new A01Sort(4L, "Dragon Ball Z", 24));

        mangas.stream()
                .forEach(e -> System.out.println(e));

        Collections.sort(mangas, new MangasById());
        
        System.out.println("-----------------------------");

        mangas.stream()
                .forEach(e -> System.out.println(e));
            
        var mangaToSearch = new A01Sort(2L, "Dragon Ball Z", 24);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch));
    }
}
