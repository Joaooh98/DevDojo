package academy.devdojo.maratonajava.javacore.Class30Association.test;

import academy.devdojo.maratonajava.javacore.Class30Association.domain.Escola;
import academy.devdojo.maratonajava.javacore.Class30Association.domain.Professor;

public class Escolateste01 {
    public static void main(String[] args) {
        Professor professor = new Professor("jiraiya sensei");
        Professor[] professores = {professor};
        Escola escola = new Escola("konoha", professores);

        escola.imprime();
    }
}
