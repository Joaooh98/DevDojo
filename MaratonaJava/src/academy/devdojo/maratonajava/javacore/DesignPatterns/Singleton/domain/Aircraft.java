package academy.devdojo.maratonajava.javacore.DesignPatterns.Singleton.domain;

import java.util.HashSet;
import java.util.Set;
@SuppressWarnings("all")
public class Aircraft {
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;
    

    public Aircraft(String name) {
        this.name = name;
    }
    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }
    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }
    
    public Set<String> getAvailableSeats() {
        return availableSeats;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Aircraft [availableSeats=" + availableSeats + ", name=" + name + "]";
    }
    
}
