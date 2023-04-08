package academy.devdojo.maratonajava.javacore.Class27builder.test;

import academy.devdojo.maratonajava.javacore.Class27builder.domain.Anime;

public class AnimeTest01C {
    public static void main(String[] args) {
        Anime anime = new Anime("Serie", 36, "Peaky Blinders", "thriller", "Katie Swinden"); // com o construtor e necessario declarar os valores dos atribuitos dentro da criação da referencia do objeto
        anime.showTheData();
     }
}
