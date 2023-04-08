package academy.devdojo.maratonajava.introducao;

public class Aula17EstruturasDeRepeticao05Continue {
                                    // dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
                                    // condição valoParcela >= 1000  
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("parcelado em " + parcela + " de R$ " + valorParcela);
        }
    }
}
