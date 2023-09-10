package academy.devdojo.maratonajava.javacore.DesignPatterns.Singleton.test;

import academy.devdojo.maratonajava.javacore.DesignPatterns.Singleton.domain.Aircraft;

// https://refactoring.guru/pt-br/design-patterns/singleton
public class NotSingletonTest {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        var aircraft = new Aircraft("AirMustang");
        System.out.println(aircraft.bookSeat(seat));
    }
}
