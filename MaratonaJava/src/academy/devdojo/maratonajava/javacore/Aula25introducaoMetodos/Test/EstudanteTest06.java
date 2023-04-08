package academy.devdojo.maratonajava.javacore.Aula25introducaoMetodos.Test;

import academy.devdojo.maratonajava.javacore.Aula25introducaoMetodos.Dominio.Estudante;

import academy.devdojo.maratonajava.javacore.Aula25introducaoMetodos.Dominio.ImpimeEstudante;

public class EstudanteTest06 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpimeEstudante impre = new ImpimeEstudante();

        estudante01.nome = "joao carlos";
        estudante01.idade = 25;
        estudante01.sexo = 'M';
        estudante01.altura = 180;
        estudante01.peso = 80;

        estudante02.nome = "Mayety";
        estudante02.idade = 30;
        estudante02.sexo = 'F';
        estudante02.altura = 160;
        estudante02.peso = 65;

        System.out.println("\nEstudante 01 dentro do metodo main\n");

        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade + " anos ");
        System.out.println(estudante01.sexo);
        System.out.println(estudante01.altura + " cm");
        System.out.println(estudante01.peso + " kg");

        System.out.println("\nEstudante 02 dentro do metodo main\n");

        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade + " anos ");
        System.out.println(estudante02.sexo);
        System.out.println(estudante02.altura + " cm");
        System.out.println(estudante02.peso + " kg");

        System.out.println("\nEstudante 01\n");
        impre.imprimi(estudante01);
        System.out.println("\nEstudante 02\n");
        impre.imprimi(estudante02);

        System.out.println(" #############################################################");
        System.out.println(" \n50 - Orientação Objetos - Métodos pt 07 - Parâmetros tipo referência pt 02\n");
        System.out.println(" \nmostrando resultado alterando os valores direto no objeto\n");

        impre.imprimi(estudante02);
        impre.imprimi(estudante02);

    }
}
