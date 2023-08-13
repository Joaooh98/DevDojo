- Benchmarck
    melhor forma de ver se o parallelStream esta atrapalhando ou ajudando no seu codigo. 

    Os benchmarks geralmente envolvem a execução de testes padronizados que simulam situações reais de uso. Os resultados dos testes são comparados com outros sistemas ou com padrões de referência, permitindo que os usuários tomem decisões informadas sobre quais dispositivos ou software são mais adequados às suas necessidades.

- Unboxing | boxing

    "Unboxing" e "boxing" são termos relacionados à manipulação de tipos de dados em programação, especialmente em linguagens que suportam programação orientada a objetos. Eles se referem a dois conceitos diferentes:

Unboxing:
O unboxing é o processo de converter um tipo de valor de um objeto (geralmente um objeto de uma classe wrapper) para seu tipo de valor primitivo correspondente. Isso geralmente é necessário quando se trabalha com coleções genéricas em linguagens como Java, C# e outras. Por exemplo, ao recuperar um valor inteiro de uma lista, o unboxing converteria o objeto Integer (wrapper) para um int (primitivo).
    
    Exemplo em Java:

    java

    Integer wrapperInt = new Integer(42);
    int primitiveInt = wrapperInt.intValue(); // Unboxing

Boxing:
O boxing é o processo inverso do unboxing. É a conversão de um tipo de valor primitivo para o tipo de objeto correspondente (classe wrapper). Isso é útil em situações em que você precisa armazenar valores primitivos em coleções que requerem objetos, como Listas ou Mapas.

    Exemplo em Java:

    java

    int primitiveInt = 42;
    Integer wrapperInt = Integer.valueOf(primitiveInt); // Boxing

Portanto, unboxing se refere à extração do valor primitivo de um objeto de classe wrapper, enquanto boxing se refere à criação de um objeto de classe wrapper a partir de um valor primitivo. Ambos os conceitos são importantes para garantir a integridade dos tipos de dados ao trabalhar com programação orientada a objetos e coleções genéricas.

- Nao e idicado o uso com (limit, findFirst, findAny)

- Custo total da computacao N,P

- Qauntidade de dados caso seja pequena nao e indicado o uso. 

- Tipos de colecoes

- Tamanho definido e necessario. 

- Processamento merge

quais os senarios mais indicados para uso:
 
    O uso da função parallelStream ou de qualquer processamento paralelo deve ser considerado cuidadosamente, pois nem sempre é apropriado para todas as situações. O cenário ideal para o uso de parallelStream envolve uma combinação de fatores que tornam o processamento paralelo vantajoso em termos de desempenho e eficiência. Aqui estão alguns cenários em que o uso de parallelStream pode ser benéfico:

    Grandes Volumes de Dados:
    Quando você está lidando com grandes conjuntos de dados que precisam ser processados, o parallelStream pode ser vantajoso. O processamento paralelo pode dividir o trabalho entre várias threads, permitindo que você aproveite os recursos de processamento multicore disponíveis em sistemas modernos.

    Operações Intensivas:
    Se as operações que você deseja realizar em cada elemento da coleção são intensivas em termos de CPU ou demandam bastante tempo de processamento, o parallelStream pode ajudar a acelerar essas operações dividindo o trabalho entre várias threads.

    Operações Independentes:
    O parallelStream é mais eficaz quando as operações em cada elemento da coleção são independentes umas das outras. Isso permite que as threads processem os elementos sem depender umas das outras, resultando em um melhor aproveitamento do paralelismo.

    Redução de Overhead:
    Quando o overhead introduzido pelo paralelismo (como a criação e gerenciamento de threads) é menor em comparação com os benefícios obtidos com o processamento paralelo. Isso geralmente ocorre quando as operações individuais são suficientemente complexas para superar os custos de paralelismo.

    Maior Desempenho:
    Em muitos casos, o parallelStream pode resultar em um aumento significativo no desempenho, especialmente quando você possui um hardware com vários núcleos de CPU e deseja aproveitar ao máximo esses recursos.

    Testes e Otimização:
    O parallelStream é uma ferramenta que deve ser testada e otimizada para cada cenário específico. Realize testes de desempenho para avaliar se o processamento paralelo está realmente proporcionando melhorias significativas para a sua situação.

    É importante lembrar que o uso inadequado de parallelStream pode levar a problemas de concorrência, aumento do consumo de memória e desempenho inferior em determinados cenários. Portanto, avalie cuidadosamente o tamanho dos dados, a natureza das operações, as necessidades de desempenho e as considerações de concorrência antes de decidir se o parallelStream é apropriado para o seu caso.