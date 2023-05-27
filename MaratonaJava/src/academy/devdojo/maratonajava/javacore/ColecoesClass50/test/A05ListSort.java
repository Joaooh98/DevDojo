package academy.devdojo.maratonajava.javacore.ColecoesClass50.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A05ListSort {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        List<Double> valores = new ArrayList<>(6);
        mangas.add("Hellsing Ultimate");
        mangas.add("Attack on titan");
        mangas.add("Berserk");
        mangas.add("Pokemon");

        valores.add(20.56);
        valores.add(20.55);
        valores.add(20.57);
        valores.add(20.58);
        valores.add(20.54);
        valores.add(20.53);

        Collections.sort(valores); // ordena por valor 
        Collections.sort(mangas); // ordena por ordem alfabetica o arrays 
        // Collections.sort(objeto); so ordena se tiver somente um paramentro 
        valores.stream()
                .forEach(e->System.out.println(e));

        mangas.stream()
                .forEach(e->System.out.println(e));
    }
}
