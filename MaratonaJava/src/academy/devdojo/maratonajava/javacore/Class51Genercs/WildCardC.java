package academy.devdojo.maratonajava.javacore.Class51Genercs;

import java.util.List;

public class WildCardC {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());

        // printConsult(dogs);
        // printConsult(cats);

    }

    // type erasure
    private static void printConsult(List<? extends Animal> animals) { // com a sintaxe ? extends sera aceito qualquer lista que extends animal
        for (Animal animal : animals) {
            animal.consult();
        }
// com a sintaxe (? extends) sera aceito qualquer lista que extends animal
// temos um contrado sendo assim nao e possivel adicionar nessa lista 
        // animals.add(new Dog());
        // animals.add(new Cat());

    }
}