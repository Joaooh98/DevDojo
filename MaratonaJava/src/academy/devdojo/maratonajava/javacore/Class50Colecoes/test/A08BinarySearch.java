package academy.devdojo.maratonajava.javacore.Class50Colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A08BinarySearch {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(0);
        numbers.add(9);
        numbers.add(7);
        numbers.add(8);

        // (-(ponto de inserção)-1)
        // index 0,1,2,3,4
        // value 2,0,9,7,8

        Collections.sort(numbers);
        System.out.println(Collections.binarySearch(numbers, 9));
        System.out.println(Collections.binarySearch(numbers, 3));

        /*
         * Para utilizar o binarySearch e necessario que a lista estaja ordenada
         * Collections.binarySearch(nome de referencia da lista, informa o valor retorna
         * o index)
         * 
         * caso o valor nao estaja no array sera retorna um valor negativo nao posição
         * onde deveria estar dentro do arrays
         */
    }
}
