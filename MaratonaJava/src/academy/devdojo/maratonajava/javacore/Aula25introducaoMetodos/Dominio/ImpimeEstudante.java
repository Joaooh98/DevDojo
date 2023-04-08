package academy.devdojo.maratonajava.javacore.Aula25introducaoMetodos.Dominio;

public class ImpimeEstudante {
   
    public void imprimi(Estudante estudante) {
   
            System.out.println("\ndentro do objeto 'ImpimeEstudante' que esta fazendo referencia ao objeto 'Estudante'\n ");
            System.out.println(estudante.nome);
            System.out.println(estudante.idade+" anos ");
            System.out.println(estudante.sexo);
            System.out.println(estudante.altura+" cm");
            System.out.println(estudante.peso+" kg");

            estudante.nome = "gohan";
   }
}
