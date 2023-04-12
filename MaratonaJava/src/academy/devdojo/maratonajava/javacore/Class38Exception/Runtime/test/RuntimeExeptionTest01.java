package academy.devdojo.maratonajava.javacore.Class38Exception.Runtime.test;

public class RuntimeExeptionTest01 {
    public static void main(String[] args) {
        // Object object = null; // NullPointerException
        // System.out.println(object.toString());

        // int[] nums = {1,2}; // IndexOutOfBoundsException
        // System.out.println(nums[2]);
    }
}

/*
 * Unchecked são exeçoes nao verificadas exemplos (NullPoiterException,
 * NumbergFomatException, IndexOutOfBoundsException, ClassCastException)
 * 
 * Esses erros são comuns em Java e podem ocorrer por diversas razões. Aqui está
 * uma breve explicação sobre cada um deles:
 * 
 * NullPointerException: Esse erro ocorre quando um objeto de referência é nulo
 * (ou seja, não aponta para nenhum objeto) e uma tentativa de acesso a um
 * método ou campo é feita nesse objeto. Isso pode acontecer quando você tenta
 * chamar um método ou acessar um campo em uma variável de referência que não
 * foi devidamente inicializada ou quando um objeto foi definido como nulo.
 * 
 * NumberFormatException: Esse erro ocorre quando se tenta converter uma String
 * em um número, mas a String não possui o formato numérico correto. Por
 * exemplo, tentar converter uma String contendo letras ou caracteres especiais
 * em um valor numérico pode causar esse erro.
 * 
 * IndexOutOfBoundsException: Esse erro ocorre quando se tenta acessar um índice
 * inválido em uma estrutura de dados indexada, como um array ou uma lista. Por
 * exemplo, tentar acessar um índice maior do que o tamanho de um array ou menor
 * do que zero pode causar esse erro.
 * 
 * ClassCastException: Esse erro ocorre quando se tenta fazer uma conversão de
 * tipo incorreta, ou seja, quando se tenta atribuir uma referência de objeto a
 * uma variável de tipo incompatível. Isso pode acontecer, por exemplo, quando
 * se tenta fazer um cast (conversão de tipo) de um objeto para uma classe que
 * não é uma superclasse ou uma subclasse desse objeto.
 * 
 * Esses erros podem ser corrigidos por meio de uma análise cuidadosa do código
 * e identificação das causas raiz do problema. É importante garantir que as
 * variáveis de referência sejam corretamente inicializadas antes de serem
 * usadas, que as conversões de tipos sejam feitas de forma adequada e que os
 * índices de acesso a estruturas de dados sejam válidos. Além disso, é possível
 * usar mecanismos de tratamento de exceções em Java, como blocos try-catch,
 * para lidar com esses erros de forma adequada e evitar que o programa seja
 * encerrado abruptamente.
 */
// -------------------------------------------------------------------------------