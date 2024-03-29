package academy.devdojo.maratonajava.javacore.Stream.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import academy.devdojo.maratonajava.javacore.Stream.domain.LightNovel;

/*
01. Order LightNovel by title
02. Retrieve the first 3 light movels with price less than 4 

01. Ordem LightNovel por título
02. Recupere as 3 primeiras lightNovels com preço inferior a 4
*/
public class Stream02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
        new LightNovel("Sword Art Online", 1.99),
        new LightNovel("Re:Zero", 4.99),
        new LightNovel("Attack on Titan", 2.99),
        new LightNovel("Overlord ", 3.99),
        new LightNovel("The Irregular at Magic High School", 6.99),
        new LightNovel("No Game No Life", 9.99),
        new LightNovel("Toradora! ", 7.99))
        );
        public static void main(String[] args) {
            
            List<String> titles = lightNovels.stream()
                                .sorted(Comparator.comparing(LightNovel::getTitle))
                                .filter(ln -> ln.getPrice() <= 4)
                                .limit(3)
                                .map(LightNovel::getTitle)
                                .collect(Collectors.toList());
            System.out.println(titles);

    }
}
