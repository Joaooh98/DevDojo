package academy.devdojo.maratonajava.javacore.Class50Colecoes.test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class map { /// nao faz parte do projeto do devDojo
    public static void main(String[] args) {

        Map<String, Integer> mapa = new HashMap<>();

        mapa.put("João", 25);
        mapa.put("Maria", 30);
        mapa.put("Pedro", 40);

        System.out.println(mapa.get("Maria")); // e retorna o valor
        System.out.println(mapa.containsKey("João")); // busca pela chave
        System.out.println(mapa.containsValue(35)); // busca pelo valor

        mapa.remove("Pedro");
        System.out.println(mapa.size());

        Map<String, String> mapaa = new TreeMap<>();

        mapaa.put("C", "Café");
        mapaa.put("A", "Amora");
        mapaa.put("B", "Banana");
        //////////////////////////////////////////////////// for///////////////////////////////////////////////
        for (Map.Entry<String, String> entry : mapaa.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        //////////////////////////////////////////////////// stream///////////////////////////////////////////////
        Map<String, String> chaveValor = new HashMap<>();

        chaveValor.put("Chave1", "Valor1");
        chaveValor.put("Chave2", "Valor2");
        chaveValor.put("Chave3", "Valor3");

        chaveValor.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        /*
         * O método entrySet() para obter um Set de pares chave-valor do Map. Em
         * seguida, chamamos o método stream() para converter o Set em um Stream e, por
         * fim, utilizamos o método forEach() para iterar sobre cada elemento do Stream
         * e imprimir a chave e o valor correspondentes.
         */

        Map<Long, Boolean> bole = new HashMap<>();

        bole.put(100L, true);
        bole.put(200L, false);

        Boolean valor = bole.entrySet()
                .stream()
                .filter(entry -> entry.getKey() == 200L)
                .map(Map.Entry::getValue) // Map.Entry tem a utilidade de extrair os valores do mapa. é útil quando você
                                          // precisa manipular apenas os valores sem se preocupar com as chaves
                                          // associadas a eles
                .findFirst()
                .orElse(null);

        System.out.println(valor);
    }
}
