package academy.devdojo.maratonajava.javacore.Class30Association.domain;

public class Player {
    private String name;
    private Team team;
    // associação e o relacionamento entre 2 objetos (association and the relationship between 2 objects)

    // metodos 
    public void show() {
        System.out.println(this.name);
        if (team != null) { // condição feita para previnir de ocorrer nullpoiter
            System.out.println(team.getNameteam());
        }
    }

    // construtores 
    public Player(String name) {
        this.name = name;
    }
 
    // gets e seters 
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
     * @return Team return the team
     */
    public Team getTeam() {
        return team;
    }

    /**
     * @param team the team to set
     */
    public void setTeam(Team team) {
        this.team = team;
    }

}
