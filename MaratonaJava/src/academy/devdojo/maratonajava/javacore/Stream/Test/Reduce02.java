package academy.devdojo.maratonajava.javacore.Stream.Test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Stream.domain.LightNovel;

public class Reduce02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Sword Art Online", 2.96),
            new LightNovel("Sword Art Online", 1.98),
            new LightNovel("Sword Art Online", 1.97),
            new LightNovel("Re:Zero", 4.99),
            new LightNovel("Attack on Titan", 2.99),
            new LightNovel("Overlord ", 3.99),
            new LightNovel("The Irregular at Magic High School", 6.99),
            new LightNovel("No Game No Life", 9.99),
            new LightNovel("Toradora! ", 7.99)));
    public static void main(String[] args) {
        lightNovels.stream()
        .map(LightNovel::getPrice)
        .filter(price -> price > 0).reduce(Double::sum)
        .ifPresent(System.out::println);

        double sum = lightNovels.stream()
        .mapToDouble(LightNovel::getPrice)
        .filter(price -> price > 0)
        .sum();

        System.out.println(sum);
    }
}
