package academy.devdojo.maratonajava.javacore.Class26OverloadMethods.test;

import academy.devdojo.maratonajava.javacore.Class26OverloadMethods.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        
        anime.init("Dexter", "TV", 12, "Ação");
        anime.showData();

    } 
}
