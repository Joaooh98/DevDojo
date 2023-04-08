package academy.devdojo.maratonajava.javacore.Class27builder.domain;

public class Anime {
    private String type;
    private int episodes;
    private String name;
    private String gender;
    private String producer;

    // obs: contrutores sempre vai ser inicializado primeiro que os metodos 
    
    public Anime(String type, int episodes, String name, String gender) {
        this.type = type;
        this.episodes = episodes;
        this.name = name;
        this.gender = gender;
    }
    public Anime(String type, int episodes, String name, String gender, String producer){
        this(type, episodes, name, gender);
        this.producer = producer;

    }
    public void showTheData() {
        System.out.println("Name: "+this.name);
        System.out.println("Episodes: "+this.episodes);
        System.out.println("Type: "+this.type);
        System.out.println("Gender: "+this.gender);
        System.out.println("Producer: "+this.producer);

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
