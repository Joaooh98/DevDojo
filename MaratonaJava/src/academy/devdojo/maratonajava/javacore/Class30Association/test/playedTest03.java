package academy.devdojo.maratonajava.javacore.Class30Association.test;

import academy.devdojo.maratonajava.javacore.Class30Association.domain.Player;
import academy.devdojo.maratonajava.javacore.Class30Association.domain.Team;

public class playedTest03 {
    public static void main(String[] args) {
        Player player = new Player("Cafu");
        Player player2 = new Player("Romario");
        Team team = new Team("Brasil");
        Player [] players = {player, player2};

        player.setTeam(team);
        team.setPlayers(players);
       
        System.out.println("----player-----");
        
        player.show();
        

        System.out.println("----team-----");
        
        team.show();
    }
}
