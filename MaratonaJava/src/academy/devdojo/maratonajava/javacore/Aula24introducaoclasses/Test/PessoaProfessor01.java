package academy.devdojo.maratonajava.javacore.Aula24introducaoclasses.Test;

import academy.devdojo.maratonajava.javacore.Aula24introducaoclasses.dominioo.PessoaProfessor;

public class PessoaProfessor01 {
    public static void main(String[] args) {
        PessoaProfessor professor = new PessoaProfessor();

        professor.nome = "Joao";
        professor.idade = 45;
        professor.sexo = 'M';
        professor.materia = "Matematica";

        System.out.println("nome :"+professor.nome+" idade: "+professor.idade+" anos, sexo: "+professor.sexo+", Materia: "+professor.materia);
    }
}
