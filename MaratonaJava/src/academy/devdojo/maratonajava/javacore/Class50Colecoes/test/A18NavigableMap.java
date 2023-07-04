package academy.devdojo.maratonajava.javacore.Class50Colecoes.test;

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

        navMap.forEach((arg0, arg1) -> System.out.println(arg0 + " - " + arg1)); // sera ordenado pela chave

        System.out.println(navMap.headMap("C")); // retorna todo o navMap antes  a letra C
        System.out.println(navMap.headMap("C", true)); // retorna todo o navMap ate a letra C
        System.out.println(navMap.ceilingKey("C"));//Returns the least key greater than or equal to the given key, or null if there is no such key.
        System.out.println(navMap.ceilingEntry("C"));//Returns a key-value mapping associated with the least key greater than or equal to the given key, or null if there is no such key
        System.out.println(navMap.higherKey("C"));//Returns the least key strictly greater than the given key, or null if there is no such key.
        System.out.println(navMap.higherEntry("C"));//Returns a key-value mapping associated with the least key strictly greater than the given key, or null if there
        System.out.println(navMap.lowerKey("C"));//Returns the greatest key strictly less than the given key, or null if there is no such key.
        System.out.println(navMap.lowerEntry("C"));//Returns a key-value mapping associated with the greatest key strictly less than the given key, or null if there is no such key
        System.out.println(navMap.floorKey("C"));//Returns the greatest key less than or equal to the given key, or null if there is no such key.
        System.out.println(navMap.floorEntry("C"));//Returns a key-value mapping associated with the greatest key less than or equal to the given key, or null if there is no such key.
    }
}
