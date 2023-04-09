package academy.devdojo.maratonajava.javacore.Overwrite.domain;

public class Anime {
    private String name;
    

    public Anime(String name) {
        this.name = name;
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
