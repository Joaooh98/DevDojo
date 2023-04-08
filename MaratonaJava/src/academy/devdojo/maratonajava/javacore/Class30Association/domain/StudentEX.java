package academy.devdojo.maratonajava.javacore.Class30Association.domain;

public class StudentEX {
    private String name;
    private int Age;
    private SeminarEX seminasS;

    
    public StudentEX(String name) {
        this.name = name;
    }

    public StudentEX(String name, int age) {
        this.name = name;
        this.Age = age;
    }
    
    public StudentEX(String name, int age, SeminarEX seminasS) {
        this.name = name;
        Age = age;
        this.seminasS = seminasS;
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

    /**
     * @return int return the Age
     */
    public int getAge() {
        return Age;
    }

    /**
     * @param Age the Age to set
     */
    public void setAge(int Age) {
        this.Age = Age;
    }

    public SeminarEX getSeminasS() {
        return seminasS;
    }

    public void setSeminasS(SeminarEX seminasS) {
        this.seminasS = seminasS;
    }

}
