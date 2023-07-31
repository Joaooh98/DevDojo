https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html

Em Java, as expressões lambda são uma forma concisa de representar funções anônimas, permitindo que você escreva blocos de código de maneira mais compacta e legível. Essas expressões são usadas principalmente para implementar interfaces funcionais, que têm apenas um método abstrato. A partir da versão 8 do Java, as expressões lambda têm sido amplamente utilizadas para fornecer implementações rápidas de interfaces funcionais sem a necessidade de criar classes anônimas separadas.

Aqui está um resumo dos principais pontos sobre as expressões lambda:

    Sintaxe: A sintaxe básica de uma expressão lambda consiste em uma lista de parâmetros, o operador -> e o corpo da expressão. Por exemplo: (parâmetros) -> { corpo da expressão }.

    Interface Funcional: As expressões lambda são frequentemente usadas para implementar interfaces funcionais. Uma interface funcional é uma interface com apenas um método abstrato. Exemplos de interfaces funcionais nativas do Java incluem Runnable, Comparator, Consumer, Predicate e muitas outras.

    Exemplo Simples: Abaixo, um exemplo simples de como uma expressão lambda pode ser usada para implementar a interface funcional Runnable e executar uma tarefa em uma nova thread:

        Runnable runnable = () -> {
            System.out.println("Executando em uma nova thread!");
        };
        new Thread(runnable).start();


    Escopo: As expressões lambda têm acesso ao escopo das variáveis locais em que são definidas e podem acessar variáveis finais ou efetivamente finais. Variáveis que são reatribuídas não podem ser usadas em uma expressão lambda.

    Métodos de Interface Funcional: As interfaces funcionais podem conter métodos padrão (default methods) e métodos estáticos, além do método abstrato. Esses métodos podem ser acessados ​​usando referências de método (::) ou invocados em uma expressão lambda.

    Benefícios: As expressões lambda tornam o código mais conciso, facilitando a leitura e a manutenção. Elas também facilitam a criação de códigos paralelos e assíncronos com APIs como Streams e CompletableFuture.

Em resumo, as expressões lambda são uma adição poderosa ao Java, fornecendo uma maneira elegante e concisa de implementar interfaces funcionais e melhorar a legibilidade e a eficiência do código. Sua adoção tem sido ampla, especialmente com o aumento do uso de programação funcional em Java.