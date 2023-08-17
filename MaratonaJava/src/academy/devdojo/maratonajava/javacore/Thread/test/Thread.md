YIELD:
    Uma dica para o escalonador de que o thread atual está disposto a ceder seu uso atual de um processador. O escalonador é livre para ignorar esta dica.

    Yield é uma tentativa heurística de melhorar a progressão relativa entre threads que, de outra forma, sobrecarregariam a CPU. Seu uso deve ser combinado com perfis detalhados e benchmarking para garantir que realmente tenha o efeito desejado.

    Raramente é apropriado usar esse método. Pode ser útil para fins de depuração ou teste, onde pode ajudar a reproduzir bugs devido a condições de corrida. Também pode ser útil ao projetar construções de controle de simultaneidade, como as do pacote java.util.concurrent.locks.

JOIN:
    Aguarda esse tópico morrer. Uma invocação deste método se comporta exatamente da mesma maneira que a invocação
    juntar(0):significado
    
    join()faz com que o thread atual, join()terminar sua execução, ai entao e execudado a proxima thread da sequencia. 
    Lances:

    InterruptedException - se algum thread interrompeu o thread atual. O status interrompido do thread atual é limpo quando essa exceção é lançada.

Concorrencia:

    * Basicamente significa que 2 threads estao acessando o mesmo objeto. 