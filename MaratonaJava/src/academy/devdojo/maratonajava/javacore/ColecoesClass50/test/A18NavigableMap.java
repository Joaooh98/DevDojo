package academy.devdojo.maratonajava.javacore.ColecoesClass50.test;

import java.util.NavigableMap;
import java.util.TreeMap;

public class A18NavigableMap {
    public static void main(String[] args) {
        NavigableMap<String, String> navMap = new TreeMap<>();
            
            navMap.put("A", "Lentra A");            
            navMap.put("B", "Lentra B");            
            navMap.put("C", "Lentra C");            
            navMap.put("D", "Lentra D");            
            navMap.put("E", "Lentra E");            

           
        navMap.forEach((arg0, arg1) -> System.out.println(arg0+" - "+arg1)); // sera ordenado pela chave

        System.out.println(navMap.headMap("C"));
        System.out.println(navMap.headMap("C",true));
    }
}
