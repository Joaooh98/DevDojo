package academy.devdojo.maratonajava.javacore.DesignPatterns.Singleton.test;

import academy.devdojo.maratonajava.javacore.DesignPatterns.Singleton.domain.AircraftEager;

// https://refactoring.guru/pt-br/design-patterns/singleton
public class SingletonEagerTest {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        AircraftEager instance = AircraftEager.getInstance();
        System.out.println(instance.bookSeat(seat));
    }
}
