package academy.devdojo.maratonajava.javacore.ColecoesClass50.test;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

import academy.devdojo.maratonajava.javacore.ColecoesClass50.domain.Manga;
import academy.devdojo.maratonajava.javacore.ColecoesClass50.domain.Smartphone;

class SmartPhoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone a0, Smartphone a1) {

        return a0.getMarca().compareTo(a1.getMarca());
    }

}

public class A13NavigableSet {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartPhoneMarcaComparator());

        var smartphone = new Smartphone("123", "Nokia");

        set.add(smartphone); // sera lancado uma Exception , porque o java tenta comparar para verirficar se
                             // o Smarphone e um coparable.

        System.out.println(set);

        System.out.println("-----------------------------\n");

        NavigableSet<Manga> manga = new TreeSet<>();

        manga.add(new Manga(3L, "Attack on titan", 23, 5));
        manga.add(new Manga(1L, "Berserk", 21, 4));
        manga.add(new Manga(2L, "Pokemon", 22, 2));
        manga.add(new Manga(4L, "Dragon Ball Z", 24, 1));
        manga.add(new Manga(4L, "Dragon Ball Z", 24, 1));
        manga.add(new Manga(5L, "Hellsing Ultimate", 25, 0));

        manga.stream().forEach(e -> System.out.println(e));

        /// qual o a situcao que deve utilizar
        
        // quando a classe que esta sendo criado a colecao, implementa Comparable caso
        /// nao esteja sendo implementado deve ter certeza que esta craido um
        /// comparator, importante resaltar que toda vez que for inserir um elemento o
        /// propio TreeSet vai reordenar a colecao baseado no valor ou do compareTo
        /// criado. tbm nao aceita valo duplicado na lista
    }
}

// public class A13NavigableSet {
// public static void main(String[] args) {
// NavigableSet<Smartphone> set = new TreeSet<>(new
// SmartPhoneMarcaComparator());

// var smartphone = new Smartphone("123", "Nokia");

// set.add(smartphone); // sera lancado uma Exception , porque o java tenta
// comparar para verirficar se o Smarphone e um coparable.

// }
