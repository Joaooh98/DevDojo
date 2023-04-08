package academy.devdojo.maratonajava.introducao;

public class Aula08EstruturasCondicionaisP01 {
    public static void main(String[] args) {
        int idade = 25;
        boolean maiordeidade = idade > 18;
        // so entra no bloco se a condição for verdadeira.
        if (maiordeidade) {
            System.out.println("voce e maior de idade");
        }
        System.out.println("fora do if");
        
        if (maiordeidade == false) {
            System.out.println("dentro do if");
        }
        System.out.println("fora do if");
    }

}
