package academy.devdojo.maratonajava.javacore.ColecoesClass50.test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class map { /// essa aula deve ser revista 
    public static void main(String[] args) {
        
        Map<String, Integer> mapa = new HashMap<>();
        
        mapa.put("João", 25);
        mapa.put("Maria", 30);
        mapa.put("Pedro", 40);
        
        System.out.println(mapa.get("Maria")); // Saída: 30
        System.out.println(mapa.containsKey("João")); // Saída: true
        System.out.println(mapa.containsValue(35)); // Saída: false
        
        mapa.remove("Pedro");
        System.out.println(mapa.size()); // Saída: 2

        Map<String, String> mapaa = new TreeMap<>();
        
        mapaa.put("C", "Café");
        mapaa.put("A", "Amora");
        mapaa.put("B", "Banana");
        
        for (Map.Entry<String, String> entry : mapaa.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

