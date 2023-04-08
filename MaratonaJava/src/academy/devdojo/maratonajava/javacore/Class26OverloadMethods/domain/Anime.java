package academy.devdojo.maratonajava.javacore.Class26OverloadMethods.domain;

public class Anime {
    private String type;
    private int episodes;
    private String name;
    private String gender;

    public void init(String name,String type, int episodes){
        this.name =  name;  
        this.type = type;
        this.episodes = episodes;
    }
    public void init(String name,String type, int episodes, String gender){//using method overloading(utilizando a sobrecarga de metodos)
        this.init(name, type, episodes);
        this.gender = gender;
    }
    
    public void showData() {
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.name);
        System.out.println(this.gender);      
    }
        /**
     * @return String return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    /**
     * @return int return the episodes
     */
    public int getEpisodes() {
        return episodes;
    }
    /**
     * @param episodes the episodes to set
     */
    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    /**
     * @return int return the episodes
     */
    public void getname(String name) {
        this.name = name;
    }
    /**
    *  @param name the episodes to set 
    */
    public void setname(String name){
        this.name = name;
    }
    /**
     * @return String return the gender
     */
    public String getGender() {
        return gender;
    }
    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

}
