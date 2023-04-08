package academy.devdojo.maratonajava.javacore.Aula25introducaoMetodos.Test;

import academy.devdojo.maratonajava.javacore.Aula25introducaoMetodos.Dominio.Estudante;

public class EstudanteTest07 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        
        estudante.nome = "joao carlos";
        estudante.idade = 25;
        estudante.sexo = 'M';
        estudante.altura = 180;
        estudante.peso = 80;

        estudante.imprime();
    }
}
