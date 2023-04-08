package academy.devdojo.maratonajava.javacore.Class30Association.test;

import academy.devdojo.maratonajava.javacore.Class30Association.domain.Player;

public class playedTest01 {
    public static void main(String[] args) {
        Player player0 = new Player("Pele");
        Player player1 = new Player("Maradona");
        Player player2 = new Player("Romario");

        Player[] players = {player0, player1, player2};

        for (Player player : players) {
            player.show();
        }
    }
}
