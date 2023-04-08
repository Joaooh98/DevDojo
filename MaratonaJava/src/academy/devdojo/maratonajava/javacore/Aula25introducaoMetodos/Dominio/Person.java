package academy.devdojo.maratonajava.javacore.Aula25introducaoMetodos.Dominio;
// acoplamento aula 54 - Orientação Objetos - Modificador de acesso private, get e set pt 01
public class Person {
     private String name;
     private int age;



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
     * @return int return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

}
