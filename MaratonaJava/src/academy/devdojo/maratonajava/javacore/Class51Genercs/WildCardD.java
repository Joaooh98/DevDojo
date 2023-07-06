package academy.devdojo.maratonajava.javacore.Class51Genercs;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class WildCardD {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());

        printConsult(dogs);
        printConsult(cats);
        List<Animal> animals = new ArrayList<>(); 
        printConsultAnimal(animals);
    }

    // type erasure
    private static void printConsult(List<? extends Animal> animals) { // com a sintaxe ? extends sera aceito qualquer
                                                                       // lista que extends animal
        for (Animal animal : animals) {
            animal.consult();
        }
    }
    private static void printConsultAnimal(List<? super Animal> animals){
        animals.add(new Dog());
        animals.add(new Cat());
    }
}
/*
 * por que e possivel add no metodo printConsultAnimal e no printConsult nao?
 * R: no metodo printConsult com o "extends" e possivel adicionar somente um unico objeto 
 * R: printConsultAnimal com o "super" tenho a garantia do polimorfismo que sera adicionado um objeto que extends a classe animal  
 */



// palavra-chave extends é usada para indicar que uma dada classe herda de
// outra.