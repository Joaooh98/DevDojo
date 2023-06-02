package academy.devdojo.maratonajava.javacore.ColecoesClass50.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A08BinarySearch {
    public static void main(String[] args) {
        List<Integer> numbers =  new ArrayList<>();
        
        numbers.add(2);
        numbers.add(0);
        numbers.add(9);
        numbers.add(7);
        numbers.add(8);
        
        // (-(ponto de inserção)-1)
        // index 0,1,2,3
        // value 0,2,3,4

        Collections.sort(numbers);
        System.out.println(Collections.binarySearch(numbers, 9));
        System.out.println(Collections.binarySearch(numbers, -1));

    }
}
