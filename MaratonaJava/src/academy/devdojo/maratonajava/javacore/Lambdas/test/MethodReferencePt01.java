package academy.devdojo.maratonajava.javacore.Lambdas.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import academy.devdojo.maratonajava.javacore.Lambdas.Service.AnimeComparators;
import academy.devdojo.maratonajava.javacore.Lambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.Lambdas.domain.Person;
//Reference to a static method
public class MethodReferencePt01 {
    public static void main(String[] args) {

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Bersek", 5),
                new Anime("DragonBoll", 200),
                new Anime("DragonBoll", 500)));

        Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        System.out.println(animeList);

        Collections.sort(animeList, AnimeComparators::compareByEpisodes);
        System.out.println(animeList);

        Collections.sort(animeList, AnimeComparators::compareByTitle);
        System.out.println(animeList);

        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);

        animeList.sort(AnimeComparators::compareByTitle);
        System.out.println(animeList);

        Function<String, String> toUpperCaseFunction = String::toUpperCase;

        String resultado = toUpperCaseFunction.apply("hello");
        System.out.println(resultado);

        Person person = new Person("João");

        Function<Person, String> getNomeFunction = Person::getNome;

        String nome = getNomeFunction.apply(person);
        System.out.println(nome);
    }
}
