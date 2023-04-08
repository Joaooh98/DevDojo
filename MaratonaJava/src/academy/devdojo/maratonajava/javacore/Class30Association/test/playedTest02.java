package academy.devdojo.maratonajava.javacore.Class30Association.test;

import academy.devdojo.maratonajava.javacore.Class30Association.domain.Player;
import academy.devdojo.maratonajava.javacore.Class30Association.domain.Team;

public class playedTest02 {
    public static void main(String[] args) {
        Player player0 = new Player("Pele");
        Team team = new Team("Seleção Brasileira");

        player0.setTeam(team);

        player0.show();
    }
}
