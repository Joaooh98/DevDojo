package academy.devdojo.maratonajava.javacore.Class51Genercs;

abstract class Animal {
    public abstract void consult();

}

class Dog extends Animal {

    @Override
    public void consult() {
        System.out.println("hello my dog");
    }
}

class Cat extends Animal {
    @Override
    public void consult() {
        System.out.println("hello cat");
    }
}

public class WildCardB {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog()};
        Cat[] cats = {new Cat(), new Cat()};

        printConsult(dogs);
        printConsult(cats);

        Animal[] animals = {new Cat(), new Dog()};
        System.out.println(
            "adicionando os dois objetos de animais no mesmo array"
        );printConsult(animals);
    }

    private static void printConsult(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consult();
        }

        // animals[0] = new Cat(); // Exception in thread "main" java.lang.ArrayStoreException: 
    }
}
