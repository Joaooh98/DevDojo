package academy.devdojo.maratonajava.javacore.Lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

import academy.devdojo.maratonajava.javacore.Lambdas.Service.AnimeComparators;
import academy.devdojo.maratonajava.javacore.Lambdas.domain.Anime;

public class MethodReferencePt04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimecomparators = AnimeComparators::new;

        AnimeComparators animeComparators = newAnimecomparators.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Bersek", 5),
                new Anime("DragonBoll", 200),
                new Anime("DragonBoll", 500)));

        animeList.sort(animeComparators::compareByEpisodesNoStatic);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeFunction = (title, epsodes) -> new Anime(title, epsodes);
        BiFunction<String, Integer, Anime> animeFunctionLambdaWithMethodReference = Anime::new;
        System.out.println(animeFunction.apply("Naruto", 1000));
        System.out.println(animeFunctionLambdaWithMethodReference.apply("DragonBollGT", 2000));

    }
}
