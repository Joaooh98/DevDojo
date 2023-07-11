package academy.devdojo.maratonajava.javacore.Class52Internas;

class Animal {
    public void walk() {
        System.out.println("Animal walking");
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void walk() {
                System.out.println("walking in the shadows");
            }
        };

        animal.walk();
    }
}
