package academy.devdojo.maratonajava.javacore.Class52Internas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Class51Genercs.domain.Boat;

class BoatNameComparator implements Comparator<Boat> {
    @Override
    public int compare(Boat o1, Boat o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class AnonymousClassB {
    public static void main(String[] args) {
        List<Boat> boatList = new ArrayList<>(List.of(new Boat("lancha"), new Boat("canoa")));
        boatList.sort(new Comparator<Boat>() {
            @Override
            public int compare(Boat o1, Boat o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(boatList);
    }
}
