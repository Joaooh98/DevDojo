package academy.devdojo.maratonajava.javacore.Class50Colecoes.domain;

import java.util.Comparator;

public class MangaById implements Comparator<Manga> {

        @Override
        public int compare(Manga manga1, Manga manga2) {
            return manga1.getId().compareTo(manga2.getId());
        }
    
    }

