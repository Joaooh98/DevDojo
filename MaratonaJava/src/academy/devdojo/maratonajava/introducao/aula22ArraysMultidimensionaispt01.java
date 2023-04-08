package academy.devdojo.maratonajava.introducao;

public class aula22ArraysMultidimensionaispt01 {
    public static void main(String[] args) {
        // 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 dias
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 mes
        int[][] dias = new int[1][12];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;
        dias[0][3] = 30;
        dias[0][4] = 31;
        dias[0][5] = 30;
        dias[0][6] = 31;
        dias[0][7] = 31;
        dias[0][8] = 30;
        dias[0][9] = 31;
        dias[0][10] = 30;
        dias[0][11] = 31;
        System.out.println("----------------------------------- for-- aninhado----------------------\n");
        System.out.println("O código percorre a matriz bidimensional dias usando um loop for aninhado. O primeiro loop for percorre as linhas da matriz, enquanto o segundo loop for percorre as colunas da matriz. O método length é usado para obter o tamanho da matriz em cada dimensão. Dentro do loop interno, a mensagem é exibida com o número de dias em cada mês, usando o valor do elemento atual da matriz mais 1 (porque os meses são numerados de 1 a 12).\n");

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println("O mes " + (j+1) + " tem " + dias[i][j]+ " dias.\n");
            }
        }
        System.out.println("----------------------------------- foreach----------------------\n");
        System.out.println("Nesse exemplo, o loop for-each é usado para iterar sobre os valores da primeira (e única) linha da matriz dias. O valor de cada elemento da matriz é atribuído à variável diasMes em cada iteração. O índice i é utilizado para exibir o número do mês na mensagem.\n");
        System.out.println("----------------------------------- foreach----------------------\n");
        int mes = 1;
        for (int numDias : dias[0]) {
            System.out.println("O mes " + mes + " tem " + numDias + " dias.\n");
            mes++;
        }
        System.out.println("----------------------------------- while----------------------\n");
        System.out.println("Nesse exemplo, o loop while é usado para iterar sobre os valores da primeira (e única) linha da matriz dias. O índice i é utilizado para acessar os elementos da matriz e exibir o número do mês na mensagem.\n");
        System.out.println("----------------------------------- while----------------------\n");
        int i = 0;
        while (i < dias[0].length) {
        System.out.println("O mes de " + (i+1) + " tem " + dias[0][i] + " dias.\n");
        i++;
        }
    }
}