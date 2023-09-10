package academy.devdojo.maratonajava.javacore.DesignPatterns.Singleton.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import academy.devdojo.maratonajava.javacore.DesignPatterns.Singleton.domain.AircraftLazy;

// https://refactoring.guru/pt-br/design-patterns/singleton
public class SingletonLazyTest {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
            IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        bookSeat("1A");
        bookSeat("1A");
        System.out.println(AircraftLazy.getInstance());
        System.out.println(AircraftLazy.getInstance());
        // chamando duas vezes vamo ter o mesmo objeto em memoria

        // isso e extremamente errado caso vc encontre tem que rebenta na porrada de quem fez 
        Constructor<AircraftLazy> constructor = AircraftLazy.class.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        AircraftLazy newInstance = constructor.newInstance("AirMustang");

        System.out.println(newInstance);
    }

    private static void bookSeat(String seat) {
        System.out.println(AircraftLazy.getInstance());
        AircraftLazy instance = AircraftLazy.getInstance();
        System.out.println(instance.bookSeat(seat));
    }
}
