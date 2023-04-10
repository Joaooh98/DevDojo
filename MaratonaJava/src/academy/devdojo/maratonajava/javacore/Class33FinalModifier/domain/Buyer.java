package academy.devdojo.maratonajava.javacore.Class33FinalModifier.domain;

public final class Buyer {
    private String name;
    
    @Override
    public String toString() {
        return "Buyer [name=" + name + "]";
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
