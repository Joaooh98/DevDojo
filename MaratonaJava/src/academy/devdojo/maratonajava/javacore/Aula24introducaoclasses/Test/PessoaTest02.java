package academy.devdojo.maratonajava.javacore.Aula24introducaoclasses.Test;

import academy.devdojo.maratonajava.javacore.Aula24introducaoclasses.dominioo.Pessoa;

public class PessoaTest02 {
    public static void main(String[] args) {
        System.out.println("\n-----------mostrando o valor direto do objeto--------------------\n");
        Pessoa estudante = new Pessoa();

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println("\n--------declarando o valor do objeto no MAIN-----------------\n");
        Pessoa estudantelocal = new Pessoa();

        estudantelocal.nome = "joao carlos de paiva";
        estudantelocal.idade = 24;
        estudantelocal.sexo = 'M';

        System.out.println(estudantelocal.nome);
        System.out.println(estudantelocal.idade);
        System.out.println(estudantelocal.sexo);

    }
}