package academy.devdojo.maratonajava.javacore.Strem.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GeneratingStreams {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println("\n---------------------------------------");
        IntStream.range(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println("\n---------------------------------------");

        Stream.of("Joao", "Carlos", "Paiva")
        .map(String::toUpperCase)
        .forEach(s -> System.out.print(s + " "));

        int num[] = {1,2,3,4,5}; 
        Arrays.stream(num).average().ifPresent(System.out::println);

        try (Stream<String> lines = Files.lines(Paths.get("text.txt"))) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("-----------------------------------");
        try (Stream<String> lines = Files.lines(Paths.get("file copy.xlsx"))) {
            lines
            .filter(l -> l.contains("sicred"))
            .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 