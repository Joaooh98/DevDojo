package academy.devdojo.maratonajava.javacore.Class50Colecoes.test;

import java.util.HashMap;
import java.util.Map;

public class A15hashMap {
    public static void main(String[] args) {

        // interface //chave valor// ref sera ordenado baseado no hash
        Map<String, String> map = new HashMap<>();
        /*
         * nao e permitido chave duplicado
         */
        map.put("tecrado", "teclado");
        map.put("mause", "mouse");
        map.put("vc", "voce"); // caso seja add um valor com a mesma chave usando o "put" sera substituido
        map.put("vc", "voc");
        map.putIfAbsent("vc", "voc"); // dessa forma so sera add caso nao exista.

        System.out.println(map);

        System.out.println("\nvalores\n");

        for (String key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("\nvalores\n");

        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("\nchave e valores\n");

        for (String keyValue : map.keySet()) {
            System.out.println(keyValue + ":" + map.get(keyValue));
        }

        System.out.println("\nchave e valores\n");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}