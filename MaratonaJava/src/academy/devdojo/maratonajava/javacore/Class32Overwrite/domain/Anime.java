package academy.devdojo.maratonajava.javacore.Class32Overwrite.domain;

public class Anime extends Object {
    private String name;
    
    // Sobrescrita do método toString
    @Override
    public String toString(){
        return "Anime: " + this.name;
    }

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
