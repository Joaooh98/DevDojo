package academy.devdojo.maratonajava.javacore.Stream.Test;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import academy.devdojo.maratonajava.javacore.Stream.domain.Category;
import academy.devdojo.maratonajava.javacore.Stream.domain.LightNovel;
import academy.devdojo.maratonajava.javacore.Stream.domain.Promotion;

public class CollectorsGroupingBypt4 {
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
                Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                                .collect(Collectors.groupingBy(LightNovel::getCategory,
                                                Collectors.summarizingDouble(LightNovel::getPrice)));
                System.out.println(collect);

                Map<Category, Set<Promotion>> collectOne = lightNovels.stream()
                                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors
                                                .mapping(CollectorsGroupingBypt4::getPromotion, Collectors.toSet())));
                System.out.println(collectOne);

                Map<Category, Set<Promotion>> collectTwo = lightNovels.stream()
                                .collect(Collectors.groupingBy(LightNovel::getCategory,
                                                Collectors.mapping(CollectorsGroupingBypt4::getPromotion,
                                                                Collectors.toCollection(LinkedHashSet::new))));
                System.out.println(collectTwo);

        }

        private static Promotion getPromotion(LightNovel ln) {
                return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
        }
}
