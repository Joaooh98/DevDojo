package academy.devdojo.maratonajava.javacore.DesignPatterns.Singleton.test;

import academy.devdojo.maratonajava.javacore.DesignPatterns.Singleton.Ienum.SigletonEnum;

public class SingletonEnumTest {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        System.out.println(SigletonEnum.INSTANSE.hashCode());
        SigletonEnum instance = SigletonEnum.INSTANSE;

        System.out.println(instance.bookSeat(seat));
    }
}
