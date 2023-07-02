package academy.devdojo.maratonajava.javacore.ColecoesClass50.test;

import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Stream;

public class A20Queue {
    public static void main(String[] args) {
        Queue<String> row = new PriorityQueue<>();

        row.add("c");
        row.add("b");
        row.add("a");

        row.stream().forEach(e -> System.out.println(e));

        System.out.println(row);

        var getElementOne = row.poll(); // Recupera e remove o início desta fila ou
        // retorna nulo se esta fila estiver vazia
        System.out.println(getElementOne);

        var peek = row.peek(); // Recupera e remove o início desta fila ou retorna
        // nulo se esta fila estiver vazia.
        System.out.println(peek);

        var remove = row.remove(); // executa com a mesma funcionalidade do poll
        // diferenca que retorna uma
        // exception caso esteja vazia
        System.out.println(remove);

        // var addAll = row.addAll(row);
        // System.out.println(addAll);

        // addAll = Adiciona todos os elementos da coleção especificada a esta
        // coleção
        // (operação
        // opcional). O comportamento desta operação é indefinido se a coleção
        // especificada for modificada enquanto a operação estiver em andamento.
        // (Isto implica que o comportamento desta chamada é indefinido se a coleção
        // especificada for esta coleção e esta coleção não estiver vazia.)

        var offer = row.offer("r"); // inclui o elemento na lista e retorna um boolean 
        System.out.println(offer);

        // offer = Insere o elemento especificado nesta fila se for possível fazê-lo
        // imediatamente sem violar as restrições de capacidade. Ao usar uma fila com
        // capacidade restrita, esse método geralmente é preferível a add(E), que
        // pode falhar ao inserir um elemento apenas lançando uma exceção.

        System.out.println(row);
        while (!row.isEmpty()) {
        System.out.println(row.poll());

        row.stream()
        .sorted()
        .forEach(System.out::println);

        // Neste exemplo, o método stream() cria um stream a partir dos elementos da
        // fila. Em seguida, o método sorted() é usado para ordenar os elementos em
        // ordem crescente. Por fim, o método forEach(System.out::println) é utilizado
        // para imprimir cada elemento do stream na saída padrão, resultando no mesmo
        // resultado obtido com o loop while e row.poll().

        Stream.generate(row::poll)
                .takeWhile(Objects::nonNull)
                .forEach(System.out::println);

        // Neste exemplo, o método generate cria um stream infinito chamando
        // repetidamente row.poll() para obter o próximo elemento da fila. O método
        // takeWhile é usado para interromper o stream quando row.poll() retornar null,
        // indicando que a fila está vazia. Em seguida, o método forEach é usado para
        // imprimir cada elemento do stream na saída padrão.

        }

    }
}
