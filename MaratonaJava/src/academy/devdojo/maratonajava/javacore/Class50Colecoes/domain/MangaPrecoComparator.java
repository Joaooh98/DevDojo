package academy.devdojo.maratonajava.javacore.Class50Colecoes.domain;

import java.util.Comparator;

public class MangaPrecoComparator implements Comparator<Manga> {

    // classe tem como objetivo de verificar caso esteja como parametro se esta
    // sendo adicionado na lista um produto com o mesmo preco

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}