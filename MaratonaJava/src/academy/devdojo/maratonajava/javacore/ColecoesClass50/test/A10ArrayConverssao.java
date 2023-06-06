package academy.devdojo.maratonajava.javacore.ColecoesClass50.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A10ArrayConverssao {
    public static void main(String[] args) {
        List<Integer> numeros =  new ArrayList<>();
        
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        Integer[] listToArrays = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArrays));

        System.out.println("-----------------");

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;
        
        List<Integer> arraystoList = Arrays.asList(numerosArray);
        
        arraystoList.set(0, 12);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arraystoList);

        System.out.println("-------------");
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosList.add(15);

        System.out.println(numerosList);

        List<String> strings = Arrays.asList("1", "2");
        System.out.println(strings);
       
        var stringss = List.of("1", "2");
        System.out.println(stringss);

    }
}
