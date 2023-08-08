package academy.devdojo.maratonajava.javacore.Stream.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import academy.devdojo.maratonajava.javacore.Stream.domain.LightNovel;

/*
01. Order LightNovel by title
02. Retrieve the first 3 light movels with price less than 4 

01. Ordem LightNovel por título
02. Recupere as 3 primeiras lightNovels com preço inferior a 4
*/
public class Stream {
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
            lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
            List<String> titles = new ArrayList<>();
            for (LightNovel lightNovel : lightNovels) {
                if(lightNovel.getPrice() <=4){
                    titles.add(lightNovel.getTitle());
                }
                if (titles.size() >= 3) {
                    break;
                }
            }
            System.out.println(lightNovels);
            System.out.println(titles);
    }
        public static IntStream of(String string, String string2, String string3) {
            return null;
        }
}
