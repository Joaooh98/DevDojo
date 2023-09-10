package academy.devdojo.maratonajava.javacore.DesignPatterns.Singleton.domain;

import java.util.HashSet;
import java.util.Set;
// Eager initialization
@SuppressWarnings("all")
public class AircraftEager {
    private static final AircraftEager INSTANCE = new AircraftEager("AirMustang");
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private AircraftEager(String name) {// cortando o acesso para que so seja possivel acessar pelo get
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public static AircraftEager getInstance() {
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
