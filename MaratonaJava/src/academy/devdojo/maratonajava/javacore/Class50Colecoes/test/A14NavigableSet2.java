package academy.devdojo.maratonajava.javacore.Class50Colecoes.test;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

import academy.devdojo.maratonajava.javacore.Class50Colecoes.domain.Manga;
import academy.devdojo.maratonajava.javacore.Class50Colecoes.domain.Smartphone;

class SmartPhoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone a0, Smartphone a1) {

        return a0.getMarca().compareTo(a1.getMarca());
    }

}

class MangaPrecoComparator implements Comparator<Manga> {

    // classe tem como objetivo de verificar caso esteja como parametro se esta
    // sendo adicionado na lista um produto com o mesmo preco

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class A14NavigableSet2 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartPhoneMarcaComparator());

        var smartphone = new Smartphone("123", "Nokia");

        set.add(smartphone);

        System.out.println(set);

        System.out.println("-----------------------------\n");

        NavigableSet<Manga> manga = new TreeSet<>(new MangaPrecoComparator());

        manga.add(new Manga(3L, "Attack on titan", 23, 5));
        manga.add(new Manga(1L, "Berserk", 21, 4));
        manga.add(new Manga(2L, "Pokemon", 22, 2));
        manga.add(new Manga(4L, "Dragon Ball Z", 24, 1));
        manga.add(new Manga(4L, "Dragon Ball Z", 24, 1));
        manga.add(new Manga(5L, "Hellsing Ultimate", 25, 0));

        // for (Manga manga2 : manga.descendingSet()) { // busca a lista ao contrario do
        // alfabeto
        // System.out.println(manga2);
        // }

        System.out.println("\n");

        manga.stream()
                .forEach(e -> System.out.println(e));

        System.out.println("\n");

        // manga.stream()
        // .sorted(Comparator.reverseOrder())
        // .forEach(System.out::println);

        System.out.println("-------------------");

        var yuyu = new Manga(21L, "drag", 21, 5); // usado como parametro para buscar os valores na lista

        // metodos que pode ser utilizado

        /*
         * lower < traz imediatamente o menor
         * floor <= traz o valor que esta proximo
         * higher > traz imediatamente o maior
         * ceiling >= traz o valor que esta proximo
         */

        System.out.println(manga.lower(yuyu)); // Retorna o maior elemento neste conjunto estritamente menor que o elemento fornecido ou nulo se tal elemento não existir.
        System.out.println(manga.floor(yuyu)); // O maior elemento menor ou igual a elemento, ou nulo se tal elemento não existir
        System.out.println(manga.higher(yuyu)); // O menor elemento maior que elemento, ou nulo se tal elemento não existir
        System.out.println(manga.ceiling(yuyu)); // O menor elemento maior ou igual a elemento, ou nulo se não houver tal elemento
        System.out.println("\n");
        System.out.println(manga.size()); // o número de elementos neste conjunto (sua cardinalidade)
        System.out.println(manga.pollFirst()); // o primeiro elemento, ou nulo se este conjunto estiver vazio
        System.out.println(manga.size());

    }
}

// manga.stream() cria um fluxo (stream) dos elementos contidos no conjunto
// manga.

// .sorted(Comparator.reverseOrder()) classifica os elementos em ordem
// decrescente usando o comparador reverseOrder(), que inverte a ordem natural
// dos elementos.

// .forEach(System.out::println) itera sobre cada elemento da stream e imprime-o
// no console.
