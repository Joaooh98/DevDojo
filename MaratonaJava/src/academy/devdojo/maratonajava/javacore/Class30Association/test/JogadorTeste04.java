package academy.devdojo.maratonajava.javacore.Class30Association.test;

import academy.devdojo.maratonajava.javacore.Class30Association.domain.Jogador;
import academy.devdojo.maratonajava.javacore.Class30Association.domain.Time;

public class JogadorTeste04 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("cafu");
        Jogador jogador1 = new Jogador("joao carlos");
        Time time = new Time("Brasil");
        Jogador[] jogadores={jogador, jogador1};
        
        jogador.setTime(time);// Atribui o valor dentro para o atributo Time do objeto Jogador 
        jogador1.setTime(time);
        time.setJogadors(jogadores); // Atribui o valor dentro para o Array Jogadores

        System.out.println("----------Jogador-----------");

        jogador.imprime();// chama o metodo do objeto Jogador

        System.out.println("------------time------------");

        time.imprime();// chama o metodo do objeto Time 
    }
}
