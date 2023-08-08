package academy.devdojo.maratonajava.javacore.Stream.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamFlatMap {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();

        List<String> graphicDesigners = List.of("joao", "pedro", "camargo");
        List<String> developers = List.of("Willian","David","Harisson");
        List<String> students = List.of("mauricio","renan","fabio","wesley");

        devdojo.add(students);
        devdojo.add(developers);
        devdojo.add(graphicDesigners);

        for (List<String> people: devdojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }

        System.out.println("\n ------------- com stream -----------------\n");

        devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
