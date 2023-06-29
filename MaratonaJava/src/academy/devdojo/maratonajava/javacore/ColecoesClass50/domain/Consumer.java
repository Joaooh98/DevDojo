package academy.devdojo.maratonajava.javacore.ColecoesClass50.domain;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Consumer {

    private long id;

    private String name;

    public Consumer(String name) {
        this.id = ThreadLocalRandom.current().nextLong();
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Consumer other = (Consumer) obj;
        return Objects.equals(id ,other.id);
    }

    @Override
    public String toString() {
        return "Consumer [id=" + id + ", name=" + name + "]";
    }

    public String getName() {
        return name;
    }
    

}
