package academy.devdojo.maratonajava.javacore.Stream.Test;

import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);

        integers.stream()
                .reduce((x, y) -> x + y)
                .ifPresent(System.out::println);

        integers.stream()
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

        integers.stream()
                .reduce((x, y) -> x * y)
                .ifPresent(System.out::println);

    }
}
