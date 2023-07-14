package academy.devdojo.maratonajava.introducao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Aula24StreamAndFor {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("A", "B", "C");
        List<Integer> list2 = Arrays.asList(1, 2, 3);

        int size = Math.min(list1.size(), list2.size());
        for (int i = 0; i < size; i++) {
            String element1 = list1.get(i);
            Integer element2 = list2.get(i);
            System.out.println(element1 + " - " + element2);
        }

        System.out.println("------------------------------");

        int sizeS = Math.min(list1.size(), list2.size());
        IntStream.range(0, sizeS)
                .forEach(i -> {
                    String element1 = list1.get(i);
                    Integer element2 = list2.get(i);
                    System.out.println(element1 + " - " + element2);
                });
                
        // Nesse exemplo, substituímos o loop tradicional pelo método IntStream.range(),
        // que gera uma sequência de inteiros de 0 (inclusivo) até o tamanho mínimo das
        // duas listas (exclusivo). Em seguida, utilizamos o método forEach() da stream
        // para iterar sobre os elementos dessa sequência.

        // Dentro do bloco forEach(), obtemos os elementos correspondentes de cada lista
        // usando o índice i e os imprimimos.

    }
}
