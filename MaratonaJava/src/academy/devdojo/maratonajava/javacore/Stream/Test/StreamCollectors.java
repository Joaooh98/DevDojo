package academy.devdojo.maratonajava.javacore.Stream.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import academy.devdojo.maratonajava.javacore.Stream.domain.LightNovel;

public class StreamCollectors {
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
        System.out.println(lightNovels.stream().count());
        System.out.println(lightNovels.stream().collect(Collectors.counting()));

        lightNovels.stream()
                .max(Comparator
                        .comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);

        lightNovels.stream()
                .collect(Collectors
                        .maxBy(Comparator
                                .comparing(LightNovel::getPrice)))
                .ifPresent(System.out::println);

        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice));
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        lightNovels.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);
        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));
        
        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);

        String titles = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);
    }
}
