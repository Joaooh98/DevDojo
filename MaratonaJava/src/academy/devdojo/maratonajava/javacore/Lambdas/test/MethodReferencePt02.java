package academy.devdojo.maratonajava.javacore.Lambdas.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Lambdas.Service.AnimeComparators;
import academy.devdojo.maratonajava.javacore.Lambdas.domain.Anime;

// Reference to an instance method of a particular object.
// Referência a um método de instância de um objeto específico
public class MethodReferencePt02 {
    public static void main(String[] args) {
        var animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Bersek", 5),
                new Anime("DragonBoll", 200),
                new Anime("DragonBoll", 500)));

        animeList.sort(animeComparators::compareByEpisodesNoStatic);
        animeList.sort((a1 ,a2)-> animeComparators.compareByEpisodesNoStatic(a1, a2)); // sem funcao lambda
        System.out.println(animeList);
        
    }
}