package academy.devdojo.maratonajava.javacore.Class33FinalModifier.domain;

public class Car {
    private String name;
    public static final double LIMIT_SPEED = 250; //  declarando variavel constante nao podera mais ser atribuido valor. 
 

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
