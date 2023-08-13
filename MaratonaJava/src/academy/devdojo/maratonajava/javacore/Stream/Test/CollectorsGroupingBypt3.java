package academy.devdojo.maratonajava.javacore.Stream.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import academy.devdojo.maratonajava.javacore.Stream.domain.Category;
import academy.devdojo.maratonajava.javacore.Stream.domain.LightNovel;

public class CollectorsGroupingBypt3 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel(" Art Online", 2.96, Category.DRAMA),
            new LightNovel(" Attack on Titan", 2.99, Category.ROMANCE),
            new LightNovel(" Re:Zero", 4.99, Category.DRAMA),
            new LightNovel(" Sword ", 1.97, Category.FANTASY),
            new LightNovel(" No Game No Life", 9.99, Category.FANTASY),
            new LightNovel(" Online", 1.98, Category.ROMANCE),
            new LightNovel(" Overlord ", 3.99, Category.FANTASY),
            new LightNovel(" The Irregular at Magic High School", 6.99, Category.DRAMA),
            new LightNovel(" Toradora! ", 7.99, Category.ROMANCE)));

    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        System.out.println("\n-----------------------\n");

        Map<Category, Optional<LightNovel>> collects = lightNovels.stream().collect(Collectors
                .groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));

        System.out.println(collects);
        System.out.println("\n-----------------------\n");
        
        Map<Category, LightNovel> collectsCorrets = lightNovels.stream().collect(Collectors
                .groupingBy(LightNovel::getCategory, Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));

        System.out.println(collectsCorrets);
        System.out.println("\n-----------------------\n");


    }
}
