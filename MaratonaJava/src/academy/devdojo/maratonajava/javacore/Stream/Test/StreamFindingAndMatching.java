package academy.devdojo.maratonajava.javacore.Stream.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Stream.domain.LightNovel;

public class StreamFindingAndMatching {
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
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 9));
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 0));
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() < 0));
        
        System.out.println("-------------------");
        
        System.out.println(
                lightNovels.stream()
                        .filter(ln -> ln.getPrice() > 0)
                        .findAny());

        System.out.println("-------------------");

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);

        System.out.println("-------------------");

        System.out.println(lightNovels.stream().filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice)).findFirst());

        System.out.println("-------------------");

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("-------------------");
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);

    }
}
