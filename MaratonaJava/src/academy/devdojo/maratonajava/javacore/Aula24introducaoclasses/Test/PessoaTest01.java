package academy.devdojo.maratonajava.javacore.Aula24introducaoclasses.Test;
import academy.devdojo.maratonajava.javacore.Aula24introducaoclasses.dominioo.Pessoa;//esta importando o objeto Pessoa criado na pasta dominio 

public class PessoaTest01 {
 public static void main(String[] args) {
            
    Pessoa estudante = new Pessoa(); // cria e pega os atributos do objeto Pessoa// 
    
    // pega os valores da classe Pessoa utilizadno a variavel de referencia 'estudante'
    
    estudante.nome = "joao carlos de paiva";
    estudante.idade = 25;
    estudante.sexo = 'M';

    System.out.println(estudante.nome);
    System.out.println(estudante.idade);
    System.out.println(estudante.sexo);
 }   
}
