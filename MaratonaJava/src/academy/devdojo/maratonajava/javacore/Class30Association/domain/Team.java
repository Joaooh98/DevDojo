package academy.devdojo.maratonajava.javacore.Class30Association.domain;

public class Team {
    private String nameteam;
    private Player [] players;


    public Team(String nameteam) {
        this.nameteam = nameteam;
    }

    public Team(String nameteam, Player[] players) {
        this.nameteam = nameteam;
        this.players = players;
    }

    public void show() {
        System.out.println(this.nameteam);
        if (players == null) return; {
            for (Player player : players) {
                System.out.println(player.getName());
            }
        }
    }
    /**
     * @return String return the nameteam
     */
    public String getNameteam() {
        return nameteam;
    }

    /**
     * @param nameteam the nameteam to set
     */
    public void setNameteam(String nameteam) {
        this.nameteam = nameteam;
    }


    /**
     * @return Player [] return the players
     */
    public Player [] getPlayers() {
        return players;
    }

    /**
     * @param players the players to set
     */
    public void setPlayers(Player [] players) {
        this.players = players;
    }

}
