package academy.devdojo.maratonajava.javacore.Stream.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import academy.devdojo.maratonajava.javacore.Stream.domain.Category;
import academy.devdojo.maratonajava.javacore.Stream.domain.LightNovel;

public class CollectorsGroupingBy {
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
        // Map<Category, List<LightNovel>> categoryLightNovalMap = new HashMap<>();

        // List<LightNovel> drama = new ArrayList<>();
        // List<LightNovel> fantasy = new ArrayList<>();
        // List<LightNovel> romance = new ArrayList<>();

        // for (LightNovel lightNovel : lightNovels) {
        //     switch (lightNovel.getCategory()) {
        //         case DRAMA:
        //             drama.add(lightNovel);
        //             break;
        //         case FANTASY:
        //             drama.add(lightNovel);
        //             break;
        //         case ROMANCE:
        //             drama.add(lightNovel);
        //             break;
        //     }
        // }
        // categoryLightNovalMap.put(Category.DRAMA, drama);
        // categoryLightNovalMap.put(Category.FANTASY, fantasy);
        // categoryLightNovalMap.put(Category.ROMANCE, romance);

        // System.out.println(categoryLightNovalMap);
        System.out.println("------------------------------------------------");

        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}
