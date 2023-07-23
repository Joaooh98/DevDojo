package academy.devdojo.maratonajava.javacore.Lambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdasConsumer {
    public static void main(String[] args) {
        List<String> stringsList = List.of("jose", "maria", "joao", "lucas");
        List<Integer> integers = List.of(1,2,3,4,5,6,7,8);

        forEach(stringsList, s -> System.out.println(s));
        forEach(integers, i -> System.out.println(i));

    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer){ // Consumer  e uma interface funcional @FunctionalInterface
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
