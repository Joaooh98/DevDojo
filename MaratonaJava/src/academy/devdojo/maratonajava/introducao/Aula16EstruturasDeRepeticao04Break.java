package academy.devdojo.maratonajava.introducao;

public class Aula16EstruturasDeRepeticao04Break {
    public static void main(String[] args) {
        // dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
        // condição valoParcela >= 1000
        double valorTotal = 30000;

        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valoParcela = valorTotal / parcela;
            if (valoParcela < 1000) {
                break;
            }
            System.out.println("parcelado em " + parcela + " de R$ " + valoParcela);
        }
    }
}