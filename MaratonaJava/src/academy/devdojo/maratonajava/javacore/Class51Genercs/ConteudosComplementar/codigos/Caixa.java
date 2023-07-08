package academy.devdojo.maratonajava.javacore.Class51Genercs.ConteudosComplementar.codigos;

public class Caixa<T> {
    private T conteudo;
    
    public void adicionar(T item) {
        this.conteudo = item;
    }
    
    public T obter() {
        return this.conteudo;
    }

}