package academy.devdojo.maratonajava.javacore.Class50Colecoes.domain;

import java.util.Comparator;

public class SmartPhoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone a0, Smartphone a1) {

        return a0.getMarca().compareTo(a1.getMarca());
    }

}