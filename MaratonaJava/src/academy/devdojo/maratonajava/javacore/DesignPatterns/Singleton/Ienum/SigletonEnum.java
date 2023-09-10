package academy.devdojo.maratonajava.javacore.DesignPatterns.Singleton.Ienum;

import java.util.HashSet;
import java.util.Set;

public enum SigletonEnum {
    INSTANSE;
    private final Set<String> availableSeats;

    SigletonEnum() {
        this.availableSeats = new HashSet<>();
        this.availableSeats.add("A1");
        this.availableSeats.add("A1");
    }

    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }
}
