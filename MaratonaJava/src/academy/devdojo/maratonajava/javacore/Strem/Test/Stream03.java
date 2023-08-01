package academy.devdojo.maratonajava.javacore.Strem.Test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Strem.domain.LightNovel;

public class Stream03 {
     private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
        new LightNovel("Sword Art Online", 1.99),
        new LightNovel("Sword Art Online", 1.99),
        new LightNovel("Sword Art Online", 1.99),
        new LightNovel("Re:Zero", 4.99),
        new LightNovel("Attack on Titan", 2.99),
        new LightNovel("Overlord ", 3.99),
        new LightNovel("The Irregular at Magic High School", 6.99),
        new LightNovel("No Game No Life", 9.99),
        new LightNovel("Toradora! ", 7.99))
        );
    public static void main(String[] args) {

        lightNovels.forEach(System.out::println);

    }
}
