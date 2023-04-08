package academy.devdojo.maratonajava.javacore.Aula25introducaoMetodos.Dominio;

public class Estudante {
    
    public int idade = 00;
    public String nome = "esta declado no objeto"; 
    public char sexo = 'O';
    public float altura = 0;
    public float peso = 0;

    public void imprime() {
        System.out.println("-----------utilizando o this para pegar os atributos do objeto------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
        System.out.println(this.altura);
        System.out.println(this.peso);

    }
    
}
