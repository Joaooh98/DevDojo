package academy.devdojo.maratonajava.javacore.Class28InitiationBlocks.test;

import academy.devdojo.maratonajava.javacore.Class28InitiationBlocks.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episode : anime.getEpisodes()) {
            System.out.print(episode+" ");
        }
        anime.setName("\nserie");
        System.out.println(anime.getName());
    }
}
