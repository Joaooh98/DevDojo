package academy.devdojo.maratonajava.javacore.ColecoesClass50.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.ColecoesClass50.domain.Smartphone;

public class A04List {
    public static void main(String[] args) {

        var s1 = new Smartphone("1ABC1", "IPHONE11");
        var s2 = new Smartphone("1ABC1", "IPHONE12");
        var s3 = new Smartphone("22222", "IPHONE13");
        List<Smartphone> Smartphones = new ArrayList<>(6);

        Smartphones.add(s1);
        Smartphones.add(s2);
        Smartphones.add(s3);
        // Smartphones.clear(); // limpa o o conteudo do objeto

        for (Smartphone smartphone : Smartphones) {
            System.out.println(smartphone);
        }

        System.out.println("com stream");
        
        Smartphones.stream()
                    .forEach(e -> System.out.println(e));

        var s4 = new Smartphone("22222", "IPHONE13");
        // caso nao seja passado no parametro algum array que ja esta na lista ou declarado Smartphones.add(s4); o
        // metodo equals nao vai localizar o indice do array

        System.out.println(Smartphones.contains(s4)); //  retorna um valor booleano 
        int indexs4 = Smartphones.indexOf(s4); // verifica se esse indice desse objeto exite dentro do arrays, se nao  retorna -1
        System.out.println(Smartphones.get(indexs4)); // caso retorne o index sera imprido valor 

    }
}
