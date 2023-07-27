package academy.devdojo.maratonajava.javacore.Lambdas.Service;

import academy.devdojo.maratonajava.javacore.Lambdas.domain.Anime;

public class AnimeComparators {
    public static int compareByEpisodes(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());

    }

    public static int compareByTitle(Anime a1, Anime a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public int compareByEpisodesNoStatic(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }
}
