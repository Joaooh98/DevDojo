package academy.devdojo.maratonajava.javacore.DesignPatterns.Singleton.domain;

import java.util.HashSet;
import java.util.Set;

// Eager initialization
public class AircraftLazy {
    private static AircraftLazy INSTANCE;
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private AircraftLazy(String name) {// cortando o acesso para que so seja possivel acessar pelo get
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public static AircraftLazy getInstance() { // pratica doubleLook
        if (INSTANCE == null) {
            synchronized (AircraftLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AircraftLazy("AirMustang");
                }
            }
        }
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
