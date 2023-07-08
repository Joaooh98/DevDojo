package academy.devdojo.maratonajava.javacore.Class51Genercs.ConteudosComplementar.codigos;

public class Test {
    public static void main(String[] args) {
        
        Caixa<String> caixaDeTexto = new Caixa<>();
        caixaDeTexto.adicionar("Exemplo de texto");
        String texto = caixaDeTexto.obter();

        System.out.println(texto);
    }
}
